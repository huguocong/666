//服务层
app.service('yonghuService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../yonghu/findAll');
	}
	//返回今日列表
	this.findToday=function(){
		return $http.get('../yonghu/findToday');
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../yonghu/findPage?page='+page+'&rows='+rows);
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../yonghu/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../yonghu/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../yonghu/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../yonghu/delete?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../yonghu/search?page='+page+"&rows="+rows, searchEntity);
	}
	//查询结果
	this.count=function(){
		return $http.post('../yonghu/count');
	}

	//数表
	this.biao=function () {
		return $http.post('../yonghu/biao');
	}
});
