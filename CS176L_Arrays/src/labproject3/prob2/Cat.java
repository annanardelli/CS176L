/**
 * Constructs the Cat objects for the PetStore class
 * and converts the parameters into a single string.
 */
package labproject3.prob2;

public class Cat {

	//Global variables
	private String name;
	private int age;
	private String breed;
	
	//Constructor
	public Cat(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	//Puts all of the parameters into one string
	public String toString() {
		String catData = ("name: " + name + ", age: " + age + ", breed: " + breed);
		return catData;
	}
}
