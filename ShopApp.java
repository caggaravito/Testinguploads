package duke.choice;

public class ShopApp {
	
	public static void main(String[] args) {
 
		//Exercise 3.1
		Customer c1 = new Customer();
		c1.name = "Pinky";
		System.out.println("Welcome to Duke Choice Shop" +" " + c1.name);
		c1.size = "S";
		
		//Exercise 3-2
		double tax = 0.20;
		double total = 0.0;
		
		Clothing item1 = new Clothing();
		Clothing item2 = new Clothing();
		
		Clothing[] items = {item1, item2, new Clothing(), new Clothing()}; //exercise 4-2
		
		item1.description = "Blue Jacket";
		item1.price = 20.9;
		item1.size = "M";
		
		item2.description = "Orange T-Shirt";
		item2.price = 10.5;
		item2.size = "S";
		//exercise 4-4 
		items[2].description = "Green Scarf";
		items[2].price = 5;
		items[2].size = "S";
		
		items[3].description = "Blue T-Shirt";
		items[3].price = 10.5;
		items[3].size = "S";
		
		
		//System.out.println(item1.description +","+item1.price+","+item1.size);
		//System.out.println(item2.description +","+item2.price+","+item2.size);
		
		//total = (item1.price + (item2.price * 2)) * (tax+1);
		// Exercise 4-3 
		for (Clothing item : items){
			if (c1.size.equals(item.size)) {
				total = total + item.price;
				System.out.println(item.description +","+item.price+","+item.size);
				if (total>15) {break;} //exercise 4-4
			}
		}
		System.out.println("Total is " + total);
		
		
	//	for (Clothing item: items) {
		//	System.out.println(item.description +","+item.price+","+item.size);
			
	//	}
		
		//Exercise 4-1
	
		int measurement = 3;
			
		switch (measurement) {
		case 1,2,3 :
			c1.size = "S";
			break;
		case 4,5,6 :
			c1.size = "M";
			break;
		case 7,8,9 :
			c1.size = "L";
			break;
		default:
			c1.size = "X";
		
		}
		//System.out.print("Customer Name: " + c1.name);
		//System.out.println(" - Customer Size: " + c1.size);
	
	
	}
}
