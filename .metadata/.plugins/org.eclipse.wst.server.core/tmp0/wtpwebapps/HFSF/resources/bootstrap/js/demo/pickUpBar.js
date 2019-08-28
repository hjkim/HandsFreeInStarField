var ctx = document.getElementById("myBarChart");
var barData = [];
var datas = [];
	 
window.onload = data(barData);

function data(barData){

	getData(barData);
	renderChart(barData);
}

function chartData(data){
	getData(data);
	renaderChart(data);
}
	 
function renderChart(barData){
	var myPieChart = new Chart(ctx, {
		   type: 'bar',
		   data: {
		     labels: ["1시간", "2시간", "3시간","4시간","5시간","6시간","7시간","8시간","9시간","10시간"],
		     datasets: [{
		       data: barData,
		       backgroundColor: ['#007bff', '#dc3545', '#ffc107', '#28a745','#F5F5DC','#FFD700','#808080','#F08080','#90EE90','#87CEFA'],
		     }],
		   },
		 });
}
	
	 
function getData(datas){
	$.ajax({
		url			: "/getPickUpBarData.do",
		type		: "post",
		dataType	: "json",
		async		: false,
		success		: function(data){
			for (var i in data){
				datas.push(data[i]);
			}
			update(datas)
		}
	});
}

function update(inputData){
	data = inputData
}
