package Interface;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class Product implements Serializable, CompanyPortfolio {
	
	private String ID;
	private String name;
	private double cost;
	
	
	public Product(String ID, String name, double cost){
	
		this.ID = ID;
		this.name = name;
		this.cost = cost;
		
	}
	
	@Override
	public void serializeToJSON(Serializable jsonSerializable, File file)
			throws IOException {
		// TODO Auto-generated method stub
		Gson object = new Gson();
		String gosh = object.toJson(jsonSerializable);
		FileWriter doo = new FileWriter(file);
		doo.write(gosh);
		doo.close();
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	@Override
	public void computeProductivity() {
		// TODO Auto-generated method stub
		
		if(name.equals(name)){
			System.out.println("Burgers are delicious");
			
		}else{
			System.out.println("I like bread");
		}
	}

}
