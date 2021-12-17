package app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

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
	
	@Column(name="productDescription",columnDefinition="TEXT")
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
	
	@Lob
	@Column(name="productImage")
	private MultipartFile productImage;
	
	public int getProductId() {
		return productId;
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
	
	public MultipartFile getProductImage() {
		return productImage;
	}
	
	public void setProductId(int productId) {
		this.productId = productId;
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
	
	public void setProductImage(MultipartFile prosductImage) {
		this.productImage = productImage;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCategory="
				+ productCategory + ", productDescription=" + productDescription + ", productPrice=" + productPrice
				+ ", productCondition=" + productCondition + ", productStatus=" + productStatus
				+ ", productManufacturer=" + productManufacturer + ", unitInStock=" + unitInStock + ", productImage="
				+ productImage + "]";
	}
}
