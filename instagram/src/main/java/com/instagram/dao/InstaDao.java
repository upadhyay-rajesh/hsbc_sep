package com.Instagram.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Instagram.utility.InstaException;

import InstaEntity.InstaUser;

public class InstaDao implements InstaDaoInterface{

	@Override
	public int createProfileDao(InstaUser u) throws Exception {
		// TODO Auto-generated method stub
		//loading driver
		int i=5;
		/*Connection con=null;
		try {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		//Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		//creating connection
		con= DriverManager.getConnection("jdbc:derby:d:/firstdb1;create=true","akspreet","aks");
		
		PreparedStatement ps=con.prepareStatement("insert into instagram values(?,?,?)");
		ps.setString(1, u.getName());
		ps.setString(2, u.getPassword());
		ps.setString(3, u.getEmail());
		//ps.setString(4, u.getAddress());
		
		 i=ps.executeUpdate();
		}
		catch(ClassNotFoundException | SQLException e1){
			e1.printStackTrace();
			
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		*/
		File f1=new File("d:/hsbc_file/one.txt");
		
		FileOutputStream out=new FileOutputStream(f1,true);
		
		String name=u.getName();
		String password=u.getPassword();
		String email=u.getEmail();
		
		for(int j =0; j<name.length(); j++)
			out.write(name.charAt(j));
		
		for(int j =0; j<password.length(); j++)
			out.write(password.charAt(j));
		
		
		for(int j =0; j<email.length(); j++)
			out.write(email.charAt(j));
		
		out.close();
		
		return i;
				
		
	}

	@Override
	public boolean checkProfileDao(InstaUser u)  {
		int i=0;
		List<InstaUser> l=new ArrayList<InstaUser>();
		Connection con=null;
		try {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		//Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		//creating connection
		con= DriverManager.getConnection("jdbc:derby:d:/firstdb1;create=true","akspreet","aks");
		
		PreparedStatement ps=con.prepareStatement("select * from instagram where name=? and password=?");
		ps.setString(1, u.getName());
		ps.setString(2, u.getPassword());
		ResultSet res=ps.executeQuery();
		
		
		while(res.next())
		{
			InstaUser uu=new InstaUser();
			uu.setName(res.getString(1));
			uu.setPassword(res.getString(2));
			uu.setEmail(res.getString(3));
			
			l.add(uu);
		}
		
		 i=l.size();
		 }
		catch(ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
			
		}
		
		
		/*finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		 return i>0;
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void editProfileDao(InstaUser u)  {
		// TODO Auto-generated method stub
		/*Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con=DriverManager.getConnection("jdbc:derby:d:/firstdb1;create=true","akspreet","aks");
		
		PreparedStatement ps=con.prepareStatement("select * from instagram where name=?");
		ps.setString(1, u.getName());*/
	}

	@Override
	public List<InstaUser> viewProfileDao() throws InstaException {
		// TODO Auto-generated method stub
		List<InstaUser> l=new ArrayList<InstaUser>();
		try {
		
		Connection con=null;
		
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		con=DriverManager.getConnection("jdbc:derby:d:/firstdb1;create=true","akspreet","aks");
		
		PreparedStatement ps=con.prepareStatement("select * from instagram");
		
		ResultSet res=ps.executeQuery();
		
		
		while(res.next()) {
			InstaUser uu=new InstaUser();
			uu.setName(res.getString(1));
			uu.setPassword(res.getString(2));
			uu.setEmail(res.getString(3));
			
			l.add(uu);
		}
		
		
		if(l.size()==0) {
			throw new InstaException();}
		
	}
		catch(ClassNotFoundException|SQLException ee) {
			ee.printStackTrace();
		}
		
		return l;
		}
		
		/*finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}*/
		
	

	@Override
	public boolean deleteProfileDao(InstaUser u){
		// TODO Auto-generated method stub
		Connection con=null;
		int i=0;
		try {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		con=DriverManager.getConnection("jdbc:derby:d:/firstdb1;create=true","akspreet","aks");
		PreparedStatement ps=con.prepareStatement("delete from  instagram where name=?");
		ps.setString(1, u.getName());
		i=ps.executeUpdate();
		}
		
		catch(ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i>0;
		
		
	}

	@Override
	public boolean editNameDao(InstaUser u){
		// TODO Auto-generated method stub
		Connection con=null;
		int i=0;
		try {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		con=DriverManager.getConnection("jdbc:derby:d:/firstdb1;create=true","akspreet","aks");
		PreparedStatement ps=con.prepareStatement("update instagram set name=?  where email=?");
		ps.setString(2, u.getEmail());
		ps.setString(1, u.getName());
		i=ps.executeUpdate();
		}
		catch(ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i>0;
	}

	@Override
	public boolean editPasswordDao(InstaUser u)  {
		// TODO Auto-generated method stub
		Connection con=null;
		int i=0;
		try {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		con=DriverManager.getConnection("jdbc:derby:d:/firstdb1;create=true","akspreet","aks");
		PreparedStatement ps=con.prepareStatement("update instagram set password=?  where name=?");
		ps.setString(1, u.getPassword());
		ps.setString(2, u.getName());
		i=ps.executeUpdate();
		}
		
		catch(ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i>0;
	}

	@Override
	public boolean editEmailDao(InstaUser u) {
		// TODO Auto-generated method stub
		Connection con=null;
		int i=0;
		try {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		con=DriverManager.getConnection("jdbc:derby:d:/firstdb1;create=true","akspreet","aks");
		PreparedStatement ps=con.prepareStatement("update instagram set email=?  where name=?");
		ps.setString(2, u.getName());
		ps.setString(1, u.getEmail());
		i=ps.executeUpdate();
		}
		
		catch(ClassNotFoundException | SQLException e1) {
			e1.printStackTrace();
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return i>0;
	}

	

}
