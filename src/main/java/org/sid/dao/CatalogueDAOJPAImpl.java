package org.sid.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.sid.entities.Produit;

public class CatalogueDAOJPAImpl implements ICatalogueDAO{
	@PersistenceContext
	private EntityManager em;
	public void addProduit(Produit p) {
		em.persist(p);		
	}

	public List<Produit> listProduits() {
		Query req=em.createQuery("select p from Produit p");
		return req.getResultList();
	}

	public Produit getProduit(String idP) {
		return em.find(Produit.class, idP);
	}

	public void updateProduit(Produit p) {
		em.merge(p);
		
	}

	public void deleteProduit(String idP) {
		Produit p=getProduit(idP);
		em.remove(p);	
	}

}
