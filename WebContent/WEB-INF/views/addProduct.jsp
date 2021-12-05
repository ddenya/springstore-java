<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ include file="/WEB-INF/views/template/header.jsp"%>

<div class="container-wrapper">

	<div class="container">
		<div class="empty-space">
			<br> <br> <br>
		</div>

		<div class="page-header">
			<h1>Add product</h1>
			<p class="lead">Fill the information to add product</p>
		</div>

		<!-- commandName = model  -->
		<form:form
			action="${pageContext.request.contextPath}/admin/productInventory/addProduct"
			method="post" commandName="product">
			
			<div class="form-group row">
				<label for="productName" class="col-sm-1 col-form-label">Name</label>
				<!--  path = attribute name of model which we are submitting -->
				<div class="col-sm-6">
				<form:input path="productName" id="name" class="form-control" />
				</div>
			</div>

			<div class="form-group row">
				<label for="productDescription" class="col-sm-1 col-form-label">Description</label>
				<!--  path = attribute name of model which we are submitting -->
				<div class="col-sm-6">
				<form:input path="productDescription" id="description" class="form-control" />
				</div>
			</div>

			<div class="form-group row">
				<label for="productPrice" class="col-sm-1 col-form-label">Price</label>
				<!--  path = attribute name of model which we are submitting -->
				<div class="col-sm-6">
				<form:input path="productPrice" id="price" class="form-control" />
				</div>
			</div>

			<div class="form-group row">
				<label for="unitInStock" class="col-sm-1 col-form-label">Units in stock</label>
				<!--  path = attribute name of model which we are submitting -->
				<div class="col-sm-6">
				<form:input path="unitInStock" id="stock" class="form-control" />
				</div>
			</div>

			<div class="form-group row">
				<label for="productManufacturer" class="col-sm-1 col-form-label">Manufacturer</label>
				<!--  path = attribute name of model which we are submitting -->
				<div class="col-sm-6">
				<form:input path="productManufacturer" id="manufacturer" class="form-control" />
				</div>
			</div>

			<div class="form-group row">
				<label for="category" class="col-sm-1 col-form-label">Category</label>
				<div class="col-sm-2">
				<label class="checkbox-inline "> <form:radiobutton path="productCategory" id="category" value="instrument"/> Instrument </label> 
				</div>
				<div class="col-sm-2">
				<label class="checkbox-inline"> <form:radiobutton path="productCategory" id="category" value="record"/> Record </label> 
				</div>
				<div class="col-sm-2">
				<label class="checkbox-inline"> <form:radiobutton path="productCategory" id="category" value="accessory"/> Accessory </label>
				</div>
			</div>

			<div class="form-group row">
				<label for="condition" class="col-sm-1 col-form-label">Condition</label>
				<div class="col-sm-2">
				<label class="checkbox-inline"> <form:radiobutton path="productCondition" id="condition" value="new" /> New </label> 
				</div>
				<div class="col-sm-2">
				<label class="checkbox-inline"> <form:radiobutton path="productCondition" id="condition" value="used" /> Used </label>
				</div>
			</div>

			<div class="form-group row">
				<label for="status" class="col-sm-1 col-form-label">Status</label>
				<div class="col-sm-2">
				<label class="checkbox-inline"><form:radiobutton path="productStatus" id="status" value="active" /> Active</label>
				</div>
				<div class="col-sm-2">
				<label class="checkbox-inline"> <form:radiobutton path="productStatus" id="status" value="hidden" /> Hidden </label>
				</div>
			</div>

			<input type="submit" value="submit" class="btn btn-success">
			<a href="<c:url value="/admin/productInventory" />"
			class="btn btn-danger">Cancel</a>
		</form:form>
	</div>
</div>

<%@ include file="/WEB-INF/views/template/footer.jsp"%>
