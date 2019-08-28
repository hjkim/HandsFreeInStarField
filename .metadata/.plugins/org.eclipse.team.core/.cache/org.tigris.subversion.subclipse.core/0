// Set new default font family and font color to mimic Bootstrap's default styling
Chart.defaults.global.defaultFontFamily = '-apple-system,system-ui,BlinkMacSystemFont,"Segoe UI",Roboto,"Helvetica Neue",Arial,sans-serif';
Chart.defaults.global.defaultFontColor = '#292b2c';

// Area Chart Example
var data1 = [];
var data2 = [];

var datas = [];

var labels = data1;

window.onload = data(data1, data2);

function data(data1, data2){
	getData(1,data1);
	getData(2,data2);
	alert(data1);
	alert(data2);
	label = ['10-11시', '11-12시', '12-1시', '1-2시', '2-3시', '3-4시', '4-5시', '5-6시'];
	renderChart(data1, data2, label);
}



function renderChart(data1, data2, label ){
	var ctx = document.getElementById('myChart').getContext('2d');
	var myChart = new Chart(ctx, {
		type: 'line',
		data: {
			labels: label,
			datasets: [{
				label: '평일',
				borderColor: 'rgba(0, 76, 154, 1)',
				backgroundColor: 'rgba(0, 0, 0, 0)',
				data: data1
			}, {
				label: '주말',
				borderColor: 'rgba(255, 99, 132, 1)',
				backgroundColor: 'rgba(0, 0, 0, 0)',
				data: data2
			}]
		},
		options: {
			responsive: true,
			title: {
				display: true,
				text: '시간대 별 주문 '
			},
			tooltips: {
				position: 'average',
				mode: 'index',
				intersect: false,
			},
		}
	});
}


function getData(input,datas){
	$.ajax({
		url 	 : "/getGraphData.do",
		type 	 : "post",
		data 	 : { id : input},
		dataType : "json",
		async: false,
		success  : function(data){
			for (var i in data){
				datas.push(data[i]);
			}
			alert(data);
			update(input, datas)
			
		}
	});
}

function update(num, data){
	if(num == 1){
		data1 = data;
	}else{
		data2 = data;
	}
}
























