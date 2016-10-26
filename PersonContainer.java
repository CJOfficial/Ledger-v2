import java.util.ArrayList;
/**
 * A class that acts as a Singleton for the program. This means it can only be instantiated once,
 * and afterwards, when the method ".getInstance()" is called, it returns the instance of the Singleton.
 * @author john
 *
 */
public class PersonContainer {
	
	private 		ArrayList<Person> 		list;
	private static 	PersonContainer 		instance;
	
	/**
	 * Private constructor, used for the Singleton.
	 */
	private PersonContainer () {
		list = new ArrayList<Person>();
	}
	
	/**
	 * Method used for instantiating the Singleton.
	 * @return the instance of the Singleton.
	 */
	public static PersonContainer getInstance () {
		if (instance == null) {
			
			instance = new PersonContainer();
		
		}
		
		return instance;
	}
	
	/**
	 * Method to add a Person object, that takes as parameter an object of type Person.
	 * @param object, is the Person object, that is to be added using ".add()" method.
	 */
	public void addPerson (Person object) {
		if (list.add(object)) {
			
			System.out.println("The person named: " + object.getName() + " has been added");
		
		} else {
			
			System.out.println("Could not add");
		
		}
	}
	
	/**
	 * Method that removes the first instance of the parameter in the ArrayList named: "list".
	 * @param object, used as the search criteria for finding the instance of the object.
	 */
	public void removePerson (Person object) {
		if (list.remove(object)) {
			
			System.out.println("The person named: " + object.getName() + " has been removed");
		
		} else {
			
			System.out.println("Could not remove");
		
		}
	}
	
	/**
	 * Method prints out the information of every instance in the ArrayList named: "list".
	 * It uses the ".printInfo()" method, located in "Person" class, that returns an object of type "Person"
	 */
	public void printOutList () {
		
		for(Person object : list) {
			
			object.printInfo();
		
		}
		
		System.out.println("......");
	}
	
	/**
	 * Method that searches for the first instance of an object which matches the search criteria.
	 * @param name, represents the String by which the computer will search the ArrayList.
	 * @return returns an object of type "Person" if successful, otherwise returns null.
	 */
	public Person searchByName (String name) {
		Person 	toBeReturned 	= null;
		
		int		index 			= 0;
		boolean	found 			= false;
		
		// execute as long as the object has not been found.
		while (index < list.size() && found == false ) {
			
			// get the "name" of the object located at the current index,
			// then check if it's equal to the String given as parameter.
			if (name.equals(list.get(index).getName())) {
				
				toBeReturned = list.get(index);
				found = true;
				
			} // if not found, increase index
				else {
				index++;
			}
		}
		
		return toBeReturned;
	}

	//to be upgraded.
	public void addPersonByName (String name) {
		if (list.add(new Person(name))) {
			System.out.println("Added");
		} else {
			System.out.println("nope");
		}
	}
}
