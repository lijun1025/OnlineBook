package cn.jun.bean;

public class User {
	private String username;
	private String password;
	private String email;
	private String nickname;
	
	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(String username, String password, String email, String nickname) {
		super();
		this.username = username;
		this.password = password;
		this.email = email;
		this.nickname = nickname;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	
}
