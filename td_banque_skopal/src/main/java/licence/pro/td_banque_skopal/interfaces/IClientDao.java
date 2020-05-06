package licence.pro.td_banque_skopal.interfaces;

import licence.pro.td_banque_skopal.models.Client;

public interface IClientDao extends IDao<Client> {

	Client getClientById(int id);

}
