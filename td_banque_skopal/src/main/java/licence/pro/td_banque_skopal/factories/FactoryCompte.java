package licence.pro.td_banque_skopal.factories;

import licence.pro.td_banque_skopal.models.Compte;

public class FactoryCompte {
	
	public static Compte getCompte(String id, String idClient, Double balance) {
		return new Compte(id, idClient, balance);
	}
	
	public static Compte getCompteVide() {
		return new Compte();
	}
	
}
