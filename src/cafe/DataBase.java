package cafe;

import java.sql.Connection;
import java.sql.DriverManager;

public class DataBase {
	
	 static Connection connection() {
			
			try {
				
				//Class.forName("com.mysql.jdbc.Driver");
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cafe","root","");
				
				
				
				return con;
				
			}catch(Exception e) {
				
				System.out.println(e);
				return null;
			}
			
			
		}

}
