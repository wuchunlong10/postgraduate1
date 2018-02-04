package Entity;

import java.io.Serializable;

public class teacherDao implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String year;									//入职年份  
	private String college;          //学院代码 
	private String name;             //姓名  
	private String sex;										//性别  
	private String nation;								//民族  
	private String idNumber;						//身份证号  
	private String nativePlace;				//籍贯  
	private String politicalStatus;		//政治面貌  
	private String phone;								//联系电话  
	private String address;							//家庭住址  
	private String education;						//学历情况  
	private String prize;             //获奖情况
	private String idCard;
	private String SubjectName;

	public int getId() {       
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getYear() {        //入职年份
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getCollege() {					//学院代码 
		return college;
	}
	public void setCollege(String college) {        
		this.college = college;
	}
	
	public String getName() {							//姓名
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSex() {							//性别 
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getNation() {					//民族  
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	public String getIdNumber() {						//教职工号
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	public String getNativePlace() {					//籍贯
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	
	public String getPoliticalStatus() {				//政治面貌 
		return politicalStatus;
	}
	public void setPoliticalStatus(String politicalStatus) {
		this.politicalStatus = politicalStatus;
	}
	
	public String getPhone() {										//联系电话
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {								  //家庭住址
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEducation() {							//学历情况  
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	public String getPrize() {										//获奖情况
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this .idCard  = idCard;
	}
	
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		this.SubjectName  = subjectName;
	}
}
