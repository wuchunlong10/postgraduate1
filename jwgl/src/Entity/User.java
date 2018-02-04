package Entity;

import java.io.Serializable;

import javax.persistence.Entity;
public class User implements Serializable{
	private String StudentId;
	private String StudentName;
	private String PassWord;
	private String Class1;
	private int Phone;
	private String Email;
	private String FatherName;
	private int FatherPhone;
	private String IdCard;
	private int BankNumber;
	private String Status;
	private String Shape;
	private String Education;
	private int StudySystem;
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getPassWord() {
		return PassWord;
	}
	public void setPassWord(String passWord) {
		PassWord = passWord;
	}
	public int getPhone() {
		return Phone;
	}
	public void setPhone(int phone) {
		Phone = phone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getFatherName() {
		return FatherName;
	}
	public void setFatherName(String fatherName) {
		FatherName = fatherName;
	}
	public int getFatherPhone() {
		return FatherPhone;
	}
	public void setFatherPhone(int fatherPhone) {
		FatherPhone = fatherPhone;
	}
	public String getIdCard() {
		return IdCard;
	}
	public void setIdCard(String idCard) {
		IdCard = idCard;
	}
	public int getBankNumber() {
		return BankNumber;
	}
	public void setBankNumber(int bankNumber) {
		BankNumber = bankNumber;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getShape() {
		return Shape;
	}
	public void setShape(String shape) {
		Shape = shape;
	}
	public String getEducation() {
		return Education;
	}
	public void setEducation(String education) {
		Education = education;
	}
	public String getClass1() {
		return Class1;
	}
	public void setClass1(String class1) {
		Class1 = class1;
	}
	public int getStudySystem() {
		return StudySystem;
	}
	public void setStudySystem(int studySystem) {
		StudySystem = studySystem;
	}
	
}
