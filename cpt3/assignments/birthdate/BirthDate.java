package cpt3.assignments.birthdate;

public class BirthDate {

	/**
	 * @param args
	 */
	int year;
	
	public static void main(String[] args) {
		BirthDate bd = new BirthDate();
		bd.showYear();
	}
	public void showYear() {
		System.out.println("The year is " + year);
	}
}
