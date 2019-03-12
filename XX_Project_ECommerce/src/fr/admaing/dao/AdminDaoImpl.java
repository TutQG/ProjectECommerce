package fr.admaing.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
@Stateless
public class AdminDaoImpl implements IAdminDao{

	@PersistenceContext(unitName="PU_ECommerce")
	private EntityManager em;
}
