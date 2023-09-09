package school.management.system;



/**
 * Created by Helitha 
 * This class is responsible for keeping the track
 * of teacher's name, id, salary.
 * 
 */

public class Teacher {
	private int id;
	private String name;
	private int salary;
	private int salaryEarned;
	
	
	/**
	 * Creates a new Teacher 
	 * @param id id for the teacher
	 * @param name name of the teacher
	 * @param salary salary of the teacher
	 */
	public Teacher(int id, String name, int salary ) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.salaryEarned = 0;
		
				
	}
	
	//Return the id of the teacher
	public int getId() {
		return id;
	}
	
	//Return the name of the teacher
	public String getName() {
		return  name;
	}
	
	//Return the salary of the teacher
	public int getSalary() {
		return salary;
	}
	
	//Set the salary
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	/**
	 * Adds to salary Earned
	 * Removes from the total money earned to GHS
	 * @param salary
	 */
	public void receiveSalary(int salary){
		salaryEarned += salary;
		School.updateTotalMoneySpent(salary);
	}

	@Override
	public String toString() {
		return "Name of the teacher : " + name 
				+ "Total Salary earned so far $" + salaryEarned;
	}


}
