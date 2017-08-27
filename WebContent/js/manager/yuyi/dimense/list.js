var toEditUrl ="edit";
//var viewUrl = contextPath + "/manager/linkedUnit/view.do";

$(".addbtn").click(function () {
    toEdit(this.rel);
});

function toEdit(id) {
    var url = toEditUrl + "?tt=" + Math.random(0, 100);
    if(id != null){
    	 url += "&id=" + id;
    }
    window.location.href= url;
}

