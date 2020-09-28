package com.Whatsappweb.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.Whatsappweb.Entity.WhatsappUser;
//import com.facebook.entity.FacebookUser;

//import com.Whatsappweb.Utility.WhatsappServiceInterface;

public class WhatsappDao implements WhatsappDaoInterface {
	private Connection con;
	
	public WhatsappDao() {
	
			try {
				Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				con=DriverManager.getConnection("jdbc:derby:d:/firstdb;create=true","akspreet","aks");
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		
		
	}
	@Override
	public int createProfileDao(WhatsappUser u) throws Exception {
		// TODO Auto-generated method stub
		int i=-1;
		
		//3. create query
		PreparedStatement ps= con.prepareStatement("insert into facebook values(?,?,?,?)"); //dynamic query
		ps.setString(1,u.getName());
		ps.setString(4,u.getPassword());
		ps.setString(3,u.getEmail());
		ps.setString(2,u.getAddress());
		
		i=ps.executeUpdate();
		return i;
	}

	@Override
	public boolean loginProfileDao(WhatsappUser u) {
		// TODO Auto-generated method stub
		boolean i=false;
		try {
			PreparedStatement ps=con.prepareStatement("select * from facebook where name=? and password=?");
			ps.setString(1, u.getName());
			ps.setString(2, u.getPassword());
			
			
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
	public List<WhatsappUser> friendlistDao(WhatsappUser f) {
		// TODO Auto-generated method stub
		
		List<WhatsappUser> ll=new ArrayList<WhatsappUser>();
		WhatsappUser fe=new WhatsappUser();
		fe.setName("neha");
		fe.setPassword("mbsdn");
		
		WhatsappUser f1=new WhatsappUser();
		f1.setName("xyz");
		f1.setPassword("sahbv");
		
		ll.add(f1);
		ll.add(fe);
		/*try {
			PreparedStatement ps=con.prepareStatement("select * from friendlist where name=?");
			ps.setString(1, iu.getName());
		
			
			
			//step 4 executeQuery
			ResultSet res=ps.executeQuery();
			while(res.next()) {
				FacebookEmployee f=new FacebookEmployee();
				f.setName(res.getString(1));
				f.setAddress(res.getString(4));
				ll.add(f);
			}
							
			
		}
		catch(SQLException ee) {
			ee.printStackTrace();
		}*/
		return ll;

	}

}
