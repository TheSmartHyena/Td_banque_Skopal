package licence.pro.td_banque_skopal.factories;

import licence.pro.td_banque_skopal.models.Compte;

public class FactoryCompte {
	
	public static Compte getCompte(int id, int idClient, Double balance, boolean negativeBalanceAllowed) {
		return new Compte(id, idClient, balance, negativeBalanceAllowed);
	}
	
	public static Compte getCompteVide() {
		return new Compte();
	}
	
}
