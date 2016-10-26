/** 
 * Class that acts as a buffer between the template of the commands named "CommandWords",
 * and "Parser" class, thus resulting in being used in the main process.
 * @author john
 *
 */
public class Command {
	private String commandWord;
	private String secondWord;
	
	/**
	 * Constructor that is used in the main process, and as well in the "Parser" class.
	 * @param firstWord
	 * @param secondWord
	 */
	public Command (String firstWord, String secondWord) {
		commandWord 	= firstWord;
		this.secondWord = secondWord;
	}
	
	public String getCommandWord () {
		return commandWord;
	}
	
	public String getSecondWord () {
		return secondWord;
	}
	/**
	 * Checks if the command is valid.
	 * @return true if valid, false if not.
	 */
	public boolean isUnkown () {
		return (commandWord == null);
	}
	/**
	 * Checks if the command has a second word. Used in the main process.
	 * @return true, if there is, false if there is none.
	 */
	public boolean hasSecondWord () {
		return (secondWord != null);
	}
}
