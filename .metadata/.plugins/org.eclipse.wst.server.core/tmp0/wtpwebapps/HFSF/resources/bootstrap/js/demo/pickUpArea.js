var ctx = document.getElementById("myChart3");
var chartLabels = [];
var chartData1 = [];
  
var areaData1 = [];
var areaData2 = [];
var datas = [];

window.onload = data(areaData1, areaData2);

function data(areaData1, areaData2){

	getData(1,areaData1);
	getData(2,areaData2);
	renderChart(areaData1,areaData2);
}

function chartData(areaData){
  	getData(areaData);
  	renaderChart(areaData);
 }


function renderChart(areaData1, areaData2){
	  var myLineChart = new Chart(ctx, {
		  type: 'line',
		  data: {
		    labels: ["10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00","23:00"],
		    datasets: [{
		      label: "평일",
		      lineTension: 0.3,
		      backgroundColor: 'rgba(0, 0, 0, 0)',
		      borderColor: 'rgba(0, 76, 154, 1)',

	
		      pointHitRadius: 50,
		      pointBorderWidth: 2,
		      data: areaData1,
		    },
		    {
			      label: "주말",
			      lineTension: 0.3,
			      backgroundColor: 'rgba(0, 0, 0, 0)',
			      borderColor: 'rgba(255, 99, 132, 1)',

	
			      pointHitRadius: 50,
			      pointBorderWidth: 2,
			      data: areaData2,
			    }]
		  },
		  options: {
			  title: {
					display: true,
					text: '픽업 시간 '
				},
		    scales: {
		      xAxes: [{
		        time: {
		          unit: 'date'
		        },
		        gridLines: {
		          display: true
		        },
		        ticks: {
		          maxTicksLimit: 7
		        }
		      }],
		      yAxes: [{
		        ticks: {

		          maxTicksLimit: 5
		        },
		        gridLines: {
		          color: "rgba(0, 0, 0, .125)",
		        }
		      }],
		    },
		    legend: {
		      display: true
		    }
		  }
		});
}

function getData(input, datas){
	$.ajax({
		url			: "/getPickUpAreaData.do",
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
	if(num == 1){
		areaData1 = inputData;
	}else{
		areaData2 = inputData;
	}
	
	
}