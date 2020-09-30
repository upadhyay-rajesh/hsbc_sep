package com.facebookweb.DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.facebookweb.entity.FacebookUser;

public class FacebookDAO implements FacebookDAOInterface {

	private Connection con;
	
	public FacebookDAO() {
		try {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		con=DriverManager.getConnection("jdbc:derby:/home/rkdgr8/mydb;create=true","ravi","ravi");
		}
		catch(ClassNotFoundException|SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public int createProfile(FacebookUser f) {
		// TODO Auto-generated method stub
		int i=0;
	
		try {
		PreparedStatement ps=con.prepareStatement("insert into facebookuser values(?,?,?,?)");
		ps.setString(1,f.getName());
		ps.setString(2,f.getEmail());
		ps.setString(3, f.getAddress() );
		ps.setString(4, f.getPassword());
		
		
		i=ps.executeUpdate();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
		return i;
	}

	@Override
	public boolean loginProfile(FacebookUser fUser) {
		// TODO Auto-generated method stub
		boolean i=false;
		try {
			PreparedStatement ps=con.prepareStatement("select * from facebookuser where name=? and password=?");
			ps.setString(1, fUser.getName());
			ps.setString(2, fUser.getPassword());
			
			
			//step 4 executeQuery
			ResultSet res=ps.executeQuery();
			if(res.next()) {
				i=true;
			}
							
			
		}
		catch(SQLException ee) {
			ee.printStackTrace();
		}
		return i;
		
	}

	@Override
	public boolean doesUserExist(FacebookUser fUser) {
		// TODO Auto-generated method stub
		boolean emailExists = false;
		try {
		PreparedStatement ps=con.prepareStatement("select * from facebookuser where email=?");
		ps.setString(1, fUser.getEmail());
		 ResultSet res=ps.executeQuery();
			if(res.next()) {
				emailExists =true;
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}

		return emailExists;
	}

	@Override
	public List<String> getSuggestions(String s) {
		// TODO Auto-generated method stub
		List<String> allCities = new ArrayList();
		allCities.add("Mumbai");
		allCities.add("Kolkata");
		allCities.add("Chennai");
		allCities.add("Ahmedabad");
		
		List<String> result = new ArrayList();
		for(String city:allCities) {
			if(city.contains(s)) {
				result.add(city);
			}
			
		}
		
		return result;
	}

}
