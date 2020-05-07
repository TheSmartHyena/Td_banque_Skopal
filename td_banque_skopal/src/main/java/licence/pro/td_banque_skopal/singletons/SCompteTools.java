package licence.pro.td_banque_skopal.singletons;

import licence.pro.td_banque_skopal.models.CompteTools;

public class SCompteTools {
	
	private SCompteTools() {}
	private static CompteTools instance = null;
	
	public static CompteTools getInstance() {
		if (instance == null) {
			instance = new CompteTools();
		}
		return instance;
	}
	
}
