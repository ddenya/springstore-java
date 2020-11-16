package app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import app.dao.ProductDao;
import app.dao.impl.ProductDaoImpl;
import app.model.Product;

@Controller
public class HomeController {
	
	@Autowired
	ProductDao productDao;// = new ProductDaoImpl();
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/productList")
	public String getProducts(Model model) {
		
		List<Product> productList = productDao.getAllProducts();
		
		// When we return the view, model will be attached to view
		model.addAttribute("products", productList);
		
		// name of view
		return "productList";
	}
	
	@RequestMapping("/productList/viewProduct/{productId}")
	public String viewProduct(@PathVariable String productId, Model model) throws IOException{
		
		Product product = productDao.getProductById(productId);
		model.addAttribute("product", product);
		
		return "viewProduct";
	}

}