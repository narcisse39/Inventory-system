



public class displayMessage {

public void displayHeader(){
	System.out.println("WELCOME");
	System.out.println("-------");
	System.out.println("SHOPRITE INVENTORY SYSTEM");
	System.out.println("-------------------------");
	
}
public void displayMenu(){
	System.out.println("Menu");
	System.out.println("----");
	System.out.println("1.Add items to store");
	System.out.println("2.Manage store");
	System.out.println("3.Display arrival stock");
	System.out.println("4.Display stock");
	System.out.println("5.Chart of items sold");
	System.out.println("6.Exit");
	
	
}
public void displayOption(){
	System.out.print("Enter option: ");
}
public void displayDetails(){
	System.out.println("Enter details to access store");
	
}
public void displayUser(){
	System.out.print("Username:");
	
}
public void displayPassword(){
	System.out.print("Password:");
}
public void displayRefused(){
	System.out.println("========================================");
	System.out.println("You are not allowed to acces this store!");
	System.out.println("========================================");
	
}

public void displayInput(){
	System.out.println();
	System.out.println("Enter option 1 to input items in storage");
	System.out.println("Option 2 to remove items from storage");
	System.out.print("Or option -1 to quit the application            : ");
}
public void displayExit(){
	System.out.println("YOU HAVE EXIT THE APPLICATION");
	System.out.println("HAVE A GOOD DAY!");
	System.out.println();
}

public void displayError(){
	System.out.println("Wrong option has been enetered!");
}
public void numberOfItems(){
	System.out.print("Enter the number of items                        : ");
}
public void name(){
	System.out.print("Enter the items name                             : ");
}
public void brand(){
	System.out.print("Enter the name of the brand                      : ");
}
public void seriaNumber(){
	System.out.print("Enter the serial number of items                 : ");
}
public void manufacturingDate(){
	System.out.print("Enter the manufacturing date of items(dd-mm-yyyy): ");
}
public void expiringDate(){
	System.out.print("Enter the expiring date of items(dd-mm-yyyy)     : ");
}
public void arrivalDate(){
	System.out.print("Enter the arrival date of items(dd-mm-yyyy)      : ");
}
public void departureDate(){
	System.out.print("Enter the departure date of items(dd-mm-yyyy)    : ");
}
public void price(){
	System.out.print("Enter the unit price of items                    : R");
}
public void quantityIn(){
	System.out.print("Enter the quantity of items(items in)            : ");
}
public void quantityOut(){
	System.out.print("Enter the quantity of items(items out)           : ");
}
public void count(int count){
	System.out.println  ("==================");
	System.out.println("||Items number "+count+"||");
	System.out.println  ("==================");
	System.out.println();
}
public void stockIn(){
	System.out.println("ITEMS IN STOCK");
	System.out.println("**************");
}
public void stockOut(){
	System.out.println("ITEMS OUT OF STOCK");
	System.out.println("******************");
}
public void recordStockIn(){
	System.out.println("******************");
	System.out.println("RECORD OF STOCK IN");
	System.out.println("******************");
}
public void recordStockOut(){
	System.out.println("**************************");
	System.out.println("RECORD OF STOCK IN AND OUT");
	System.out.println("**************************");
}
public void itemsDescription(){
	System.out.println("Items description");
	System.out.println("=================");
	System.out.println("N0 |Name       |Brand        |Serial  N0     |Manu. date   |Exp.  date |");
}
public void printStockIn(){
	System.out.println("Stock description");
	System.out.println("=================");
	System.out.println("N0 |Arv.  date      |Unit cost    |Total cost    |In  ");
}
public void printStockOut(){
	System.out.println("Stock description");
	System.out.println("=================");
	System.out.println("N0 |Arv.  date   |Dep.  date  |Unit cost    |Total cost Sold  |In  |Out  ");
}
public void displayHorizontalLine(){
	System.out.println("----------------------------------------------------------------------------------------------");
	
}
public void chart(){
	System.out.println("Chart of sold items");
	System.out.println("===================");
	System.out.println("N0 |Name       |Selling rate(%)");
}
}


