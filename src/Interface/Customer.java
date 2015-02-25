package Interface;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

public class Customer implements Serializable, CompanyPortfolio{
	
		private String firstName;
		private String lastName;
		
		
		public Customer(String firstName,String lastName){
			
			this.firstName = firstName;

			this.lastName = lastName;

			
		}
		
		
		

		public String getFirstName() {
			return this.firstName;
		}

		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		
		public String getlastName() {
			return this.lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		
		
		
		public String getName(){
			return lastName + "," + firstName;
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




	@Override
	public void computeProductivity() {
		// TODO Auto-generated method stub
		
		if(firstName.equals(firstName)){
			System.out.println("Louise is the best employee ever");
			
		}else{
			System.out.println("I like bread");
		}
	}

}
