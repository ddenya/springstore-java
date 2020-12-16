<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="/WEB-INF/views/template/header.jsp" %>

    <div class="container-wrapper">
    	
    	<div class="container">
    	
			<div class="page-header">
				<h1>Add product</h1>
				<p class="lead">Fill the information to add product</p>
			</div>
			
			<!-- commandName = model  -->
			<form:form action="${pageContext.request.contextPath}/admin/productInventory/addProduct" method="post" commandName="product">
			
				<div class="form-group">
					<label for="name">Name</label>
						<!--  path = attribute name of model which we are submitting -->
						<form:input path="productName" id="name" class="form-Control" />
				</div>
				
				<div class="form-group">
					<label for="name">Description</label>
						<!--  path = attribute name of model which we are submitting -->
						<form:input path="productDescription" id="description" class="form-Control" />
				</div>
								
				<div class="form-group">
					<label for="name">Price</label>
						<!--  path = attribute name of model which we are submitting -->
						<form:input path="productPrice" id="price" class="form-Control" />
				</div>
				
				<div class="form-group">
					<label for="name">Units in stock</label>
						<!--  path = attribute name of model which we are submitting -->
						<form:input path="unitInStock" id="stock" class="form-Control" />
				</div>
				
				<div class="form-group">
					<label for="name">Manufacturer</label>
						<!--  path = attribute name of model which we are submitting -->
						<form:input path="productManufacturer" id="manufacturer" class="form-Control" />
				</div>
				
				<div class="form-group">
					<label for="category">Category</label>
						<label class ="checkbox-inline">
							<form:radiobutton path="productCategory" id="category" value="instrument"/>
							Instrument</label>		
							
					<label class ="checkbox-inline">
						<form:radiobutton path="productCategory" id="category" value="record"/>
						Record</label>					
									
					<label class ="checkbox-inline">
						<form:radiobutton path="productCategory" id="category" value="accessory"/>
						Accessory</label>
				</div>
				
				<div class="form-group">
					<label for="condition">Condition</label>
						<label class ="checkbox-inline">
							<form:radiobutton path="productCondition" id="condition" value="new"/>
							New</label>		
							
					<label class ="checkbox-inline">
						<form:radiobutton path="productCondition" id="condition" value="used"/>
						Used</label>					
				</div>
				
				<div class="form-group">
					<label for="status">Status</label>
						<label class ="checkbox-inline">
							<form:radiobutton path="productStatus" id="status" value="active"/>
							Active</label>		
							
					<label class ="checkbox-inline">
						<form:radiobutton path="productStatus" id="status" value="hidden"/>
						Hidden</label>					
				</div>
				
				<br> 
				<br>
				<input type="submit" value="submit" class="btn btn-default">
				<a href="<c:url value="/admin/productInventory" />" class="btn btn-default">Cancel</a>
	
			</form:form>
			
			
		</div>
	</div>
		
<%@ include file="/WEB-INF/views/template/footer.jsp" %>  