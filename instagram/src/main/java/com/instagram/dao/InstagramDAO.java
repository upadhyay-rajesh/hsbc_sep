package com.instagram.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.instagram.entity.InstagramUser;

public class InstagramDAO implements InstagramDAOInterface {

	public int createProfileDAO(InstagramUser iu)throws Exception {
		
		int i=0;
		
		//step 1 load driver
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		
		//Class.forName("oracle.jdbc.driver.OracleDriver");
		//Class.forName("com.mysql.jdbc.Driver");
		
		//step 2 create connection with database
		Connection con=DriverManager.getConnection("jdbc:derby:d:/firstdb1;create=true","rajesh","rajesh");
		
		
		//step 3 create query
		PreparedStatement ps=con.prepareStatement("insert into instagramuser values(?,?,?,?)");
		ps.setString(1, iu.getName());
		ps.setString(2, iu.getPassword());
		ps.setString(3, iu.getEmail());
		ps.setString(4, iu.getAddress());
		
		//step 4 executeQuery
		i=ps.executeUpdate();
						
		return i;

	}

	public void editProfileDAO() throws Exception{
		// TODO Auto-generated method stub

	}

	public void deleteProfileDAO()throws Exception {
		// TODO Auto-generated method stub

	}

	public List<InstagramUser> searchProfileDAO(InstagramUser iu)throws Exception {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con=DriverManager.getConnection("jdbc:derby:d:/firstdb1;create=true","rajesh","rajesh");
		PreparedStatement ps=con.prepareStatement("select * from instagramuser where name=?");
		ps.setString(1, iu.getName());
		
		ResultSet res=ps.executeQuery();
		
		List<InstagramUser> ll=new ArrayList<InstagramUser>();
		
		while(res.next()) {
			InstagramUser uu=new InstagramUser();
			uu.setName(res.getString(1));
			uu.setPassword(res.getString(2));
			uu.setEmail(res.getString(3));
			uu.setAddress(res.getString(4));
			
			ll.add(uu);
		}
		
		return ll;

	}

	public List<InstagramUser> viewallProfileDAO()throws Exception {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con=DriverManager.getConnection("jdbc:derby:d:/firstdb1;create=true","rajesh","rajesh");
		PreparedStatement ps=con.prepareStatement("select * from instagramuser");
				
		ResultSet res=ps.executeQuery();
		
		List<InstagramUser> ll=new ArrayList<InstagramUser>();
		
		while(res.next()) {
			InstagramUser uu=new InstagramUser();
			uu.setName(res.getString(1));
			uu.setPassword(res.getString(2));
			uu.setEmail(res.getString(3));
			uu.setAddress(res.getString(4));
			
			ll.add(uu);
		}
		
		return ll;

	}

	public InstagramUser viewProfileDAO(InstagramUser iu) throws Exception{
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con=DriverManager.getConnection("jdbc:derby:d:/firstdb1;create=true","rajesh","rajesh");
		PreparedStatement ps=con.prepareStatement("select * from instagramuser where name=?");
		ps.setString(1, iu.getName());
		
		ResultSet res=ps.executeQuery();
		//how to verify resultset is having result or not
		//via next() method, if next() method will return true then resultset have some result otherwise no result
		
		InstagramUser uu=null;
		
		if(res.next()) {
			uu=new InstagramUser();
			uu.setName(res.getString(1));
			uu.setPassword(res.getString(2));
			uu.setEmail(res.getString(3));
			uu.setAddress(res.getString(4));
		}
		return uu;
		
	}

}















