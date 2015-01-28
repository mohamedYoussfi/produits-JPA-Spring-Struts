package org.sid.dao;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.log4j.Logger;
import org.sid.entities.Produit;
public class CatalogueDAOImpl implements ICatalogueDAO {
	private Map<String, Produit> produits=new HashMap<String, Produit>();
	Logger logger=Logger.getLogger(this.getClass());
	public void addProduit(Produit p) {
	  produits.put(p.getReference(), p);	
	}
	public List<Produit> listProduits() {
		return new ArrayList<Produit>(produits.values());
	}
	public Produit getProduit(String idP) {
		return produits.get(idP);
	}
	public void updateProduit(Produit p) {
		produits.put(p.getReference(), p);		
	}
	public void deleteProduit(String idP) {
		produits.remove(idP);		
	}
	public void initialisation(){
		addProduit(new Produit("LQS12","Ordinateur LQ", 4900, 2, true));
		addProduit(new Produit("HP546","Ordinateur HP 45600", 3200, 2, true));
		addProduit(new Produit("Comp12","Ordinateur Compaq", 2100, 4, true));
		logger.info("Initialisation du catalogue");
	}
}
