package web2017.team3.domain;

public class Teacher {
	/*tid, 
	tname, 
	tpassword, 
	age, 
	sex, 
	word, 
	mail, 
	address, 
	dpn*/
	private Integer tid;
	private String tname;
	private String tpassword;
	private String sex;
	private int age;
	private String word;
	private String mail;
	private String address;
	private int dpn;
	private String tel;
	public Integer getTid() {
		return tid;
	}
	public void setTid(Integer tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getTpassword() {
		return tpassword;
	}
	public void setTpassword(String tpassword) {
		this.tpassword = tpassword;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getDpn() {
		return dpn;
	}
	public void setDpn(int dpn) {
		this.dpn = dpn;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}

	
}
