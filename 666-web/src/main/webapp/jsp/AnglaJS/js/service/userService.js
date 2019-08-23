//服务层
app.service('userService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../user/findAll');
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../user/findPage?page='+page+'&rows='+rows);
	}
	//今日
	this.findToday=function(){
		return $http.get('../user/findToday');
	}
	//查询结果
	this.count=function () {
		return $http.get('../user/count');
	}

	//查询实体
	this.findOne=function(id){
		return $http.get('../user/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../user/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../user/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../user/delete?ids='+ids);
	}
	//搜索
	this.search=function( searchEntity){
		return $http.post('../user/search', searchEntity);
	}    	
});
