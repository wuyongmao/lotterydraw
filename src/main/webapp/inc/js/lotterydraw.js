function getEmployeeList() {
	var arr;

	$.ajax({
		url : "emp",
		dataType : 'json',
		async : false,
		success : function(data) {
			arr = data;
		},
		error : function() {

			var arr = [];
		}

	});

	return arr;
}

function getluckyDogsList() {
	var arr2;

	$.ajax({
		url : "getrecord",
		dataType : 'json',
		async : false,
		success : function(data) {
			arr2 = data;
		},
		error : function() {
			var arr2 = [];
		}

	});

	return arr2;
}

function getluckyDogsList2(nd,level) {
	var arr2;
	 
	//record_do.gen01 = record_dl[2];
//	record_do.flag = 'Y';
	
	//getrecord4?nd=2017&level=特等奖
			
	$.ajax({
		url : "getrecord4?nd="+nd+"&level="+level,
		dataType : 'json',
		async : false,
		type : 'get',
		success : function(data) {
			arr2 = data;
		},
		error : function() {
			var arr2 = [];
		}

	});

	return arr2;
}
