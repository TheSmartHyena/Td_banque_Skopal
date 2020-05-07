package licence.pro.td_banque_skopal.models;

import licence.pro.td_banque_skopal.dao.DaoCompte;
import licence.pro.td_banque_skopal.singletons.SDaoCompte;

public class CompteTools {
	
	private DaoCompte daoCompte = null;
	
	public CompteTools() {
		daoCompte = SDaoCompte.getInstance();
	}
	
	public void retrait(Compte compte, double montant) {		
		if (compte.getBalance() < montant && compte.getNegativeBalanceAllowed() || compte.getBalance() >= montant) {			
			compte.setBalance(compte.getBalance() - montant);
			daoCompte.update(compte);
		} else {
			// raise error and send to user
		}		
	}
	
	public void depot(Compte compte, double montant) {
		compte.setBalance(compte.getBalance() + montant);
		daoCompte.update(compte);
	}
	
}
