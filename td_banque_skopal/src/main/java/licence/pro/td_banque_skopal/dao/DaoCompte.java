package licence.pro.td_banque_skopal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import licence.pro.td_banque_skopal.factories.FactoryCompte;
import licence.pro.td_banque_skopal.interfaces.ICompteDao;
import licence.pro.td_banque_skopal.jdbc.ConnexionMysql;
import licence.pro.td_banque_skopal.models.Compte;

public class DaoCompte implements ICompteDao {
	
private Connection db = null;
	
	public DaoCompte() {
		this.db = ConnexionMysql.getInstance();
	}
	
	public void create(Compte compte) {
		try {
			PreparedStatement prepare = this.db.prepareStatement("INSERT INTO accounts (idClient, balance, negativeBalanceAllowed) VALUES(?, ?, ?)");
			
			prepare.setInt(1, compte.getIdClient());
			prepare.setDouble(2, compte.getBalance());
			prepare.setBoolean(3, compte.getNegativeBalanceAllowed());
			
			prepare.executeUpdate();				
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}
	
	public void createWithId(Compte compte) {
		try {
			PreparedStatement prepare = this.db.prepareStatement("INSERT INTO accounts (id, idClient, balance, negativeBalanceAllowed) VALUES(?, ?, ?, ?)");
			
			prepare.setInt(1, compte.getId());
			prepare.setInt(2, compte.getIdClient());
			prepare.setDouble(3, compte.getBalance());
			prepare.setBoolean(4, compte.getNegativeBalanceAllowed());
			
			prepare.executeUpdate();				
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	public void update(Compte compte) {
		try {
			PreparedStatement prepare = this.db.prepareStatement("UPDATE accounts SET accounts.idClient='" + compte.getIdClient() + "', accounts.balance='" + compte.getBalance() + "', accounts.negativeBalanceAllowed=" + compte.getNegativeBalanceAllowed() + " WHERE accounts.id=" + compte.getId());                                       	                						
			prepare.executeUpdate();
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(Compte compte) {
		try {
			PreparedStatement prepare = this.db.prepareStatement("DELETE FROM accounts WHERE accounts.id=" + compte.getId());                                       	                   
			prepare.executeUpdate();
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Compte getCompteById(int id) {
		Compte result = null;
		
		try {
			ResultSet compte = this.db.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM accounts WHERE accounts.id = " + id);
			
		    if (compte.first()) { 		    		    	
		    	result = FactoryCompte.getCompte(compte.getInt("id"), compte.getInt("idClient"), compte.getDouble("balance"), compte.getBoolean("negativeBalanceAllowed") );
		    }
	    			              
		  } catch (SQLException e) {
		    e.printStackTrace();
		  }
		
		
		return result;
	}
	
	public ArrayList<Compte> getList() {		
		ArrayList<Compte> result = new ArrayList<Compte>();
		
		try {
			ResultSet comptes = this.db.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM accounts");
					    
		    while (comptes.next()) {                      		        	
	        	result.add( FactoryCompte.getCompte(comptes.getInt(1), comptes.getInt(2), comptes.getDouble(3), comptes.getBoolean(4)) );		        	
		    }		    	
		    
		  } catch (SQLException e) {
		    e.printStackTrace();
		  }
								
		return result;
	}
	
	public Compte read() {
		return null;
	}
	
}
