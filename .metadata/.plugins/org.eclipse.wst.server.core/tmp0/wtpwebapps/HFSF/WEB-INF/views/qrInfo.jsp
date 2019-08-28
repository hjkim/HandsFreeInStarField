<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../views/include/header.jsp"%>

<html>

    <div id="content-wrapper">

      <div class="container-fluid">

        <!-- Area Chart Example-->
        <div class="card mb-3">
          <div class="card-header">
      		      주문번호 : <b>${odrVO.odrId}</b></div>
          <div class="card-body">
		
		        <table class="table table-striped">	
					<tbody>
						<tr>
							<td> 고객ID </td>
							<td> ${odrVO.customerId} </td>
						</tr>
						<tr>
							<td> 주문일자 </td>
							<td> ${odrVO.odrDate} </td>
						</tr>
						<tr>
							<td> 픽업센터 </td>
							<td> ${odrVO.pickupId} </td>
						</tr>
						<tr>
							<td> 총 금액 </td>
							<td> ${odrVO.totalPrice} </td>
						</tr>
					</tbody>
				</table>
			</div>
		</div>

        <!-- Area Chart Example-->
        <div class="card mb-3">
          <div class="card-header">
      		   <b>주문상세</b></div>
          <div class="card-body">
		        <table class="table table-striped">	
		        	<thead>
		        		<tr>
		        			<th> 상품 ID </th>
		        			<th> 개수 </th>
		        		</tr>
		        	</thead>
					<tbody>
						<c:forEach var="details" items="${detailList}">
							<tr>
								<td> <c:out value="${details.prodId}"/> </td>
								<td> ${details.prodQty} </td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
		   </div>
        </div>


      <!-- /.container-fluid -->

  
  <!-- /#wrapper -->
  <%@include file="../views/include/footer.jsp"%>
  <script src="js/demo/chart-area-demo.js"></script>

</body>

</html>
