/* 
 *  1.	Write a class named Person. 
 *  
 *  The person class should define a name (String) and age (int) instance variables.
 *   
 *  Write another class, Application, in which you instantiate a new Person object. 
 *  
 *  Set the person’s age and name properties. 
 *  Print the age and name properties of the created person. Place these files in a package named, “one”. 

Note: The Person.java file should NOT declare a main() method. 

 */

package one;

public class Application {
	
	public static void main(String[] args) {
		
		Person person = new Person();
		
		person.age = 43;
		person.name = "Joe";
		
		System.out.println("Name :" + person.name + ", Age: " + person.age);
	}

}
