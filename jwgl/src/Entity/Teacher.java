package Entity;

public class Teacher {
	private String year;									//��ְ���  
	private String college;          //ѧԺ���� 
	private String name;             //����  
	private String sex;										//�Ա�  
	private String nation;								//����  
	private String idNumber;						//���֤��  
	private String nativePlace;				//����  
	private String politicalStatus;		//������ò  
	private String phone;								//��ϵ�绰  
	private String address;							//��ͥסַ  
	private String education;						//ѧ�����  
	private String prize;								//�����
	private String SubjectName;
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getYear() {        //��ְ���
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	public String getCollege() {					//ѧԺ���� 
		return college;
	}
	public void setColleger(String college) {        
		this.college = college;
	}
	
	public String getName() {							//����
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getSex() {							//�Ա� 
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
	public String getNation() {					//����  
		return nation;
	}
	public void setNation(String nation) {
		this.nation = nation;
	}
	
	public String getIdNumber() {						//���֤�� 
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	public String getNativePlace() {					//����
		return nativePlace;
	}
	public void setNativePlace(String nativePlace) {
		this.nativePlace = nativePlace;
	}
	
	public String getPoliticalStatus() {				//������ò 
		return politicalStatus;
	}
	public void setPoliticalStatus(String politicalStatus) {
		this.politicalStatus = politicalStatus;
	}
	
	public String getPhone() {										//��ϵ�绰
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getAddress() {								  //��ͥסַ
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getEducation() {							//ѧ�����  
		return education;
	}
	public void setEducation(String education) {
		this.education = education;
	}
	
	public String getPrize() {										//�����
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
}
