package Interface;

import java.io.File;
import java.io.IOException;

public class InterfaceDemo {

	public static void main(String[] args) {
		
		Serializable serializableCustomer = new Customer("Louise", "Belcher");
		Serializable serializableProduct = new Product("ABC123", "Burger", 4.99);
	    
		try {
	    	serializableCustomer.serializeToJSON(serializableCustomer, new File("OutputFiles/Customer.json"));
	    	serializableProduct.serializeToJSON(serializableProduct, new File("OutputFiles/Product.json"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		CompanyPortfolio customerPortfolio = (CompanyPortfolio) serializableCustomer;
		CompanyPortfolio productPortfolio = (CompanyPortfolio) serializableProduct;
		customerPortfolio.computeProductivity();
		productPortfolio.computeProductivity();
	    
	}
}
