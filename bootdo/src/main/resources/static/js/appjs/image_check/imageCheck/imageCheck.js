
var prefix = "/image_check/imageCheck"
$(function() {
	load();
});

function load() {
	$('#exampleTable')
			.bootstrapTable(
					{
						method : 'get', // 服务器数据的请求方式 get or post
						url : prefix + "/list", // 服务器数据的加载地址
                        showFooter : true,
					//	showRefresh : true,
					//	showToggle : true,
					//	showColumns : true,
						iconSize : 'outline',
						toolbar : '#exampleToolbar',
						striped : true, // 设置为true会有隔行变色效果
						dataType : "json", // 服务器返回的数据类型
						pagination : true, // 设置为true会在底部显示分页条
						// queryParamsType : "limit",
						// //设置为limit则会发送符合RESTFull格式的参数
						singleSelect : false, // 设置为true将禁止多选
						// contentType : "application/x-www-form-urlencoded",
						// //发送到服务器的数据编码类型
						pageSize : 10, // 如果设置了分页，每页数据条数
						pageNumber : 1, // 如果设置了分布，首页页码
						//search : true, // 是否显示搜索框
						showColumns : false, // 是否显示内容下拉框（选择显示的列）
						sidePagination : "server", // 设置在哪里进行分页，可选值为"client" 或者 "server"
						queryParams : function(params) {
							return {
								//说明：传入后台的参数包括offset开始索引，limit步长，sort排序列，order：desc或者,以及所有列的键值对
								limit: params.limit,
								offset:params.offset,

								// shenli - 这是准备条件项的东西
                                userCheckId : $('#userCheckId').val(),
                                machineId : $('#machineId').val(),
                                userCheckBegin : $('#userCheckBegin').val(),
                                userCheckEnd : $('#userCheckEnd').val()

					           // name:$('#searchName').val(),
					           // username:$('#searchName').val()
							};
						},
						// //请求服务器数据时，你可以通过重写参数的方式添加一些额外的参数，例如 toolbar 中的参数 如果
						// queryParamsType = 'limit' ,返回参数必须包含
						// limit, offset, search, sort, order 否则, 需要包含:
						// pageSize, pageNumber, searchText, sortName,
						// sortOrder.
						// 返回false将会终止请求
                        columns : [
                            // {
                            //     checkbox : true
                            // },
                            // 								{
                            // 	field : 'id',
                            // 	title : ' '
                            // },
                            {
                                // √
                                field : 'acceptNo',
                                title : '相片受理编号',
								footerFormatter: '平均用时(单位：秒):'
                            },
                            // 								{
                            // 	field : 'customId',
                            // 	title : '上传客户端id'
                            // },
                            // 								{
                            // 	field : 'uploadIp',
                            // 	title : '上传照片的客户端ip'
                            // },
                            {
                                field : 'uploadTime',
                                // title : '上传照片的时间'
                                title : '拍照时间'
                            },
                            // 								{
                            // 	field : 'imagePath',
                            // 	title : '照片存放路径'
                            // },
                            {
                                // √
                                field : 'imageName',
                                title : '照片名称'
                            },
                            // 								{
                            // 	field : 'imageSize',
                            // 	title : '照片大小'
                            // },
                            // 								{
                            // 	field : 'imageSpecial',
                            // 	title : '特检标志(0-菲特检,1-特检)'
                            // },
                            // 								{
                            // 	field : 'specialMsg',
                            // 	title : '特检信息'
                            // },
                            // 								{
                            // 	field : 'checkTypeId',
                            // 	title : '所属检测标准的id'
                            // },
                            {
                                // √
                                field : 'machineId',
                                title : '设备号'
                            },
                            // 								{
                            // 	field : 'machineCheckTime',
                            // 	title : ''
                            // },
                            // 								{
                            // 	field : 'machineResult',
                            // 	title : ''
                            // },
                            // 								{
                            // 	field : 'machineCheckValue',
                            // 	title : ''
                            // },
                            // 								{
                            // 	field : 'machineResultMsg',
                            // 	title : ''
                            // },
                            {
                                // √
                                field : 'userCheckId',
                                // title : '人检id'
                                title : '检测员'
                            },
                            // {
                            //     // √
                            //     field : 'userCheckBegin',
                            //     title : '人检开始时间'
                            //     // title : '检测员检测用时'
                            // },
                            // {
                            //     // √
                            // 	field : 'userCheckEnd',
                            // 	title : '人检结束时间'
                            // },
                            {
                                title : '检测员检测用时(单位：秒)',
                                field : 'id'
                            },
                            // 								{
                            // 	field : 'userResult',
                            // 	title : '人检结果(0-未处理,1-合格,2-不合格,3-严重不合格)'
                            // },
                            {
                                // √
                                field : 'finalResult',
                                // title : '最终检测结果(0-未处理,1-合格,2-不合格,3-严重不合格)'
                                title : '检测结果'
                            },
                            {
                                // √
                                field : 'userResultMsg',
                                // title : '人检文字结果'
                                title : '照片不通过原因'
                            }

                            // 								{
                            // 	field : 'dealStage',
                            // 	title : '处理结果已达阶段(0-未处理,1-机检完,3-人检完)'
                            // },
                            // 								{
                            // 	field : 'createTime',
                            // 	title : ''
                            // },
                            // 								{
                            // 	field : 'createUser',
                            // 	title : ''
                            // },
                            // 								{
                            // 	field : 'updateTime',
                            // 	title : ''
                            // },
                            // 								{
                            // 	field : 'updateUser',
                            // 	title : ''
                            // },
                            // 								{
                            // 	field : 'remark',
                            // 	title : ''
                            // },
                            /*{
                                title : '操作',
                                field : 'id',
                                align : 'center',
                                formatter : function(value, row, index) {
                                    var e = '<a class="btn btn-primary btn-sm '+s_edit_h+'" href="#" mce_href="#" title="编辑" onclick="edit(\''
                                        + row.id
                                        + '\')"><i class="fa fa-edit"></i></a> ';
                                    var d = '<a class="btn btn-warning btn-sm '+s_remove_h+'" href="#" title="删除"  mce_href="#" onclick="remove(\''
                                        + row.id
                                        + '\')"><i class="fa fa-remove"></i></a> ';
                                    var f = '<a class="btn btn-success btn-sm" href="#" title="备用"  mce_href="#" onclick="resetPwd(\''
                                        + row.id
                                        + '\')"><i class="fa fa-key"></i></a> ';
                                    return e + d ;
                                }
                            }*/

                            ]
					});
}
function reLoad() {
	$('#exampleTable').bootstrapTable('refresh');
}
function add() {
	layer.open({
		type : 2,
		title : '增加',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/add' // iframe的url
	});
}
function edit(id) {
	layer.open({
		type : 2,
		title : '编辑',
		maxmin : true,
		shadeClose : false, // 点击遮罩关闭层
		area : [ '800px', '520px' ],
		content : prefix + '/edit/' + id // iframe的url
	});
}
function remove(id) {
	layer.confirm('确定要删除选中的记录？', {
		btn : [ '确定', '取消' ]
	}, function() {
		$.ajax({
			url : prefix+"/remove",
			type : "post",
			data : {
				'id' : id
			},
			success : function(r) {
				if (r.code==0) {
					layer.msg(r.msg);
					reLoad();
				}else{
					layer.msg(r.msg);
				}
			}
		});
	})
}

function resetPwd(id) {
}
function batchRemove() {
	var rows = $('#exampleTable').bootstrapTable('getSelections'); // 返回所有选择的行，当没有选择的记录时，返回一个空数组
	if (rows.length == 0) {
		layer.msg("请选择要删除的数据");
		return;
	}
	layer.confirm("确认要删除选中的'" + rows.length + "'条数据吗?", {
		btn : [ '确定', '取消' ]
	// 按钮
	}, function() {
		var ids = new Array();
		// 遍历所有选择的行数据，取每条数据对应的ID
		$.each(rows, function(i, row) {
			ids[i] = row['id'];
		});
		$.ajax({
			type : 'POST',
			data : {
				"ids" : ids
			},
			url : prefix + '/batchRemove',
			success : function(r) {
				if (r.code == 0) {
					layer.msg(r.msg);
					reLoad();
				} else {
					layer.msg(r.msg);
				}
			}
		});
	}, function() {

	});
}