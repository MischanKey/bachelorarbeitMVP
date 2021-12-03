package BA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Betreuer {

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
	    	 
	    	 rs = stmt.executeQuery("SELECT Betreuer_ID, Nachname, Name, Passwort, Email, Bachelorarbeit_ID FROM betreuer");
	    	 
	    	 while (rs.next()) {
	    			int betreuer_id = rs.getInt("Betreuer_ID");
	    			String nachname = rs.getString("Nachname");
	    			String name = rs.getString("Name");
	    			String passwort = rs.getString("Passwort");	    			
	    			String email = rs.getString("Email");
	    			int bachelorarbeit_id = rs.getInt("Bachelorarbeit_ID");
	    		
	    			System.out.println("Betreuer ID: "+betreuer_id+" Nachname: "+nachname+" Name: "+name+" Passwort: "+passwort+" Email: "+email+" Bachelorarbeit ID: "+bachelorarbeit_id);
	     }
	    	 
	     conn.close();
	     System.out.println("Disconnected from database");
	     
	 }   catch (Exception e) {
		   e.printStackTrace();
	}
		}
			}
