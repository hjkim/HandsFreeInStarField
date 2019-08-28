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
	label = ['1시간', '2시간', '3시간', '4시간', '5시간', '6시간'];
	renderChart(data1, data2, label);
}



function renderChart(data1, data2, label ){
	var ctx = document.getElementById('myChart1').getContext('2d');
	var myChart = new Chart(ctx, {
		type: 'bar',
		data: {
			labels: label,
			datasets: [{
				label: '평일',
				borderColor: 'rgba(0, 76, 154, 1)',
				backgroundColor: 'rgba(0, 76, 154, 1)',
				data: data1
			}, {
				label: '주말',
				borderColor: 'rgba(255, 99, 132, 1)',
				backgroundColor: 'rgba(255, 99, 132, 1)',
				data: data2
			}]
		},
		options: {
			responsive: true,
			title: {
				display: true,
				text: '패킹 소요 시간 '
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
		url 	 : "/getDueTimeGraphData.do",
		type 	 : "post",
		data 	 : { id : input},
		dataType : "json",
		async: false,
		success  : function(data){
			for (var i in data){
				datas.push(data[i]);
			}
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
























