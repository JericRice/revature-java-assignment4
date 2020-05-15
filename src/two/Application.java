/*
 * 2.	Write a class named PrivatePerson. Declare instance variables name (String) and age (int) and mark them private. 
 * 
 *    Write getter and setter methods to access these properties. 
 *    
 *    In a Main class, create a new instance of Person and print its properties name and age. 
 *    
 *    Place these files in a package named, “two”.
 */


package two;

public class Application {
	
	public static void main(String[] args) {
		
		PrivatePerson person = new PrivatePerson();
		person.setAge(43);
		person.setName("Joe");
		
		System.out.println("Name: " + person.getName() + ", Age: " + person.getAge() );
		
	}

}
