package two;

public class PrivatePerson {
	
	private String name;
	private int age;

	
	public String getName() {
		return name; // remember return
	}
	
	public void setName(String newName) { // remember only data type as parameter
		this.name = newName;
		
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}

}
