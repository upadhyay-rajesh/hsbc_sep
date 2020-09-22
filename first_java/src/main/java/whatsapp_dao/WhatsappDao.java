package whatsapp_dao;
import java.util.ArrayList;
import java.util.List;
import java.io.File;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import whatsapp_dao.WhatsappDaoInterface;
import whatsapp_entity.WhatsappUser;
public class WhatsappDao implements WhatsappDaoInterface {

	@Override
	public int createProfileDao(WhatsappUser wu) throws Exception{
//		System.out.println(wu.getName());
//		System.out.println(wu.getNumber());
//		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
//		
//		Connection con = DriverManager.getConnection("jdbc:derby:/home/rkdgr8/mydb","ravi", "ravi");
//		PreparedStatement ps = con.prepareStatement("insert into whatsappuser values(?,?)");
//		
//		ps.setString(1, wu.getName());
//		ps.setString(2, wu.getNumber());
//		
//		int i = ps.executeUpdate();
		File f1 = new File("/home/rkdgr8/newdir/two.txt");
		FileOutputStream out = new FileOutputStream(f1,true);
		out.write('\n');
		for(int i=0;i<wu.getName().length();i++) {
			out.write(wu.getName().charAt(i));
		}
		out.write(' ');
		for(int i=0;i<wu.getNumber().length();i++) {
			out.write(wu.getNumber().charAt(i));
		}
		
		return 1;
	}

	@Override
	public void editProfileDao() {
		// TODO Auto-generated method stub
		System.out.println("whatsapp profile edited");
		

	}

	@Override
	public WhatsappUser deleteProfileDao(WhatsappUser wu) throws Exception {
		return wu;
		// TODO Auto-generated method stub
		
	}

	@Override
	public WhatsappUser viewProfileDao(WhatsappUser wuser) throws Exception {
		// TODO Auto-generated method stub
		
		
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		
		Connection con = DriverManager.getConnection("jdbc:derby:/home/rkdgr8/mydb","ravi", "ravi");
		PreparedStatement ps = con.prepareStatement("select * from whatsappuser where name=?");
		ps.setString(1, wuser.getName());
		
		ResultSet res = ps.executeQuery();
		
		WhatsappUser wu = new WhatsappUser();
		if(res.next()) {
			wu.setName(res.getString(1));
			wu.setNumber(res.getString(2));
		}
		return wu;
		
	}

	@Override
	public List<WhatsappUser> searchProfileDao(WhatsappUser wuser) throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		
		Connection con = DriverManager.getConnection("jdbc:derby:/home/rkdgr8/mydb","ravi", "ravi");
		PreparedStatement ps = con.prepareStatement("select * from whatsappuser where name=?");
		ps.setString(1, wuser.getName());
		
		ResultSet res = ps.executeQuery();
		
		List<WhatsappUser> wlist = new ArrayList<WhatsappUser>();
		
		while(res.next()) {
			WhatsappUser wu = new WhatsappUser();
			wu.setName(res.getString(1));
			wu.setNumber(res.getString(2));
			wlist.add(wu);
		}
		return wlist;
	}

	@Override
	public List<WhatsappUser> viewAllProfileDao() throws Exception {
		// TODO Auto-generated method stub
		
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		
		Connection con = DriverManager.getConnection("jdbc:derby:/home/rkdgr8/mydb","ravi", "ravi");
		PreparedStatement ps = con.prepareStatement("select * from whatsappuser");
		
		ResultSet res = ps.executeQuery();
		
		List<WhatsappUser> wlist = new ArrayList<WhatsappUser>();
		
		while(res.next()) {
			WhatsappUser wu = new WhatsappUser();
			wu.setName(res.getString(1));
			wu.setNumber(res.getString(2));
			wlist.add(wu);
		}
	return wlist;
		
	}

	

}
