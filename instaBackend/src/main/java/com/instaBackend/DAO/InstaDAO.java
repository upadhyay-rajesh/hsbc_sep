package com.instaBackend.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.instaBackend.entity.User;

@Repository
public class InstaDAO implements InstaDAOInterface {

	private Connection con;
	
	public InstaDAO() {
		try {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		con=DriverManager.getConnection("jdbc:derby:/home/rkdgr8/Downloads/instaDB;create=true","ravi","ravi");
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public int createUser(User u) {
		
		int i=0;
		
		try {
		PreparedStatement ps=con.prepareStatement("insert into users values(?,?,?,?)");
		ps.setString(1, u.getId());
		ps.setString(2, u.getPassword());
		ps.setString(3, u.getName());
		ps.setString(4, u.getEmail());
		
		i=ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return i;
	}
	
	public List<User> getAllUsers(){
		
		List<User> users = new ArrayList<User>();
		
		try {
			PreparedStatement ps=con.prepareStatement("select name, email, id from users");
			ResultSet res=ps.executeQuery();
			
			while(res.next()) {
				User currUser = new User();
				currUser.setName(res.getString(1));
				currUser.setEmail(res.getString(2));
				currUser.setId(res.getString(3));
				users.add(currUser);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return users;
		
	}


	@Override
	public void deleteUser(String id) {
		// TODO Auto-generated method stub
		try {
			PreparedStatement ps =  con.prepareStatement("delete from users where id=?");
			ps.setString(1, id);
			ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
