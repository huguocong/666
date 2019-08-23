 //控制层 
app.controller('yonghuController' ,function($scope,$controller   ,yonghuService){	
	
	$controller('baseController',{$scope:$scope});//继承
	
    //读取列表数据绑定到表单中  
	$scope.findAll=function(){
		yonghuService.findAll().success(
			function(response){
				$scope.list=response;
			}			
		);
	}

	//返回今日列表
	$scope.findToday=function(){
		yonghuService.findToday().success(
			function(response){
				$scope.list=response;
			}
		);
	}

	//分页
	$scope.findPage=function(page,rows){			
		yonghuService.findPage(page,rows).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}
	
	//查询实体 
	$scope.findOne=function(id){				
		yonghuService.findOne(id).success(
			function(response){
				$scope.entity= response;
				$scope.entity.tema=JSON.parse($scope.entity.tema);
			}
		);				
	}

	//计算结果
	$scope.count=function(){
		yonghuService.count().success(
			function (reponse) {
				$scope.list=reponse;
			}
		);
	}
	
	//保存 
	$scope.save=function(){				
		var serviceObject;//服务层对象  				
		if($scope.entity.id!=null){//如果有ID
			serviceObject=yonghuService.update( $scope.entity ); //修改  
		}else{
			serviceObject=yonghuService.add( $scope.entity  );//增加 
		}				
		serviceObject.success(
			function(response){
				if(response.success){
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
		yonghuService.dele( $scope.selectIds ).success(
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
		yonghuService.search(page,rows,$scope.searchEntity).success(
			function(response){
				$scope.list=response.rows;	
				$scope.paginationConf.totalItems=response.total;//更新总记录数
			}			
		);
	}

	//汇表
	$scope.biao=function(){
		yonghuService.biao().success(
			function (response) {
				$scope.list=response;

				//$scope.list.get(0).get(yuan)-$scope.list.get(0).get(xian);
			}
		);
	}

	//给扩展属性添加行

	$scope.entity={tema:[]};
	$scope.addTableRow = function(){
		$scope.entity.tema.push({});
	}
	$scope.deleteTableRow = function(index){
		$scope.entity.tema.splice(index,1);
	}

	$scope.addx={};
	$scope.dan = function(){
		for (var i=1;i<=49;i+=2) {
			$scope.entity.tema.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.shuang = function(){
		for (var i=2;i<=49;i+=2) {
			$scope.entity.tema.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.da = function(){
		for (var i=25;i<=49;i++) {
			$scope.entity.tema.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.xiao = function(){
		for (var i=1;i<=24;i++) {
			$scope.entity.tema.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.zhu = function(){
		for (var i=1;i<=49;i+=12) {
			$scope.entity.tema.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.gou = function(){
		for (var i=2;i<=49;i+=12) {
			$scope.entity.tema.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.ji = function(){
		for (var i=3;i<=49;i+=12) {
			$scope.entity.tema.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.hou = function(){
		for (var i=4;i<=49;i+=12) {
			$scope.entity.tema.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.yang = function(){
		for (var i=5;i<=49;i+=12) {
			$scope.entity.tema.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.ma = function(){
		for (var i=6;i<=49;i+=12) {
			$scope.entity.tema.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.she = function(){
		for (var i=7;i<=49;i+=12) {
			$scope.entity.tema.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.long = function(){
		for (var i=8;i<=49;i+=12) {
			$scope.entity.tema.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.tu = function(){
		for (var i=9;i<=49;i+=12) {
			$scope.entity.tema.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.hu = function(){
		for (var i=10;i<=49;i+=12) {
			$scope.entity.tema.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.niu = function(){
		for (var i=11;i<=49;i+=12) {
			$scope.entity.tema.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}
	$scope.shu = function(){
		for (var i=12;i<=49;i+=12) {
			$scope.entity.tema.push({"haoma": i, "monny": JSON.parse($scope.addx.name)});
		}
	}


	$scope.entity={pin:[]};
	$scope.ppaddTableRow = function(){
		$scope.entity.pin.push({});
	}
	$scope.pdeleteTableRow = function(index){
		$scope.entity.pin.splice(index,1);
	}


	$scope.paddx={};
	$scope.pdan = function(){
		for (var i=1;i<=49;i+=2) {
			$scope.entity.pin.push({"haoma": i, "monny": JSON.parse($scope.paddx.name)});
		}
	}
	$scope.pshuang = function(){
		for (var i=2;i<=49;i+=2) {
			$scope.entity.pin.push({"haoma": i, "monny": JSON.parse($scope.paddx.name)});
		}
	}
	$scope.pda = function(){
		for (var i=25;i<=49;i++) {
			$scope.entity.pin.push({"haoma": i, "monny": JSON.parse($scope.paddx.name)});
		}
	}
	$scope.pxiao = function(){
		for (var i=1;i<=24;i++) {
			$scope.entity.pin.push({"haoma": i, "monny": JSON.parse($scope.paddx.name)});
		}
	}
	$scope.pzhu = function(){
		for (var i=1;i<=49;i+=12) {
			$scope.entity.pin.push({"haoma": i, "monny": JSON.parse($scope.paddx.name)});
		}
	}
	$scope.pgou = function(){
		for (var i=2;i<=49;i+=12) {
			$scope.entity.pin.push({"haoma": i, "monny": JSON.parse($scope.paddx.name)});
		}
	}
	$scope.pji = function(){
		for (var i=3;i<=49;i+=12) {
			$scope.entity.pin.push({"haoma": i, "monny": JSON.parse($scope.paddx.name)});
		}
	}
	$scope.phou = function(){
		for (var i=4;i<=49;i+=12) {
			$scope.entity.pin.push({"haoma": i, "monny": JSON.parse($scope.paddx.name)});
		}
	}
	$scope.pyang = function(){
		for (var i=5;i<=49;i+=12) {
			$scope.entity.pin.push({"haoma": i, "monny": JSON.parse($scope.paddx.name)});
		}
	}
	$scope.pma = function(){
		for (var i=6;i<=49;i+=12) {
			$scope.entity.pin.push({"haoma": i, "monny": JSON.parse($scope.paddx.name)});
		}
	}
	$scope.pshe = function(){
		for (var i=7;i<=49;i+=12) {
			$scope.entity.pin.push({"haoma": i, "monny": JSON.parse($scope.paddx.name)});
		}
	}
	$scope.plong = function(){
		for (var i=8;i<=49;i+=12) {
			$scope.entity.pin.push({"haoma": i, "monny": JSON.parse($scope.paddx.name)});
		}
	}
	$scope.ptu = function(){
		for (var i=9;i<=49;i+=12) {
			$scope.entity.pin.push({"haoma": i, "monny": JSON.parse($scope.paddx.name)});
		}
	}
	$scope.phu = function(){
		for (var i=10;i<=49;i+=12) {
			$scope.entity.pin.push({"haoma": i, "monny": JSON.parse($scope.paddx.name)});
		}
	}
	$scope.pniu = function(){
		for (var i=11;i<=49;i+=12) {
			$scope.entity.pin.push({"haoma": i, "monny": JSON.parse($scope.paddx.name)});
		}
	}
	$scope.pshu = function(){
		for (var i=12;i<=49;i+=12) {
			$scope.entity.pin.push({"haoma": i, "monny": JSON.parse($scope.paddx.name)});
		}
	}
});	
