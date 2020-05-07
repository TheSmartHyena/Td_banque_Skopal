package licence.pro.td_banque_skopal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		
	}

	public void update(Client client) {
		
	}

	public void delete(Client client) {
		
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
	        	result.add( FactoryClient.getClient(clients.getString(1), clients.getString(2), clients.getString(2)) );		        	
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


