package licence.pro.td_banque_skopal.models;

import java.util.UUID;

public class Compte {
	
	private String id = UUID.randomUUID().toString();
	private String idClient;
	private double balance;
	
	public Compte(String id, String idClient, double balance) {
		this.id = id;
		this.idClient = idClient;
		this.balance = balance;
	}
	
	public Compte() {
		
	}
	
	public String getId() {
		return this.id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getIdClient() {
		return this.idClient;
	}
	
	public void setIdClient(String idCLient) {
		this.idClient = idCLient;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
}
