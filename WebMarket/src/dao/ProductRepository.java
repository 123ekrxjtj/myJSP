package dao;
import java.util.ArrayList;

import dto.Product;

public class ProductRepository {
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	
	public ProductRepository() {
		Product phone = new Product("P1234", "iPhone 6s", 800000);
		phone.setDescription("4.7-inch, 1334x750 Renina HD display, 8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitsInStock(1000);
		phone.setCondition("new");
		
		Product notebook = new Product("P1234", "iPhone 6s", 800000);
		notebook.setDescription("4.7-inch, 1334x750 Renina HD display, 8-megapixel iSight Camera");
		notebook.setCategory("Smart Phone");
		notebook.setManufacturer("Apple");
		notebook.setUnitsInStock(1000);
		notebook.setCondition("new");
		
		Product tablet = new Product("P1234", "iPhone 6s", 800000);
		tablet.setDescription("4.7-inch, 1334x750 Renina HD display, 8-megapixel iSight Camera");
		tablet.setCategory("Smart Phone");
		tablet.setManufacturer("Apple");
		tablet.setUnitsInStock(1000);
		tablet.setCondition("new");
	}
}
