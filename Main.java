import java.util.ArrayList;
/** 
 * Main process begins here. The whole program runs in a loop, that verifies with the help of a boolean
 * when to stop. This boolean is either left untouched, or changed to true, when you wish to quit.
 * @author john
 *
 */
public class Main {
	static PersonContainer 	aleluia;
	static Parser			keyboard;
	public static void main(String[] args) {
		aleluia  = PersonContainer.getInstance();
		keyboard = Parser.getInstance(); //aici m-am blocat, nu inteleg de ce imi da null pointer.
		
		boolean quit = false;
		while (!quit) {
			System.out.println("Welcome");
			
			Command command = keyboard.getCommand();
			quit = processCommand(command);
			
		}
		System.out.println("Byeeeee");

	}
	
	private static boolean processCommand (Command command) {
		boolean wantToQuit = false;
		if (command.isUnkown()) {
			System.out.println("No command known.");
			return false;
		}
		
		String commandWord = command.getCommandWord();
		if (commandWord.equals("add")) {
			addPerson(command);
		} else if (commandWord.equals("remove")) {
			
		} else if (commandWord.equals("show")) {
			aleluia.printOutList();
		} else if (commandWord.equals("quit")) {
			wantToQuit = quit(command);
		}
		
		return wantToQuit;
	}
	
	public static void addPerson (Command command) {
		if (!command.hasSecondWord()) {
			System.out.println("Need second word");
			return;
		}
		
		String name = command.getSecondWord();
		
		aleluia.addPersonByName(name);
	}
	
	private static boolean quit(Command command) 
    {
        if(command.hasSecondWord()) {
            System.out.println("Quit what?");
            return false;
        }
        else {
            return true;  // signal that we want to quit
        }
    }

}
