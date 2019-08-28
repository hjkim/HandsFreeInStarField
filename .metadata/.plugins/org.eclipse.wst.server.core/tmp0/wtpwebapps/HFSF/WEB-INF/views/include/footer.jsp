<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- Scroll to Top Button-->
  <a class="scroll-to-top rounded" href="#page-top">
    <i class="fas fa-angle-up"></i>
  </a>

  <!-- Bootstrap core JavaScript-->
  <script src="/resources/bootstrap/vendor/jquery/jquery.min.js"></script>
  <script src="/resources/bootstrap/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Core plugin JavaScript-->
  <script src="/resources/bootstrap/vendor/jquery-easing/jquery.easing.min.js"></script>

  <!-- Page level plugin JavaScript-->
  <script src="/resources/bootstrap/vendor/chart.js/Chart.min.js"></script>
  <script src="/resources/bootstrap/vendor/datatables/jquery.dataTables.js"></script>
  <script src="/resources/bootstrap/vendor/datatables/dataTables.bootstrap4.js"></script>

  <!-- Custom scripts for all pages-->
  <script src="/resources/bootstrap/js/sb-admin.min.js"></script>
  <script src="/resources/bootstrap/js/demo/datatables-demo.js"></script>
  <script src="/resources/bootstrap/js/demo/pickUpTime.js"></script>
  <script src="/resources/bootstrap/js/demo/packTime.js"></script>
  <script src="/resources/bootstrap/js/demo/tapCss.js"></script>
  <script src="/resources/bootstrap/js/demo/pickUpArea.js"></script>
  <script src="/resources/bootstrap/js/demo/pickUpBar.js"></script>
  <script>
  $(document).ready(function() {
	  myFunction();
  });
  
	var myVar;
	
	function myFunction() {
	  myVar = setTimeout(showPage(), 5000);
	}
	
	function showPage() {
	  document.getElementById("loader").style.display = "none";
	  document.getElementById("myDiv").style.display = "block";
 }
</script>
</body>

</html>
