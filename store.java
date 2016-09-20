


import java.util.Scanner;
import java.util.ArrayList;
public class store {
	Scanner input = new Scanner(System.in);
	//items description
	ArrayList< String > itemsName = new ArrayList< String >();
	ArrayList< String > itemsBrand = new ArrayList< String >();
	ArrayList< String > itemsSerialNumber = new ArrayList< String >();
	ArrayList< String > itemsManuDate = new ArrayList< String >();
	ArrayList< String > itemsExpDate = new ArrayList< String >();
	ArrayList< String > itemsArrivalDate = new ArrayList< String >();
	ArrayList< String > itemsDepartureDate = new ArrayList< String >();
	//store description
	ArrayList< Double > itemsPrice = new ArrayList< Double >();
	ArrayList< Double > itemsTotal = new ArrayList< Double >();
	ArrayList< Double > TotalSold = new ArrayList< Double >();
	ArrayList< Double > percentage = new ArrayList< Double >();
	
	ArrayList< Integer > itemsNumbIn = new ArrayList< Integer >();
	ArrayList< Integer > itemsNumbOut = new ArrayList< Integer >();
	ArrayList< Integer > itemsIn = new ArrayList< Integer >();
	
	displayMessage display = new displayMessage();
	
	private String dateIn,dateOut,manufacturingDate,expiringDate;
	private int numberOfItems,numberIn,numberOut,number;
	private String nameOfItem,brandOfItems,serialNumber;
	private double price,totalCost ;
	private int count1;
	
	public void inputNumber(){
		display.numberOfItems();
		number = input.nextInt();
	}
	public int getNumber(){
		return number;
	}

	public void Entrance(){
		//Description of stock of shoprite
		display.stockIn();
		inputNumber();
		count1=1;
		
		for(int counter =0; counter < getNumber(); counter++){
		display.count(count1);
		
		display.name();
		nameOfItem = input.next();
		itemsName.add(nameOfItem);
		
		display.brand();
		brandOfItems = input.next();
		itemsBrand.add(brandOfItems);
		
		display.seriaNumber();
		serialNumber = input.next();
		itemsSerialNumber.add(serialNumber);
		
		display.manufacturingDate();
		manufacturingDate = input.next();
		itemsManuDate.add(manufacturingDate);
		
		display.expiringDate();
		expiringDate = input.next();
		itemsExpDate.add(expiringDate);
		
		display.arrivalDate();
		dateIn = input.next();
		itemsArrivalDate.add(dateIn);
		
		display.price();
		price = input.nextDouble();
		itemsPrice.add(price);
		
		display.quantityIn();
		numberIn = input.nextInt();
		itemsNumbIn.add(numberIn);
	
		numberOfItems =numberIn;
		totalCost = (double)itemsNumbIn.get(counter)*itemsPrice.get(counter);
		itemsTotal.add(totalCost);
		
		count1++;
		
		display.displayHorizontalLine();
		}
	}
public void Removal(){
	display.stockOut();
	inputNumber();
	count1=1;
	
	for(int counter =0; counter < getNumber(); counter++){
		display.count(count1);
		
		display.name();
		nameOfItem = input.next();
		itemsName.add(nameOfItem);
		
		
		display.departureDate();
		dateOut = input.next();
		itemsDepartureDate.add(dateOut);
		
		
		display.quantityOut();
		numberOut = input.nextInt();
		itemsNumbOut.add(numberOut);
	
		
		numberOfItems =itemsNumbIn.get(counter)-itemsNumbOut.get(counter);
		itemsIn.add(numberOfItems);
		totalCost = (double)itemsNumbOut.get(counter)*itemsPrice.get(counter);
		TotalSold.add(totalCost);
		
		 count1++;
	
		 display.displayHorizontalLine();
	}
	
	}

public void displayStockIn(){
	display.recordStockIn();
	count1 =1;
	
	display.itemsDescription();
	for(int counter =0; counter < getNumber(); counter++){
		System.out.printf ("%d   %-10s  %-10s    %-10s      %-10s    %-10s        \n",count1,itemsName.get(counter),itemsBrand.get(counter)
				,itemsSerialNumber.get(counter),itemsManuDate.get(counter),itemsExpDate.get(counter));
		count1++;	
}
	
	count1=1;
	System.out.println();
	display.printStockIn();
for(int secondCounter =0;secondCounter < getNumber();secondCounter++){
	System.out.printf ("%d   %-10s       %-10.2f    R%-10.2f    %-5d  \n",count1,itemsArrivalDate.get(secondCounter),itemsPrice.get(secondCounter),itemsTotal.get(secondCounter),itemsNumbIn.get(secondCounter));
	count1++;
	}
display.displayHorizontalLine();
}


public void displayStockOut(){
	display.recordStockOut();
	count1 =1;
	
	display.itemsDescription();
for(int counter =0; counter < getNumber(); counter++){	
	System.out.printf ("%d   %-10s  %-10s    %-10s      %-10s    %-10s        \n",count1,itemsName.get(counter),itemsBrand.get(counter)
			,itemsSerialNumber.get(counter),itemsManuDate.get(counter),itemsExpDate.get(counter));;
		count1++;	
}

count1=1;
System.out.println();
display.printStockOut();
for(int secondCounter =0;secondCounter < getNumber();secondCounter++){
	System.out.printf ("%d   %-10s    %-10s   R%-10.2f   R%-10.2f       %-5d%-5d  \n",count1,itemsArrivalDate.get(secondCounter),itemsDepartureDate.get(secondCounter),itemsPrice.get(secondCounter),TotalSold.get(secondCounter),itemsIn.get(secondCounter),itemsNumbOut.get(secondCounter));
	count1++;
	}

display.displayHorizontalLine();
}
public void displayChart(){
	display.chart();
	count1 = 1;
	for(int counter =0; counter < getNumber(); counter++){
		double percent = (double)((itemsNumbOut.get(counter)*100)/itemsNumbIn.get(counter));
		percentage.add (percent);
		System.out.printf("%d   %-10s  %.2f", count1,itemsName.get(counter),percentage.get(counter));
		System.out.println();
	count1++;
	}
	System.out.println();
	display.displayHorizontalLine();
}

}

