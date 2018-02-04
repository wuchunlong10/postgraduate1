package Entity;

public class ScheduleCourse {
	private String CoursePlace;
	private String CourseTime;
	private String CourseInfor;
	private String CourseHours;
	private String TeacherName;
	public String getCoursePlace() {
		return CoursePlace;
	}
	public void setCoursePlace(String coursePlace) {
		CoursePlace = coursePlace;
	}
	public String getCourseTime() {
		return CourseTime;
	}
	public void setCourseTime(String courseTime) {
		CourseTime = courseTime;
	}
	public String getCourseInfor() {
		return CourseInfor;
	}
	public void setCourseInfor(String courseInfor) {
		CourseInfor = courseInfor;
	}
	public String getCourseHours() {
		return CourseHours;
	}
	public void setCourseHours(String courseHours) {
		CourseHours = courseHours;
	}
	public String getTeacherName() {
		return TeacherName;
	}
	public void setTeacherName(String teacherName) {
		TeacherName = teacherName;
	}
}
