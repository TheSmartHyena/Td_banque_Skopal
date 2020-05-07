package licence.pro.td_banque_skopal.models;

import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public class Client {

	private int id = ThreadLocalRandom.current().nextInt(10000, 99999);
	private String lastName;
	private String name;
	private double balance;

	public Client(int id, String name, String lastName) {
		this.id = id;
		this.name = name;
		this.lastName = lastName;
	}

	public Client() {

	}

	public String getName() {
		return name;

	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = true;
		
		Client client = (Client) obj;
		if (!(client.getId() == this.id)) {
			System.out.println("A");
			result = false;
		}
		
		if (!(client.getName().equals(this.name))) {
			System.out.println("B");
			result = false;
		}
		
		if (!(client.getLastName().equals(this.lastName))) {
			System.out.println("C");
			result = false;
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		result = "Id:" + this.id + "\n";
		result = result + "Name:" + this.name + "\n";
		result = result + "LastNAme:" + this.lastName + "\n";
		
		return result;
	}

}

