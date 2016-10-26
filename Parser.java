import java.util.Scanner;
/**
 * This is the class, which takes information from the keyboard and processes it.
 * It can take up to a maximum of two words, and does not take into consideration anything after the
 * second word.
 * @author john
 *
 */
public class Parser {
	
	private 		CommandWords 	commands; 
	private 		Scanner 		keyboard; //Instance of the scanner, used to take input from keyboard.
	private static 	Parser			instance;
	
	/**
	 * Constructor that initializes the "keyboard" and the "command words".
	 */
	private Parser() {
		keyboard = new Scanner(System.in);
		commands = new CommandWords();
	}
	
	public static Parser getInstance() {
		if (instance != null) {
			instance = new Parser();
		}
		
		return instance;
	}
	/**
	 * Method that takes input a line of text from the keyboard and processes it.
	 * It stores the line of text, then separates it, into two words, then checks if they are valid commands.
	 * @return a "Command" object, to be used later on in the main process.
	 */
	public Command getCommand () {
		String inputLine;	 //Will be used to hold the entire input String.
		String word1 = null; 
		String word2 = null;
		
		System.out.print(">  ");
		
		inputLine = keyboard.nextLine(); //Take input from the user.
		
		Scanner tokenizer = new Scanner(inputLine); //Used to check if there are any words to store.
		if(tokenizer.hasNext()) {
			
			word1 = tokenizer.next(); //If there is a word, store it.
			
			if (tokenizer.hasNext()) {
				
				word2 = tokenizer.next(); //Store the second word.
			
			}
			
		}
		// Check if the first word is a command.
		if (commands.isCommand(word1)) {
			return new Command(word1, word2); //Instantiate a "command"
		}
		// If not, then return a "Command" object, containing only the second word.
		else {
			return new Command(null, word2);
		}
	}	
	/**
	 * Method that prints out the current valid commands.
	 */
	public void showCommands () {
		commands.showCommands();
	}
}