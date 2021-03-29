/**
 * Creates a pet store object that uses the ArrayList cats
 * to add, remove, and list the cats in a pet store.
 */
package labproject3.prob2;

import java.util.ArrayList;

public class PetStore {

	//Creates the ArrayList
	private static ArrayList <Cat> cats = new ArrayList <Cat>();
	
	//Sets max number of cats to 10 and the current number of cats to 0
	private final int MAXCATS = 10;
	private int catCount = 0;
	
	//Adds a cat to the ArrayList
	public void addCat(Cat cat) {
		if (catCount <= MAXCATS) {
			cats.add(cat);
			catCount++;
		}
		else {
			System.out.println("Max number of cats reached.");
		}
	}
	
	//Lists the cats in the ArrayList
	public void listCats() {
		for (int i = 0; i < cats.size(); i++) {
			System.out.println(i + " - " + cats.get(i));
		}
		
	}
	
	//Removes a cat from the ArrayList
	public void removeCat(Cat catIndex) {
		cats.remove(catIndex);
	}
	
	//Tests the PetStore class
	public static void main(String[] args) {
		
		//Creates the object myStore
		PetStore myStore = new PetStore();
		
		//Adds 5 cats to the store
		Cat nemo = new Cat("Nemo", 8, "American Shorthair");
		myStore.addCat(nemo);
		Cat trixie = new Cat("Trixie", 17, "Black");
		myStore.addCat(trixie);
		Cat junie = new Cat("Junie", 12, "White and Grey");
		myStore.addCat(junie);
		Cat oliver = new Cat("Oliver", 1, "Orange");
		myStore.addCat(oliver);
		Cat bella = new Cat("Bella", 1, "Black and White");
		myStore.addCat(bella);
		
		//Lists the cats
		myStore.listCats();
		System.out.println("");
		
		//Removes a cat
		myStore.removeCat(oliver);
		
		//Lists the cats again
		myStore.listCats();
		System.out.println("");
		
		//Adds one too many cats
		Cat zoe = new Cat("Zoe", 18, "Tortie");
		myStore.addCat(zoe);
		Cat sarah = new Cat("Sarah", 17, "Calico");
		myStore.addCat(sarah);
		Cat scar = new Cat("Scar", 8, "Black");
		myStore.addCat(scar);
		Cat ghost = new Cat("Ghost", 7, "White");
		myStore.addCat(ghost);
		Cat pickles = new Cat("Pickles", 2, "Tabby");
		myStore.addCat(pickles);
		Cat maisy = new Cat("Maisy", 3, "Tabby");
		myStore.addCat(maisy);
		Cat coco = new Cat("Coco", 13, "Fluffy");
		myStore.addCat(coco);
		System.out.println();
		
		//Lists the cats again
		myStore.listCats();
		System.out.println("");
		
		//Clears the ArrayList and prints it out again to show that it's been cleared
		cats.clear();
		myStore.listCats();
		}
		
	}
