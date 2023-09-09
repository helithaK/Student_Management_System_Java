

package school.management.system;

import java.util.List;
/*
 * Many teachers, many students
 * Implements teachers and students using an ArrayList
 * Created by Helitha 
 */
public class School {
	
	
	private List<Teacher> teachers;
	private List<Student> students;
	private static int  totalMoneyEarned;
	private static int totalMoneySpent;
	
	/**
	 * new school object is created
	 * @param teacher list of teachers in the school
	 * @param student list of teachers in the school
	 */
	
	public School(List<Teacher> teachers, List<Student> student) {
		super();
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}
	
	
	//Returns the set of teachers in the school
	public List<Teacher> getTeachers() {
		return teachers;
	}

	/**
	 * Adds a teacher to the school
	 * @param teacher the teacher to be added
	 */
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}

	
	/**
	 * 
	 * @return the list of students in the school
	 */
	public List<Student> getStudents() {
		return students;
	}

	/**
	 * Add a student to the school
	 * @param student the student to be added 
	 */
	public void addStudent(Student student) {
		students.add(student);
	}

	
	/**
	 * 
	 * @return the total money earned by the school
	 */
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}

	/**
	 * Adds the total money by the school
	 * @param MoneyEarned money that is supposed to be added 
	 */
	public static void updateTotalMoneyEarned(int MoneyEarned) {
		totalMoneyEarned += MoneyEarned;
	}
	
	/**
	 * 
	 * @return the total money spent
	 */

	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}

	/**
	 * update the money that is spent by the school which\
	 * is the sallary given by the school to its teachers
	 * 
	 * @param MoneySpent
	 */
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarned -= moneySpent;
		
	}
	
	
	
	
	
	
	
	
	

}
