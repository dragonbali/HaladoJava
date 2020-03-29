package org.komplex.feladat;

public class User {

	private String name;
	private String pw;
	private boolean enable;
	private String neptun;
	
	public String getUserName() {
		return name;
	}
	public String getPw() {
		return pw;
	}
	public boolean isEnable() {
		return enable;
	}
	public String getNeptun() {
		return neptun;
	}
	
	public User(String userName, String pw, boolean enable, String neptun) {
		super();
		this.name = userName;
		this.pw = pw;
		this.enable = enable;
		this.neptun = neptun;
	}
	
	@Override
	public String toString() {
		return "User: Name=" + name + ", pw=" + pw + ", enable=" + enable + ", neptun=" + neptun + "]";
	}
	

	
	
}
