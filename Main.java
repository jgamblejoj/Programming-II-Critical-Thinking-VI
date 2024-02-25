import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// Initialize Student Objects
		Student student01 = new Student(1, "John Carlton", "323 West Drive, Las Vegas, NV");
		Student student02 = new Student(2, "Mary Tudor", "984 East Drive, Las Vegas, NV");
		Student student03 = new Student(3, "Donald Trumpadeour", "143 South Drive, Las Vegas, NV");
		Student student04 = new Student(4, "Joseph Bydawn", "545 North Drive, Las Vegas, NV");
		Student student05 = new Student(5, "Charles Gamble", "345 East Drive, Las Vegas, NV");
		Student student06 = new Student(6, "Avery Avery", "754 West Drive, Las Vegas, NV");
		Student student07 = new Student(7, "Colette Gamble", "463 North Drive, Las Vegas, NV");
		Student student08 = new Student(8, "Danielle Gamble", "854 East Drive, Las Vegas, NV");
		Student student09 = new Student(9, "Paris Wells", "235 South Drive, Las Vegas, NV");
		Student student10 = new Student(10, "George Washington", "424 East Drive, Las Vegas, NV");
		
		// Initialize ArrayList
		ArrayList<Student> studentArray = new ArrayList<>();
		
		// Add Students to ArrayList
		studentArray.add(student01);
		studentArray.add(student02);
		studentArray.add(student03);
		studentArray.add(student04);
		studentArray.add(student05);
		studentArray.add(student06);
		studentArray.add(student07);
		studentArray.add(student08);
		studentArray.add(student09);
		studentArray.add(student10);
		
		// Use Comparator Classes to sort through the ArrayList according to the Comparator's focus
		
		// Initialize Comparator objects (RollNo and Name)
		RollNoComparator rollNoCompare = new RollNoComparator();
		NameComparator nameCompare = new NameComparator();
		
		// Print the sorted ArrayList to the console
		System.out.println("Sorted by Roll Number -- ");
		rollNoCompare.selectionSort(studentArray, rollNoCompare);
		System.out.println("\n\nSorted by Last Name -- ");
		nameCompare.selectionSort(studentArray, nameCompare);
	}
}