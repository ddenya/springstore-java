package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import model.Product;

@Repository
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addProduct (Product product) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
		// Will be executed only if I flush it
		session.flush();
	}
	
	public Product getProductById(String id) {
		Session session = sessionFactory.getCurrentSession();
		Product product = (Product) session.get(Product.class, id);
		
		return product;
	}


}
