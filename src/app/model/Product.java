package app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

// @Entity maps instance of an object to row in tale
@Entity
@Table(name = "Product")
public class Product {
	
	// @Id defines primary key in a table
	@Id
	// Generate ProductId in sequence order
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	
	@Column(name="productName")
	private String productName;

	@Column(name="productCategory")
	private String productCategory;
	
	@Column(name="productDescription")
	private String productDescription;
	
	@Column(name="productPrice")
	private double productPrice;
	
	@Column(name="productCondition")
	private String productCondition;
	
	@Column(name="productStatus")
	private String productStatus;
	
	@Column(name="productManufacturer")
	private String productManufacturer;
	
	@Column(name="unitInStock")
	private int unitInStock;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	
	public String getProductName() {
		return productName;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public String getProductCondition() {
		return productCondition;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public int getUnitInStock() {
		return unitInStock;
	}
	public String getProductManufacturer() {
		return productManufacturer;
	}
	
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public void setProductCondition(String productCondition) {
		this.productCondition = productCondition;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}
	public void setProductManufacturer(String productManufacturer) {
		this.productManufacturer = productManufacturer;
	}
}
