package licence.pro.td_banque_skopal.models;

import java.util.UUID;

public class Client {

	private String id = UUID.randomUUID().toString();
	private String lastName;
	private String name;
	private double balance;

	public Client(String id, String name, String lastName) {
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
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

}

