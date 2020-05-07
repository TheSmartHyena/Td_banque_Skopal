package licence.pro.td_banque_skopal.models;

import java.util.concurrent.ThreadLocalRandom;

public class Compte {
	
	private int id = ThreadLocalRandom.current().nextInt(10000, 99999);
	private int idClient;
	private double balance;
	private boolean negativeBalanceAllowed;
	
	public Compte(int id, int idClient, double balance, boolean negativeBalanceAllowed) {
		this.id = id;
		this.idClient = idClient;
		this.balance = balance;
		this.negativeBalanceAllowed = negativeBalanceAllowed;
	}
	
	public Compte() {
		
	}
	
	public int getId() {
		return this.id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getIdClient() {
		return this.idClient;
	}
	
	public void setIdClient(int idCLient) {
		this.idClient = idCLient;
	}
	
	public double getBalance() {
		return this.balance;
	}
	
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public boolean getNegativeBalanceAllowed() {
		return this.negativeBalanceAllowed;
	}
	
	public void setNegativeBalanceAllowed(boolean negativeBalanceAllowed) {
		this.negativeBalanceAllowed = negativeBalanceAllowed;
	}
	
	@Override
	public boolean equals(Object obj) {
		boolean result = true;
		
		Compte compte = (Compte) obj;
		if (!(compte.getId() == this.id)) {
			result = false;
		}
		
		if (!(compte.getIdClient() == this.idClient)) {
			result = false;
		}
		
		if (!(compte.getBalance() == this.balance)) {
			result = false;
		}
		
		if (!(compte.getNegativeBalanceAllowed() == this.negativeBalanceAllowed)) {
			result = false;
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		String result = "";
		
		result = "Id:" + this.id + "\n";
		result = result + "IdCLient:" + this.idClient + "\n";
		result = result + "Balance:" + this.balance + "\n";
		result = result + "NegativeBalanceAllowed:" + this.negativeBalanceAllowed + "\n";
		
		return result;
	}
	
}
