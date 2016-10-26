/**
 * The template upon which the commands are used. It's main functionality is to offer "commands"
 * and check if a specific String is a command.
 * @author john
 *
 */
public class CommandWords {
	//Here are the current valid commands.
	private static final String[] validCommands = {"add", "remove", "show", "quit"};
	
	/**
	 * Method that checks if a String is a valid command.
	 * NOTE: This is different from ".isUnknown()" method, in "Command" class since, when using this
	 * method, we have a first word command. Here we check to see if it is valid.
	 * @param aString, the string that is to be checked. NOTE:the way this is structured, we presume
	 * that we give a string containing "one word".
	 * @return true if valid, false if not.
	 */
	public boolean isCommand (String aString) {
		
		for (int i = 0; i < validCommands.length; i++) {
			
			if (validCommands[i].equals(aString.toLowerCase())) {
				return true;
			}
			
		}
		return false;
	}
	
	//prints out all the commands available
	public void showCommands () {
		for (String string : validCommands) {
			System.out.print(string + " ");
		}
	}
}
