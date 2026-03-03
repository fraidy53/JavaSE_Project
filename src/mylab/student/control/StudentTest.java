package mylab.student.control;

import mylab.student.entity.Student;
import mylab.student.exception.InvalidGradException;

public class StudentTest {
	public static void main(String[] args) {
		try {
			Student student = new Student("","김민수", "컴퓨터공학", 3);
			System.out.println(student);
			
			System.out.println("5학년으로 변경");
			student.setGrade(5);
		}catch(InvalidGradException e) {
			System.out.println(e.getMessage());
		}
	}
}
