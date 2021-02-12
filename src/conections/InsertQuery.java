package conections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertQuery {

	public static void main(String[] args) throws Exception {
		
		String url = "jdbc:mysql://localhost:9080/rcords";
		String uname = "root";
		String pass = "root";
		String query = "insert into students values(4,'Aman','mumbai') ";
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		int count = st.executeUpdate(query);
		
		System.out.println(count + " row/s affected");
		
		st.close();
		con.close();
		
		
		

	}

}
