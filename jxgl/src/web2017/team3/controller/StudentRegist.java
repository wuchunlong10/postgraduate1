package web2017.team3.controller;

public class StudentRegist {
	private String username;
	private String password;
	private String sex;
	private String word;
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	@Override
	public String toString() {
		return "StudentRegist [username=" + username + ", password=" + password
				+ ", sex=" + sex + ", word=" + word + "]";
	}
	
	
}
