import java.util.Arrays;
import java.util.Scanner;

public class saveInformation {

	displayMessage display = new displayMessage();
	Scanner input= new Scanner(System.in);
	
	String [] arrayUserNames = {"admin","narcisse"};		//Systems user names
	int [] arrayPasswords = {1234,0000};					//System passwords
			
	int password;
	String userName;
	
	//Password details
public void inputPassword(){
	display.displayPassword();								//Prompt password
	password = input.nextInt();								//Read password
	}
public int password() {
	return password;										//Return password
}
//User name details
public void inputUserName(){						
	display.displayUser();									//Prompt user name
	userName =input.next();									//Read user name
}
public String userName() {
	return userName;										//Return user name
}

//System user name and password
public int getSystemPassword(){
	return Arrays.binarySearch(arrayPasswords,password());	//Search arrayPasswords for password entered by user
}
public int getSystemUserName(){
	
	return Arrays.binarySearch(arrayUserNames,userName());	//Search arrayUserNames for user name entered by user
}

}
