<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../views/include/header.jsp"%>

    <div id="content-wrapper">

      <div class="container-fluid">

        <!-- Area Chart Example-->
        <div class="card mb-3">
          <div class="card-header">
      		    <b>패킹 진행중 주문 현황</b></div>
          <div class="card-body">
		
		        <table class="table table-striped">	
		        	<thead>
		        		<tr>
		        			<th> 주문코드 </th>
		        			<th> 픽업대 코드</th>
		        			<th> 고객코드 </th>
		        			<th> 주문일자 </th>
		        			<th> 총 가격 </th>
		        			<th> 패킹상태 </th>
		        		<tr>
		        	</thead>
					<tbody>
						<c:forEach items="${odrList}" var="odrList">
							<tr>
								<td>${odrList.odrId}</td>
								<td>${odrList.pickupId}</td>
								<td>${odrList.customerId}</td>
								<td>${odrList.odrDate}</td>
								<td>${odrList.totalPrice}</td>
								<td>${odrList.odrState}</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>


      <!-- /.container-fluid -->

  </div>
  <!-- /#wrapper -->
  <%@include file="../views/include/footer.jsp"%>

</body>

</html>
