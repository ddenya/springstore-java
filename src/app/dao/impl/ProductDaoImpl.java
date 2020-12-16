package app.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import app.dao.ProductDao;
import app.model.Product;

@Repository
@Transactional
public class ProductDaoImpl implements ProductDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addProduct (Product product) {
		
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(product);
		
		// Always has to be flushed to execute statements.
		session.flush();
	}
	
	public Product getProductById(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		// Needs always to be cast
		Product product = (Product) session.get(Product.class, id);
		
		return product;
	}
	
	public List<Product> getAllProducts(){
		
		Session session = sessionFactory.getCurrentSession();
		
		Query query = session.createQuery("from Product");
		List<Product> products = query.list();
		
		// Always has to be flushed to execute statements.
		session.flush();
		
		return products;
	}
	
	public void deleteProduct(int id) {
		
		Session session = sessionFactory.getCurrentSession();
		
		session.delete(getProductById(id));
		
		// Always has to be flushed to execute statements.
		session.flush();
	}
}
