
import java.util.ArrayList;
public class Warehouse {

	public int allItems;
	
	public boolean openOrNot;
	
	public String product;
	
	public String NameWarehouse;
	
	public double profit;
	
	public Warehouse() {
		allItems = 100;
		openOrNot = false;
		product = "pizza";
		 System.out.println("You have " +allItems +"items");
	}
	public Warehouse(String WarehouseName) {
		NameWarehouse = WarehouseName;
		System.out.println("Name is " +NameWarehouse);
	}
	
	public Warehouse(ArrayList<String> spullen) {
		 items = spullen;
		 
		 System.out.println("These are the items:"); 
		 for (int i = 0; i < items.size();i++) 
	      { 		      
	          System.out.println(items.get(i)); 		
	      } 
	}
	
	public Warehouse(int Items, boolean yesNo, String producten,
			String WarehouseName, double winst) {
		allItems = Items;
		openOrNot = yesNo;
		product = producten;
		NameWarehouse = WarehouseName;
		profit = winst;	
		System.out.println("You have " +allItems +" Items");
		System.out.println("is the warehouse open? " +openOrNot);
		System.out.println("Your product is " +product);
		System.out.println("The name of you warehouse is " +NameWarehouse);
		System.out.println("Your profit is " +profit);
	}
	
	ArrayList<String> items = new ArrayList<String>();
	
	public void printProfit() {
		System.out.println("Your profit is " +profit);
	}
	public void printAllItem() {
		System.out.println("You have " +allItems);
	}
	
	public void printNameWarhouse() {
		System.out.println("Your warehouse name is " +NameWarehouse);
	}
	public void addItem(String item) {
		items.add(item);
	}
	public void RemoveItem(String item) {
		int index = items.indexOf(item);
		items.remove(index);
	}
	public ArrayList<String> araylist(){
		return items;
	}
	public void printarraylist() {
		for (int i = 0; i < items.size();i++) 
	      { 		      
	          System.out.println(items.get(i)); 		
	      }  
	}
	
}
