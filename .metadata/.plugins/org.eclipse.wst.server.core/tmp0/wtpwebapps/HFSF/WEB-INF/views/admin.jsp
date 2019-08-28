<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<div class='box'>
				<div class="box-header with-border">
					<h3 class="box-title">Packing List</h3>
				</div>
				<div class='box-body'>
					<!-- ì¶ê°  -->
					<select name="searchType" id="searchType">
						<option value="title">제목</option>
						<option value="writer">작성자</option>
					</select> 
					<input type="text" name='searchKeyword' id="searchKeyword">
					<button id='searchBtn'>Search</button>
					<!-- ê¸°ì¡´ -->
					<button id='newBtn'>New Board</button>
				</div>
				
				
				
			</div>
			<div class="box">
				<div class="box-header with-border">
					<h3 class="box-title">LIST PAGING</h3>
				</div>
				<div class="box-body">
					<table class="table table-bordered">
						<tr>
							<th>ORDER CODE</th>
							<th>PICKUP CODE</th>
							<th>CUSTOMER CODE</th>
							<th>ODR DATE</th>
							<th>ODR STATE</th>
							<th>TOTAL PRICE</th>
						</tr>
						
						<tbody id="tbody">
						<c:forEach items="${list}" var="adminVO">

							<tr>
								<td>${adminVO.ord_id}</td>
								<td>${adminVO.pickup_id}</td>
								<td>${adminVO.customer_id}</td>
								<td>${adminVO.odr_date}</td>
								<td>${adminVO.odr_state}</td>
								<td>${adminVO.total_price}</td>
							</tr>

						</c:forEach>
						</tbody>
					</table>
				</div>
				<!-- /.box-body -->


			
			</div>
		</div>
	</div>
</section>
</body>
</html>
