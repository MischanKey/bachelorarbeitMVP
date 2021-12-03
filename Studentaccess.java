package Swing1.businessobjects;

public class Studentaccess {

			private int mnr;
			private String nachname;
			private String name;
			private String studiengang;
			private int semester;
			private int telefon;
			private String email;
			private String bachelorarbeit;
			
			public Studentaccess(int mnr, String nachname, String name, String studiengang, int semester, int telefon, String email, String bachelorarbeit) {
				super();
				this.mnr = mnr;
				this.setNachname(nachname);
				this.setName(name);
				this.setStudiengang(studiengang);
				this.setSemester(semester);
				this.setTelefon(telefon);
				this.setEmail(email);
				this.setBachelorarbeit(bachelorarbeit);
			
			}
			public int getMnr() {
				return mnr;
			
			}
			public void setMnr(int mnr) {
				this.mnr = mnr;
			}
			public String getNachname() {
				return nachname;
			}
			public void setNachname(String nachname) {
				this.nachname = nachname;
			}
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getStudiengang() {
				return studiengang;
			}
			public void setStudiengang(String studiengang) {
				this.studiengang = studiengang;
			}
			public int getSemester() {
				return semester;
			}
			public void setSemester(int semester) {
				this.semester = semester;
			}
			public int getTelefon() {
				return telefon;
			}
			public void setTelefon(int telefon) {
				this.telefon = telefon;
			}
			public String getEmail() {
				return email;
			}
			public void setEmail(String email) {
				this.email = email;
			}
			public String getBachelorarbeit() {
				return bachelorarbeit;
			}
			public void setBachelorarbeit(String bachelorarbeit) {
				this.bachelorarbeit = bachelorarbeit;
			}
			}
