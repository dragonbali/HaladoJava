package he;

public class User {

	private String userName;
	private String pw;
	
	public String getUserName() {
		return userName;
	}
	public String getPw() {
		return pw;
	}
	public User(String userName, String pw) {
		super();
		this.userName = userName;
		this.pw = pw;
	}
	
	@Override
	public String toString() {
		return "Uer: userName= " + userName + ", Password= " + pw;
	}
	
	
}
