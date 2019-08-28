var ctx = document.getElementById("myAreaChart");
var chartLabels = [];
var chartData1 = [];
  
var areaData = [];
var datas = [];

window.onload = data(areaData);

function data(areaData){

	getData(areaData);
	renderChart(areaData);
}

function chartData(areaData){
  	getData(areaData);
  	renaderChart(areaData);
 }


function renderChart(areaData){
	  var myLineChart = new Chart(ctx, {
		  type: 'line',
		  data: {
		    labels: ["10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00", "18:00", "19:00", "20:00", "21:00", "22:00","23:00"],
		    datasets: [{
		      label: "픽업건수",
		      lineTension: 0.3,
		      backgroundColor: "rgba(2,117,216,0.2)",
		      borderColor: "rgba(2,117,216,1)",
		      pointRadius: 5,
		      pointBackgroundColor: "rgba(2,117,216,1)",
		      pointBorderColor: "rgba(255,255,255,0.8)",
		      pointHoverRadius: 5,
		      pointHoverBackgroundColor: "rgba(2,117,216,1)",
		      pointHitRadius: 50,
		      pointBorderWidth: 2,
		      data: areaData,
		    }],
		  },
		  options: {
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
		          min: 0,
		          max: 300,
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

function getData(datas){
	$.ajax({
		url			: "/getPickUpAreaData.do",
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