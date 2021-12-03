package BA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Unternehmen {

	public static void main(String[] args) {
		
	     System.out.println("MySQl Connect Example V2 AWS");
	     
	     Connection conn = null;
	     
	     String url = "jdbc:mysql://3.69.96.96:3306/";
	     String dbName = "db5";
	     String driver = "com.mysql.cj.jdbc.Driver";
	     String userName = "db5";
	     String password = args[0];
	     
	     try {
	    	 
	    	 Class.forName(driver);
	    	 conn = DriverManager
	    			.getConnection(url + dbName,  userName, password);
	    	 System.out.println("Connected to the database");
	    	 
	    	 Statement stmt = conn.createStatement ();
	    	 ResultSet rs;
	    	 
	    	 rs = stmt.executeQuery("SELECT Unternehmen_ID, Name, Anschrift, Kontakt, Passwort, Bachelorarbeit_ID FROM unternehmen");
	    	 
	    	 while (rs.next()) {
	    			int unternehmen_id = rs.getInt("Unternehmen_ID");
	    			String name = rs.getString("Name");
	    			String anschrift = rs.getString("Anschrift");
	    			String kontakt = rs.getString("Kontakt");
	    			String passwort = rs.getString("Passwort");
	    			int bachelorarbeit_id = rs.getInt("Bachelorarbeit_ID");
	    		
	    			System.out.println("Unternehmen ID: "+unternehmen_id+" Name: "+name+" Anschrift: "+anschrift+" Kontakt: "+kontakt+" Passwort: "+passwort+" Bachelorarbeit ID: "+bachelorarbeit_id);
	     }
	    	 
	     conn.close();
	     System.out.println("Disconnected from database");
	     
	 }   catch (Exception e) {
		   e.printStackTrace();
	}
		}
			}
