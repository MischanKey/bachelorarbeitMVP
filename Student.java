package BA;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class Student {

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
	    	 
	    	 rs = stmt.executeQuery("SELECT MNR, Nachname, Name, Studiengang, Semester, Telefon, Email, Bachelorarbeit FROM studenten");
	    	 
	    	 while (rs.next()) {
	    			int mnr = rs.getInt("MNR");
	    			String nachname = rs.getString("Nachname");
	    			String name = rs.getString("Name");
	    			String studiengang = rs.getString("Studiengang");
	    			int semester = rs.getInt("Semester");
	    			int telefon = rs.getInt("Telefon");	    			
	    			String email = rs.getString("Email");
	    			String bachelorarbeit = rs.getString("Bachelorarbeit");
	    		
	    			System.out.println("Matrikelnummer: "+mnr+" Nachname: "+nachname+" Name: "+name+" Studiengang: "+studiengang+" Semester: "+semester+" Telefon: "+telefon+" Email: "+email+" Bachelorarbeit: "+bachelorarbeit);
	     }
	    	 
	     conn.close();
	     System.out.println("Disconnected from database");
	     
	 }   catch (Exception e) {
		   e.printStackTrace();
	}
		}
			}
