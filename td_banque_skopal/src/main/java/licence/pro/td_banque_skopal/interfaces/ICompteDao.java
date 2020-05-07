package licence.pro.td_banque_skopal.interfaces;

import licence.pro.td_banque_skopal.models.Compte;

public interface ICompteDao extends IDao<Compte>{
	Compte getCompteById(int id);
}