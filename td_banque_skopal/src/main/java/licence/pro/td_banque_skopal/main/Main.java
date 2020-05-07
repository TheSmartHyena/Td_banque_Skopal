package licence.pro.td_banque_skopal.main;

import java.util.ArrayList;

import licence.pro.td_banque_skopal.dao.DaoClient;
import licence.pro.td_banque_skopal.dao.DaoCompte;
import licence.pro.td_banque_skopal.factories.FactoryCompte;
import licence.pro.td_banque_skopal.factories.FactoryDao;
import licence.pro.td_banque_skopal.models.Compte;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// test de la conneion
		// Connection instance = ConnexionMysql.getInstance();
		
		DaoClient instance = new DaoClient();
		
		/*Client client = instance.getClientById(2);
		instance.delete(client);*/
		
		
		/*System.out.println(client.getId());
		System.out.println(client.getName());
		System.out.println(client.getLastName());	
		
		client.setName("pouetName");
		client.setLastName("pouetLastName");
		
		instance.update(client);*/
		
		/*Client newClient = FactoryClient.getClientVide();
		newClient.setName("Emmanuel");
		newClient.setLastName("Macron"); */
		
		
		/*instance.create(newClient);
		
		Client client = instance.getClientById(1);
		
		System.out.println(client.getId());
		System.out.println(client.getName());
		System.out.println(client.getLastName());
		
		ArrayList<Client> clients = instance.getList();
		for (Client el : clients) {
            System.out.println(el.getId());
            System.out.println(el.getName());
            System.out.println(el.getLastName());
        }*/
		
		DaoCompte instanceB = FactoryDao.getDaoCompte();
		Compte compte = FactoryCompte.getCompte(56789, 42, 100.0, true);
		
		// instanceB.create(compte);
		
		// compte.setBalance(50.0);
		// compte.setIdClient("45678");
		// compte.setNegativeBalanceAllowed(false);
		// instanceB.update(compte);
		
		// instanceB.delete(compte);
		ArrayList<Compte> comptes = instanceB.getList();
		for (Compte el : comptes) {
            System.out.println(el.getId());
            System.out.println(el.getIdClient());
            System.out.println(el.getBalance());
            System.out.println(el.getNegativeBalanceAllowed());
        }
		
		
		
		
		
	}

}
