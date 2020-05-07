package licence.pro.td_banque_skopal.main;

import java.util.ArrayList;

import licence.pro.td_banque_skopal.dao.DaoClient;
import licence.pro.td_banque_skopal.models.Client;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// test de la conneion
		// Connection instance = ConnexionMysql.getInstance();
		
		DaoClient instance = new DaoClient();
		Client client = instance.getClientById(42);
		
		System.out.println(client.getId());
		System.out.println(client.getName());
		System.out.println(client.getLastName());
		
		ArrayList<Client> clients = instance.getList();
		for (Client el : clients) {
            System.out.println(el.getId());
            System.out.println(el.getName());
            System.out.println(el.getLastName());
        }
		
		
	}

}
