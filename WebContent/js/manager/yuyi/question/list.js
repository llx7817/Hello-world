var toSaveUrl =contextPath + "/manager/yuyi/question/edit";
//var viewUrl = contextPath + "/manager/linkedUnit/view.do";
var editUrl =contextPath + "/manager/question/load/edit";
debugger
$("#producttype button").first().addClass("orange");
tid=$("#producttype button").first().attr("myid");

//$("#SurveyDetial").load(editUrl+'?tid='+tid,function(){
//	  $("#SurveyDetial").text("Image loaded");
//	});
var loadUrl =editUrl+'?tid='+tid;
$("#SurveyDetial").load(loadUrl);

$(".chooseTypebtn").click(function () {
	$(this).siblings().removeClass('orange');
	$(this).addClass("orange");
		tid=$(this).attr("myid");  //取tid值
		$(".choosebtn").click(function () {
			var questionTitle=$(this).attr("myname");
			$('#questionTitle').html(questionTitle);
			$(this).siblings().removeClass('orange');
			$(this).addClass("orange");
//			$("#SurveyDetial").load(function(){
//				  $("#sid").text("Image loaded");
//				});
			debugger
			var loadUrl =editUrl+'?tid='+tid;
			$("#SurveyDetial").load(loadUrl);
//			$("#SurveyDetial").load("loadUrl #SurveyDetial");
//			$("#SurveyDetial").load(editUrl+'?tid='+tid,function(){
////				  $("#SurveyDetial").text("5555");
//				});
		});
});

function toEdit(id) {
    var url = toEditUrl + "?tt=" + Math.random(0, 100);
    if(id != null){
    	 url += "&id=" + id;
    }
    window.location.href= url;
}

