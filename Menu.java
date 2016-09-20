


import java.util.Scanner;
public class Menu {

	public static void main(String[] args) {
		//Attributes
		Scanner         input   = new Scanner(System.in);
		displayMessage  display = new displayMessage();
		saveInformation save    = new saveInformation();
		store           store   = new store();
		
		int option;
		
		
		display.displayHeader();
		System.out.println();
		
		//Enter user name and password
		display.displayDetails();
		save.inputUserName();					//Prompt and read user name entered
		save.inputPassword();					//Prompt and read password  entered
		System.out.println();
		
		//Access store system
		if( save.getSystemUserName()>=0 && save.getSystemPassword()>=0){
			display.displayMenu();
			display.displayOption();			//Prompt option
			option = input.nextInt();			//Read option entered
			display.displayHorizontalLine();
			System.out.println();
			
			while(option != 6){
				switch(option){
				case 1:
					store.Entrance();			//arrival of items in the store
				break;
				
				case 2:
					store.Removal();			//Removal of items from the store
					break;
				
				case 3:
						store.displayStockIn();	//display record of arrival of items	
					break;
					
				case 4:
					store.displayStockOut();	//display record of stock
					break;
					
				case 5:
					store.displayChart();		//display chart of items sold
					break;
				default:
					display.displayError();
				break;
				
				}
				display.displayOption();
				option = input.nextInt();
				display.displayHorizontalLine();
				System.out.println();
		}
			
		}
		
		else{
			display.displayRefused();
		}
		display.displayExit();
		
	}
	

}

