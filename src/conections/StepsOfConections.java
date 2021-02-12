package conections;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * 1. import ----------> java.sql
 * 2. load and register the driver --> com.mysql.jdbc.Driver
 * 3. Create connection
 * 4.create a statement
 * 5. execute the query
 * 6. process the results
 * 7. close
 * 
 * 
 * 	*/


public class StepsOfConections {

	public static void main(String[] args) throws Exception  {
		
		
		String url = "jdbc:mysql://localhost:9080/rcords";
		String uname = "root";
		String pass = "root";
		String query = "select * from students";
		
		
		Class.forName("com.mysql.cj.jdbc.Driver"); // load driver
		Connection con = DriverManager.getConnection(url,uname,pass);
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery(query);
		
		while(rs.next()) {
			
			System.out.println("ID ="+rs.getInt(1)+"Name ="+rs.getString(2)+"City ="+ rs.getString(3));

		}
		
		
		st.close();
		con.close();
		}
	
		
		

	}


