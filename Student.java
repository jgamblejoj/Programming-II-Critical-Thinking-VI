public class Student {
	// Attributes
	int rollno;
	String name;
	String address;
	// Constructor
	public Student(int rollno, String name, String address) {
		this.rollno = rollno;
		this.name = name;
		this.address = address;
	}
	// Getters
	public int getRollNo() {
		return rollno;
	}
	public String getName() {
		return name;
	}
		// Getters for first and last names respectively
	public String getFirstName() {
		String[] names = name.split(" ");
		return names[0];
	}
	public String getLastName() {
		String[] names = name.split(" ");
		return names[names.length - 1];
	}
	public String getAddress() {
		return address;
	}
	// Setters
	public void setRollNo(int rollno) {
		this.rollno = rollno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	// toString Method
	@Override
	public String toString() {
		System.out.println();
		return "\tRoll No: " + this.getRollNo() + 
				"\n\tName: " + this.getLastName() + ", " + this.getFirstName() + 
				"\n\tAddress: " + this.getAddress() + "\n";
	}
}