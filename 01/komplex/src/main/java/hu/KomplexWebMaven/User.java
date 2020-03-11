package hu.KomplexWebMaven;

public class User {

	private String userName;
	private String pw;
	private boolean enable;
	private String neptun;
	
	public String getUserName() {
		return userName;
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
		this.userName = userName;
		this.pw = pw;
		this.enable = enable;
		this.neptun = neptun;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", pw=" + pw + ", enable=" + enable + ", neptun=" + neptun + "]";
	}
	

	
	
}
