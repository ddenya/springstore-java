package app.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

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
	public String viewProduct(@PathVariable int productId, Model model) throws IOException {
		Product product = productDao.getProductById(productId);
		model.addAttribute("product", product);
		return "viewProduct";
	}

	@RequestMapping("/admin")
	public String adminPage() {
		// Returning admin page view, maps to admin.jsp
		return "admin";
	}

	@RequestMapping("/admin/productInventory")
	public String productInventory(Model model) {
		List<Product> products = productDao.getAllProducts();
		model.addAttribute("products", products);
		return "productInventory";
	}

	@RequestMapping("/admin/productInventory/addProduct")
	public String addProduct(Model model) {
		Product productToAdd = new Product();
		// For default value of radiobuttons on addproduct page
		productToAdd.setProductCategory("Musical Instrument");
		productToAdd.setProductCondition("New");
		productToAdd.setProductStatus("Active");
		model.addAttribute("product", productToAdd);
		return "addProduct";
	}

	// For adding product from addProduct.jsp
	@RequestMapping(value = "/admin/productInventory/addProduct", method = RequestMethod.POST, consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
	public String addProductPost(@ModelAttribute("product") Product product, @RequestPart("productImage") MultipartFile productImage) {
		product.setProductImage(productImage);
		System.out.println("Product: " + product.toString());
		productDao.addProduct(product);
		
		// TODO: Useless ? 
		//MultipartFile productImage = product.getProductImage();
		
		
		return "redirect:/admin/productInventory";
	}
	
	@RequestMapping(value = "/admin/productInventory/deleteProduct/{id}")
		public String deleteProduct (@PathVariable int id, Model model) {
			productDao.deleteProduct(id);
			return "redirect:/admin/productInventory";
		}
 }