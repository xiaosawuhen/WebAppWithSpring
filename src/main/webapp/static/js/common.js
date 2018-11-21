var SystemAjax = window.SystemAjax || {};
$.extend(SystemAjax, {
	// c 提交JSON类型的Ajax数据
	postJson:function(url, data, success, error){
        $.ajax({
            type: "POST",
            url: url,
            contentType: "application/json; charset=utf-8",
            data: JSON.stringify(data),
            dataType: "json",
            success: success,
            error: error
        });
	},
	getJson:function(url, success, error){
        $.ajax({
            type: "GET",
            url: url,
            dataType: "json",
            success: success,
            error: error
        });
	}
});