package org.sid.web;
import java.util.Collection;
import java.util.List;

import org.apache.log4j.Logger;
import org.sid.entities.Produit;
import org.sid.service.ICatalogueService;
import org.sid.service.ServiceSingleton;
import org.springframework.beans.factory.annotation.Autowired;

import com.opensymphony.xwork2.ActionSupport;
public class ProduitAction extends ActionSupport {
	public String ref;
	public Produit produit=new Produit();
	public List<Produit> produits;
	public boolean editMode=false;
	@Autowired
	private ICatalogueService service;
	Logger logger=Logger.getLogger(this.getClass());
  
	
	public String index(){
	  produits=service.listProduits();
	  return SUCCESS;
  }
  public String save(){
	  logger.info(produit.getReference());
	  if(editMode==false)
	    service.addProduit(produit);
	  else{
		service.updateProduit(produit);
	  }
	  produits=service.listProduits();
	  return SUCCESS;
  }
  public String delete(){
	  service.deleteProduit(ref);
	  produits=service.listProduits();
	  return SUCCESS;
  }
  public String edit(){
	  produit=service.getProduit(ref);
	  produits=service.listProduits();
	  editMode=true;
	  return SUCCESS;
  }
}
