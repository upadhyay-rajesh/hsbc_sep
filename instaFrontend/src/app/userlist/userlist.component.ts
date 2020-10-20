import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service'
import { User } from '../user'
import { NgForm } from '@angular/forms';

@Component({
  selector: 'userlist',
  templateUrl: './userlist.component.html',
  styleUrls: ['./userlist.component.css']
})
export class UserlistComponent implements OnInit {

  users: User[];
  newUser: User = new User();
  editing: boolean = false;
  editingUser: User = new User();

  constructor(
    private userService: UserService,
  ) { }

  ngOnInit(): void {
    this.getUsers();
  }

  getUsers(): void {
    this.userService.getUsers()
      .then(users => this.users = users);
  }
  createUser(userForm: NgForm): void {
    this.userService.createUser(this.newUser)
      .then(myNewUser => {
        userForm.reset();
        this.newUser = new User();
        this.users.unshift(myNewUser);
      })
  }

  editUser(user: User): void {
    this.editing = true;
    Object.assign(this.editingUser, user);
  }

  doneEditing(): void {
    this.editing = false;
    let existingUser = this.users.find(user => user.id === this.editingUser.id);
    Object.assign(existingUser, this.editingUser);
    this.cancelEditing();
  }

  cancelEditing(): void {
    this.editing = false;
    this.editingUser = new User();
  }

  deleteUser(id: String): void {
    this.userService.deleteUser(id).then(() => this.users = this.users.filter(user => user.id !== id))
  }
}
