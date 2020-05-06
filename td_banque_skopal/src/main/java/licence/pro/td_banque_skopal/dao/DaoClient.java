package licence.pro.td_banque_skopal.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
		
		try {
			ResultSet result = this.db.createStatement(
			ResultSet.TYPE_SCROLL_INSENSITIVE,
			ResultSet.CONCUR_READ_ONLY).executeQuery("SELECT * FROM clients WHERE clients.id = " + id);
		    if (result.first()) { 		    		    	
		    	System.out.println(result.getString("balance"));
		    	System.out.println(result.getString("name"));
		    }
		    	
		              
		  } catch (SQLException e) {
		    e.printStackTrace();
		  }
		
		
		return new Client();
	}
	
	public List<Client> getList() {
		return new ArrayList<Client>();
	}
	
	public Client read() {
		return null;
	}
	
}


