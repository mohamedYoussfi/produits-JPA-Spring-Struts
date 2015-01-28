package org.sid.service;

import org.sid.dao.CatalogueDAOImpl;

public class ServiceSingleton {
  private static CatalogueServiceImpl service;
  static{
	  CatalogueDAOImpl dao=new CatalogueDAOImpl();
	  dao.initialisation();
	  service=new CatalogueServiceImpl();
	  service.setDao(dao);
  }
  public static ICatalogueService getService(){
	  return service;
  }
}
