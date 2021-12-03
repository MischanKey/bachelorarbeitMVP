package Swing2.dbaccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import Swing1.businessobjects.Studentaccess;

public class DBaccess {
	

	public static Studentaccess getStudentByMNR(int mnr, Connection conn) {
		
	
			if (conn == null);
					initDB();
			Studentaccess student =null;
			

			try {
				Statement stmt = conn.createStatement ();
				ResultSet rs = stmt
						.executeQuery("SELECT MNR, Nachname, Name, Studiengang, Semester, Telefon, Email, Bachelorarbeit FROM studenten" + mnr + "'");
				
					while (rs.next()) {
						student = new Studentaccess (mnr, rs.getString("Nachname"), rs.getString("Name"), rs.getString("Studiengang"), rs.getInt("Semester"), rs.getInt("Telefon"), rs.getString("Email"), rs.getString("Bachelorarbeit"));
					}
			} catch(Exception ex) {
					ex.printStackTrace();
			
			}
			return student;
			}

	}

	



	

