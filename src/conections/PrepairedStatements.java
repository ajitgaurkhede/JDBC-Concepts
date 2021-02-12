package conections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class PrepairedStatements {

	public static void main(String[] args) throws Exception {
	
		String url ="jdbc:mysql://localhost:9080/rcords";

		String Username = "root";
		String Pass = "root";
		String query = "insert into students values (?,?,?)";
		
		int id = 6;
		String name = "Rajesh";
		String city = "pune";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection(url,Username,Pass);
		PreparedStatement ps = con.prepareStatement(query);
		
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, city);
		
		int count = ps.executeUpdate();
		
		System.out.println(count + " rows/s affected");
		
		ps.close();
		con.close();
		
		
		


	}

}
