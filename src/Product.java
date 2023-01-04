
public class Product {
	
	public String name;
	
	
	public boolean soldOut; //false
	
	
	public int storage; //0
	
	public Product() {
		System.out.println("In constructor");
		name = "";
		soldOut = false;
		storage = 1;
	}
	public Product(String newName) {
		name = newName;
	}
	
	public void printName() {
		System.out.println("Naam is " + name);
	}

	public int decreaseStorage(int decrease) {
		storage = storage - decrease;
		
		return storage;
	}
}
