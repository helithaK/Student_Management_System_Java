package school.management.system;


/**
 * Created by Helitha Kulatunga
 * This class is responsible for keep the
 * track of students fees, name,grade and fees 
 * paid
 */

public class Student {
	// The below are known as feilds
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;
	
	/**
	 * To create a new student by initializing 
	 * Fees for every student is $30000
	 * Fees paid initially is 0.
	 * @param id id for the student : Unique
	 * @param name : name of the student
	 * @param grade grade of the student
	 */
	
	public Student(int id, String name, int grade ) {
		this.feesPaid = 0;
		this.feesTotal = 30000;
		this.id = id;
		this.name = name;
		this.grade = grade;
		
		
	}
	
	//Not going to alter student's name and id.
	
	/**
	 * Used to update the student's grade
	 * @param grade new grade of the student
	 */
	
	
	public void setGrade(int grade) {
		this.grade = grade;
	}
	
	/**
	 * Keep adding the fees to feesPaid
	 * feespaid = 10,000 + 5000 + 15000
	 * Add the fees to the fees paid
	 * The school is going to receive the funds.
	 * 
	 * @param fees
	 */
	public void payFees(int fees) {
		feesPaid += fees;
		School.updateTotalMoneyEarned(feesPaid);
		
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getGrade() {
		return grade;
	}

	public int getFeesPaid() {
		return feesPaid;
	}

	public int getFeesTotal() {
		return feesTotal;
	}
	
	/**
	 * return the remaining fees
	 * @return
	 */
	public int getRemainingFees()
	{
		return feesTotal - feesPaid ;
	}
	
	@Override
	public String toString() {
		return "Student's name : " + name + "Total fees paid so far : " + feesPaid;
	}
	

}
