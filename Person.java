/**
 * This is the template used to represent a person in the Ledger program.
 * It does not have any functionality, other than printing out the data that is responsible of.
 * @author john
 *
 */
public class Person {
	private String	name;
	private String	birthday;
	private String	address;
	private String	telephoneNo;
	private int		postCode;
	
	//default constructor, used for test purposes, unknown values for strings, and zero for ints
	public Person (String name) {
		this.name = name;
		this.birthday = "unknownBirthday";
		this.address = "unknownAddress";
		this.telephoneNo = "unknownTelephone";
		this.postCode = 0;	
	}
	//constructor initializing the variables, with the information given
	public Person (String name, String birthday, String address, String telephoneNo, int postCode) {
		this.name 			= name;
		this.birthday 		= birthday;
		this.address 		= address;
		this.telephoneNo 	= telephoneNo;
		this.postCode 		= postCode;
	}
	
	public void printInfo () {
		System.out.println("Name is: " + name);
		System.out.println("Birthday is: " + birthday);
		System.out.println("Address is: " + address);
		System.out.println("Telephone is: " + telephoneNo);
		System.out.println("PostCode is: " + postCode);
		System.out.println("-------------------------------");
	}
	
	//setters for the variables
	public void setName (String name) {
		this.name = name;
	}
	
	public void setBirthday (String birthday) {
		this.birthday = birthday;
	}
	
	public void setAddress (String address) {
		this.address = address;
	}
	
	public void setTelephoneNo (String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}
	
	public void setPostCode (int postCode) {
		this.postCode = postCode;
	}
	
	
	//getters for the variables
	public String getName () {
		return name;
	}
	
	public String getBirthday () {
		return birthday;
	}
	
	public String getAddress () {
		return address;
	}
	
	public String getTelephoneNo () {
		return telephoneNo;
	}
	
	public int getPostCode () {
		return postCode;
	}
	
}

