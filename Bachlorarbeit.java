package BA;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Bachlorarbeit {

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
	    	 
	    	 rs = stmt.executeQuery("SELECT Bachelorarbeit_ID, Note_Vortrag, Note_Arbeit, Thema, IP, Exemplar, Ausgabetermin, Abgabetermin, Anmeldeformular, NDA, Student, Betreuer, Unternehmen FROM bachelorarbeit");
	    	 
	    	 while (rs.next()) {
	    			int bachelorarbeit_id = rs.getInt("Bachelorarbeit_ID");
	    			int note_vortrag = rs.getInt("Note_Vortrag");
	    			int note_arbeit = rs.getInt("Note_Arbeit");
	    			String thema = rs.getString("Thema");
	    			String ip = rs.getString("IP");
	    			String exemplar = rs.getString("Exemplar");	    			
	    			Date ausgabetermin = rs.getDate("Ausgabetermin");
	    			Date abgabetermin = rs.getDate("Abgabetermin");
	    			String anmeldeformular = rs.getString("Anmeldeformular");
	    			String nda = rs.getString("NDA");
	    			String student = rs.getString("Student");
	    			String betreuer = rs.getString("Betreuer");
	    			String unternehmen = rs.getString("Unternehmen");
	    			
	    			System.out.println("Bachelorarbeit ID: "+bachelorarbeit_id+" Note Vortrag: "+note_vortrag+" Note Arbeit: "+note_arbeit+" Thema: "+thema+" IP: "+ip+" Exemplar: "+exemplar+ " Ausgabetermin: "+ausgabetermin+" Abgabetermin: "+abgabetermin+" Anmeldeformular: "+anmeldeformular+" NDA: "+nda+" Student: "+student+" Betreuer: "+betreuer+" Unternehmen: "+unternehmen);
	     }
	    	 
	     conn.close();
	     System.out.println("Disconnected from database");
	     
	 }   catch (Exception e) {
		   e.printStackTrace();
	}
		}
			}