<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">

	<div class="container">
		<div class="empty-space">
			<br> <br> <br>
		</div>

		<div class="page-header">
			<h1>Product Detail</h1>
			<p class="lead">Here is details of the products</p>
		</div>

		<div class="container">
			<div class="row">
				<div class="col-md-5">
					<img src="data:image/jpg,${product.productImage} alt="image" style="width: 100% height: 300px" />
				</div>

				<div class="col-md-5">
					<h3>${product.productName}</h3>
					<p>${product.productDescription}</p>
					<p>
						<strong>Manufacturer</strong> : ${product.productManufacturer}
					</p>
					<p>
						<strong>Category</strong> : ${product.productCategory}
					</p>
					<p>
						<strong>Condition</strong> : ${product.productCondition}
					</p>
					<p>
						<strong>Price</strong> : ${product.productPrice}
					<p>
				</div>
			</div>
		</div>
		
		<p class="text-center"> 
			<a href="<spring:url value="/productList"/>">Back to list</a> 
		</p>
		


	</div>
</div>

<%@ include file="/WEB-INF/views/template/footer.jsp"%>
