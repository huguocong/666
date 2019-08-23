 //控制层 
app.controller('pingController' ,function($scope,$controller   ,pingService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		pingService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}

	//今日
	$scope.findtoday=function(){
		 pingService.findToday().success(
		  function (response) {
			  $scope.list=response;
		  }
		);
	}
	
	//分页
	$scope.findPage=function(page,rows){			
		pingService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		pingService.findOne(id).success(
			function(response){
				$scope.entity= response;
				$scope.entity.ping=JSON.parse($scope.entity.ping);
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=pingService.update( $scope.entity ); //修改  
		}else{
			serviceObject=pingService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询
					alert(response.message);
					window.location.reload();
				}else{
					alert(response.message);
				}
			}		
		);				
	}
	
	 
	//批量删除 
	$scope.dele=function(){			
		//获取选中的复选框			
		pingService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					alert(response.message);
					window.location.reload();

					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(page,rows){			
		pingService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}

	$("#ping1").change(function () {
		var p1=$(this).val();
		$.post("/tema/find1",{xiao:p1},function (data) {
			$("#number1").html("<option value=''>-请选择-")
			$(data).each(function (index,c) {
				$("#number1").append("<option value='"+c.number+"'>"+c.number)
			});
		},"json");
	});


	$scope.entity={ping:[]};
	$scope.addTableRow = function(){
		$scope.entity.ping.push({});
	}
	$scope.deleteTableRow = function(index){
		$scope.entity.ping.splice(index,1);
	}
    
});	
