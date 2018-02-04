package Entity;

public class CourseOpen {

	private String CourseId;
	private String StartTime;
	private String EndTime;
	private String SubjectName;
	private int Time;
	private String Place;
	private String TeacherName;
	private int CurrentNumber;
	private int TotleNumber;
	private int CourseTime;
	private String Academy;
	
	
	public int getCourseTime() {
		return CourseTime;
	}
	public void setCourseTime(int courseTime) {
		CourseTime = courseTime;
	}
	public String getAcademy() {
		return Academy;
	}
	public void setAcademy(String academy) {
		Academy = academy;
	}
	public String getCourseId() {
		return CourseId;
	}
	public void setCourseId(String courseId) {
		CourseId = courseId;
	}
	
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}
	public String getEndTime() {
		return EndTime;
	}
	public void setEndTime(String endTime) {
		EndTime = endTime;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	public int getTime() {
		return Time;
	}
	public void setTime(int time) {
		Time = time;
	}
	public String getPlace() {
		return Place;
	}
	public void setPlace(String place) {
		Place = place;
	}
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}
	public int getCurrentNumber() {
		return CurrentNumber;
	}
	public void setCurrentNumber(int currentNumber) {
		CurrentNumber = currentNumber;
	}
	public int getTotleNumber() {
		return TotleNumber;
	}
	public void setTotleNumber(int totleNumber) {
		TotleNumber = totleNumber;
	}
	
}
