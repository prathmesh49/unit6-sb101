package problem4;

public class Student {
	int roll;
	String name;
	String email;
	int marks;
	public Student(int roll, String name, String email, int marks) {
		this.roll = roll;
		this.name = name;
		this.email = email;
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return  "\t\t" +roll + "\t\t" + name + "\t\t" + email + "\t\t" + marks+"\n";
	}
	
	
}
