//服务层
app.service('pingService',function($http){
	    	
	//读取列表数据绑定到表单中
	this.findAll=function(){
		return $http.get('../ping/findAll');
	}
	//分页 
	this.findPage=function(page,rows){
		return $http.get('../ping/findPage?page='+page+'&rows='+rows);
	}

	//今日
	this.findToday=function () {
		return $http.get('../ping/today');
	}
	//查询实体
	this.findOne=function(id){
		return $http.get('../ping/findOne?id='+id);
	}
	//增加 
	this.add=function(entity){
		return  $http.post('../ping/add',entity );
	}
	//修改 
	this.update=function(entity){
		return  $http.post('../ping/update',entity );
	}
	//删除
	this.dele=function(ids){
		return $http.get('../ping/delete?ids='+ids);
	}
	//搜索
	this.search=function(page,rows,searchEntity){
		return $http.post('../ping/search?page='+page+"&rows="+rows, searchEntity);
	}    	
});
