
enum Gender{
	MALE, FEMALE
}

public class Student implements Comparable<Student> {

	private String fname;
	private int score;
	private String lname;
	private Gender gender;
	private int age;
	
	
	 


	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Student(String fname, int score, String lname, Gender gender, int age) {
		super();
		this.fname = fname;
		this.score = score;
		this.lname = lname;
		this.gender = gender;
		this.age = age;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}



	@Override
	public String toString() {
		return "\n" + fname + "," + score;
	}



	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return o.getScore() - this.score;
	}
	
	
}
