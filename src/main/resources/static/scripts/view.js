function getValue(){
	var first = $("#firstnum").val();
	var second = $("#secondnum").val();
	$("#displayBox").val("");
	$.ajax({
		url:"http://localhost:8700/solution",
		type: "GET",
		dataType: "json",data: {a:first, b:second}
		
	}).then(function(data){
		$("#displayBox").val(data);
	})
}