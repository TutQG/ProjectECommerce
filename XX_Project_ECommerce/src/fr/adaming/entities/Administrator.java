package fr.adaming.entities;

public class Administrator {

	//déclaration des attributs
	private int id;
	private String mail;
	private String pwd;
	
	//constructeurs
	public Administrator() {
		super();
	}
	public Administrator(String mail, String pwd) {
		super();
		this.mail = mail;
		this.pwd = pwd;
	}
	public Administrator(int id, String mail, String pwd) {
		super();
		this.id = id;
		this.mail = mail;
		this.pwd = pwd;
	}
	
	//getter et setter
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	
	
}
