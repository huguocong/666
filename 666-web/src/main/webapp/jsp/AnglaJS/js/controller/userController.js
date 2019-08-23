 //控制层 
app.controller('userController' ,function($scope,$controller   ,userService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		userService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}

	//今日
	$scope.findToday=function(){
		userService.findToday().success(
			function (response) {
				$scope.list=response;
			}
		);
	}

	//计算结果
	$scope.count=function(){
		userService.count().success(
			function (reponse) {
				$scope.list=reponse;
			}
		);
	}


	
	//分页
	$scope.findPage=function(page,rows){			
		userService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		userService.findOne(id).success(
			function(response){
				$scope.entity= response;
				$scope.entity.text=JSON.parse($scope.entity.text);
			}
		);				
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象
		//alert("aa");
		alert(JSON.stringify($scope.entity));
		if($scope.entity.id!=null){//如果有ID
			serviceObject=userService.update( $scope.entity ); //修改  
		}else{
			serviceObject=userService.add( $scope.entity);//增加
		}				
		serviceObject.success(
			function(response){
				if(response.success){
					//重新查询
					alert(response.message);
		        	//$scope.reloadList();//重新加载
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
		userService.dele( $scope.selectIds ).success(
			function(response){
				if(response.success){
					alert(response.message);
					window.location.reload();
					//$scope.reloadList();//刷新列表
					$scope.selectIds=[];
				}						
			}		
		);				
	}
	
	$scope.searchEntity={};//定义搜索对象 
	
	//搜索
	$scope.search=function(){
		userService.search($scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}



	//给扩展属性添加行

	$scope.entity={text:[]};
	$scope.addTableRow = function(){
		$scope.entity.text.push({});
	}
	$scope.deleteTableRow = function(index){
		$scope.entity.text.splice(index,1);
	}

	$scope.addx={};
	$scope.dan = function(){
		for (var i=1;i<=49;i+=2) {
			$scope.entity.text.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.shuang = function(){
		for (var i=2;i<=49;i+=2) {
			$scope.entity.text.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.zhu = function(){
		for (var i=1;i<=49;i+=12) {
			$scope.entity.text.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.gou = function(){
		for (var i=2;i<=49;i+=12) {
			$scope.entity.text.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.ji = function(){
		for (var i=3;i<=49;i+=12) {
			$scope.entity.text.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.hou = function(){
		for (var i=4;i<=49;i+=12) {
			$scope.entity.text.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.yang = function(){
		for (var i=5;i<=49;i+=12) {
			$scope.entity.text.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.ma = function(){
		for (var i=6;i<=49;i+=12) {
			$scope.entity.text.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.she = function(){
		for (var i=7;i<=49;i+=12) {
			$scope.entity.text.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.long = function(){
		for (var i=8;i<=49;i+=12) {
			$scope.entity.text.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.tu = function(){
		for (var i=9;i<=49;i+=12) {
			$scope.entity.text.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.hu = function(){
		for (var i=10;i<=49;i+=12) {
			$scope.entity.text.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.niu = function(){
		for (var i=11;i<=49;i+=12) {
			$scope.entity.text.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.shu = function(){
		for (var i=12;i<=49;i+=12) {
			$scope.entity.text.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}

/*	$("#xiao").change(function () {
		var x=$(this).val();
		alert(x);
		if (x==="猪") {
				for (var i=1;i<=49;i+=12){
					$scope.entity.text.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
				}

		}
	})*/


    
});	
