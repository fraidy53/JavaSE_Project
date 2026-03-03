package mylab.student.entity;

import mylab.student.exception.InvalidGradException;
import workshop.account.exception.InsufficientBalanceException;

public class Student {
	private String studentId;
	private String name;
	private String major;
	private int grade;
	
	// default constructor
	public Student() {
		
	}
	
	// overloaded constructor
	public Student(String studentId, String name, String major, int grade) throws InvalidGradException {
		setStudentId(studentId);
		setName(name);
		setMajor(major);
		setGrade(grade);
	}
	
	// setter & getter 설정
	public String getStudentId() {
		return studentId;
	}
	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public int getGrade() {
		return grade;
	}
	
	public void setGrade(int grade) throws InvalidGradException {
		if(grade < 1 || grade > 4) {
			throw new InvalidGradException("학년은 1~4학년 사이여야 합니다.");
		}
		this.grade = grade;
		
	}

	@Override
	public String toString() {
		return name + " / " + major + " / " + grade + "학년";
	}
	
}
