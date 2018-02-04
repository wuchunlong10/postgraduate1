package Entity;

public class Score {
	private String StudentId;
	private String SubjectName;
	private String CourseId;
	private int Score;
	private float Gpa;	//¼¨µã
	public String getStudentId() {
		return StudentId;
	}
	public void setStudentId(String studentId) {
		StudentId = studentId;
	}
	public String getSubjectName() {
		return SubjectName;
	}
	public void setSubjectName(String subjectName) {
		SubjectName = subjectName;
	}
	public String getCourseId() {
		return CourseId;
	}
	public void setCourseId(String courseId) {
		CourseId = courseId;
	}
	public int getScore() {
		return Score;
	}
	public void setScore(int score) {
		Score = score;
	}
	public float getGpa() {
		return Gpa;
	}
	public void setGpa(float gpa) {
		Gpa = gpa;
	}

	
	
}
