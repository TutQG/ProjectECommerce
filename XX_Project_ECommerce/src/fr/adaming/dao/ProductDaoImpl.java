package fr.adaming.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import fr.adaming.entities.Product;

@Stateless

public class ProductDaoImpl implements IProductDao {

	@PersistenceContext(unitName = "PU_ECommerce")
	private EntityManager em;

	@Override
	public List<Product> getAllPdt(Product pdt) {
		String req = "SELECT pdt FROM Product pdt";

		Query query = em.createQuery(req);

		return query.getResultList();
	}

	@Override
	public Product addPdt(Product pdt) {

		em.persist(pdt);
		return pdt;
	}

	@Override
	public int updatePdt(Product pdt) {
		String req = "UPDATE Product as pdt SET pdt.designation:=pDesign, pdt.description:=pDescr, pdt.price:=pPrice,"
				+ " pdt.quantity:=pQuantity, pdt.picture:=pPicture WHERE id:=pIdPdt";
		Query query = em.createQuery(req);

		query.setParameter("pDesign", pdt.getDesignation());
		query.setParameter("pDescr", pdt.getDescription());
		query.setParameter("pPrice", pdt.getPrice());
		query.setParameter("pQuantity", pdt.getQuantity());
		query.setParameter("pPicture", pdt.getPicture());
		query.setParameter("pIdPdt", pdt.getId());

		return query.executeUpdate();
	}

	@Override
	public int delPdt(Product pdt) {
		String req = "DELETE Product as pdt WHERE id:=pIdPdt";

		Query query = em.createQuery(req);

		query.setParameter("pIdPdt", pdt.getId());

		return query.executeUpdate();
	}

	@Override
	public Product getPdtById(Product pdt) {
		// TODO Auto-generated method stub
		return null;
	}

}
