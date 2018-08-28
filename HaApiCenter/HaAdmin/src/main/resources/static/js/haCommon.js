
layui.use(['form','layer'], function(){
	form = layui.form,
	 $ = layui.$;
	//监听操作区按钮
	$('#haCommonBtn .layui-btn').on('click', function() {
		var type = $(this).data('type');
		active[type] ? active[type].call(this) : '';
	});
});
