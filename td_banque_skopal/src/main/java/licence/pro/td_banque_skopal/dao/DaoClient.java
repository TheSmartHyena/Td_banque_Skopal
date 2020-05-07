package licence.pro.td_banque_skopal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import licence.pro.td_banque_skopal.factories.FactoryClient;
import licence.pro.td_banque_skopal.interfaces.IClientDao;
import licence.pro.td_banque_skopal.jdbc.ConnexionMysql;
import licence.pro.td_banque_skopal.models.Client;

public class DaoClient implements IClientDao {
	
	private Connection db = null;
	
	public DaoClient() {
		this.db = ConnexionMysql.getInstance();
	}
	
	public void create(Client client) {
		try {
			PreparedStatement prepare = this.db.prepareStatement("INSERT INTO clients (name, lastName) VALUES(?, ?)");
                                       	                   
			prepare.setString(1, client.getName());
			prepare.setString(2, client.getLastName());
			
			prepare.executeUpdate();
					
		} catch (SQLException e) {
			e.printStackTrace();
		}		
	}

	public void update(Client client) {
		try {
			PreparedStatement prepare = this.db.prepareStatement("UPDATE clients SET clients.name='" + client.getName() + "', clients.lastName='" + client.getLastName() + "' WHERE clients.id=" + client.getId());                                       	                						
			prepare.executeUpdate();
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void delete(Client client) {
		try {
			PreparedStatement prepare = this.db.prepareStatement("DELETE FROM clients WHERE clients.id=" + client.getId());                                       	                   
			prepare.executeUpdate();
					
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public Client getClientById(int id) {
		Client result = null;
		
		try {
			ResultSet client = this.db.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM clients WHERE clients.id = " + id);
			
		    if (client.first()) { 		    		    	
		    	// System.out.println(result.getString("balance"));
		    	// System.out.println(result.getString("name"));
		    	result = FactoryClient.getClient(client.getString("id"), client.getString("name"), client.getString("lastName") );
		    }
	    	
		              
		  } catch (SQLException e) {
		    e.printStackTrace();
		  }
		
		
		return result;
	}
	
	public ArrayList<Client> getList() {		
		ArrayList<Client> result = new ArrayList<Client>();
		
		try {
			ResultSet clients = this.db.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM clients");
					    
		    while (clients.next()) {                      		        	
	        	result.add( FactoryClient.getClient(clients.getString(1), clients.getString(2), clients.getString(3)) );		        	
		    }		    	
		    
		  } catch (SQLException e) {
		    e.printStackTrace();
		  }
								
		return result;
	}
	
	public Client read() {
		return null;
	}
	
}


