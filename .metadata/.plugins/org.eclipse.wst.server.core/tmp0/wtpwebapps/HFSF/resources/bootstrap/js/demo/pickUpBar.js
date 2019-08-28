var ctx = document.getElementById("myChart4");
var barData1 = [];
var barData2 = [];
var datas = [];
	 
window.onload = data(barData1, barData2);

function data(barData1, barData2){

	getData(1,barData1);
	getData(2,barData2);
	renderChart(barData1,barData2);
}

function chartData(data){
	getData(data);
	renaderChart(data);
}
	 
function renderChart(barData1, barData2){
	var myPieChart = new Chart(ctx, {
		   type: 'bar',
		   data: {
		     labels: ["1시간", "2시간", "3시간","4시간","5시간","6시간","7시간","8시간","9시간","10시간"],
		     datasets: [{
		    	label: '평일',
		       data: barData1,
		       borderColor: 'rgba(0, 76, 154, 1)',
		       backgroundColor: 'rgba(0, 76, 154, 1)',
		     },
		     {
		    	label: '주말',
			   data: barData2,
			   borderColor: 'rgba(255, 99, 132, 1)',
			   backgroundColor: 'rgba(255, 99, 132, 1)',
			  }
		     ],
		   },
		   options:{
			   title: {
					display: true,
					text: '픽업 소요 시간 '
				}
		   }
		 });
}
	
	 
function getData(input, datas){
	$.ajax({
		url			: "/getPickUpBarData.do",
		type		: "post",
		data		: {id : input},
		dataType	: "json",
		async		: false,
		success		: function(data){
			for (var i in data){
				datas.push(data[i]);
			}
			update(input, datas)
		}
	});
}

function update(num, inputData){
	data = inputData
	
	if(num == 1){
		barData1 = inputData;
	}else{
		barData2 = inputData;
	}
}
