import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user'

@Injectable()
export class UserService {
  private baseUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  getUsers(): Promise<User[]> {
    return this.http.get(this.baseUrl + '/api/users')
      .toPromise()
      .then(res => res as User[])
      .catch(this.handleError)
  }

  createUser(userObj: User): Promise<User> {
    return this.http.post(this.baseUrl + '/api/users', userObj)
      .toPromise().then(res => res as User)
      .catch(this.handleError);
  }

  deleteUser(id: String): Promise<any> {
    return this.http.delete(this.baseUrl + '/api/users/' + id)
      .toPromise()
      .catch(this.handleError);
  }

  private handleError(error: any): Promise<any> {
    console.error('Some error occured', error);
    return Promise.reject(error.message || error);
  }
}
