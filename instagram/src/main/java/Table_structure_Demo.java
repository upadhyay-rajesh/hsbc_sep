import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;

public class Table_structure_Demo {

	public static void main(String[] args)throws Exception {
		Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		Connection con=DriverManager.getConnection("jdbc:derby:d:/firstdb1;create=true","rajesh","rajesh");
		PreparedStatement ps=con.prepareStatement("select * from instagramuser");
				
		ResultSet res=ps.executeQuery();
		
		ResultSetMetaData rs=res.getMetaData();
		int i=rs.getColumnCount();
		
		for(int j=1;j<=i;j++) {
			System.out.println("Name is "+rs.getColumnName(j));
			System.out.println("type is "+rs.getColumnTypeName(j));
			System.out.println("size is "+rs.getColumnDisplaySize(j));
		}

	}

}
