import java.util.ArrayList;
public class application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Applicatie is gestart");
		
		Product p = new Product();
		p.name = "TV";
		
		Product p2 = new Product();
		
		p2.name = "Wasmachine";
		p2.storage = 12;
		int newStorage = p2.decreaseStorage(2);
		
		System.out.println("New storage = " + newStorage);
		
		Product p3 = new Product();
		
		Product p4 = new Product("PC");
		
		System.out.println(p3.name);
		//p.printName();
		Warehouse w1 = new Warehouse();
		Warehouse w2 = new Warehouse();
		w1.allItems = 200;
		w1.openOrNot = true;
		w1.NameWarehouse = "Utrecht Working Talent Warehouse";
		w1.product = "Pasta";
		w1.profit = 1000.00;
		
		w1.printAllItem();
		w1.printNameWarhouse();
		w1.printProfit();
		w1.printAllItem();
		
		w2.allItems = 10;
		w2.openOrNot = false;
		w2.NameWarehouse = "Tilburg Working Talent Warehouse";
		w2.product = "taart";
		w2.profit = 123.12;
		
		w2.printAllItem();
		w2.printNameWarhouse();
		w2.printProfit();
		
		ArrayList<String> spullen = new ArrayList<String>();
		spullen.add("pizza");
		spullen.add("bonen");
		spullen.add("peperoni");
		
		Warehouse W3 = new Warehouse();
		
		Warehouse W4 = new Warehouse("Kees Warehouse");
		
		Warehouse W5 = new Warehouse(spullen);
		
		
	}

}
