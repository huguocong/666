package com.service;
import pojo.TbXiao;

import java.util.List;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface XiaoService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbXiao> findAll();

	//前移
	public void qian();

	//后移
	public void  hou();
	
	
	/**
	 * 返回分页列表
	 * @return
	 */
//	public PageResult findPage(int pageNum, int pageSize);
	
	
	/**
	 * 增加
	*/
	public void add(TbXiao xiao);
	
	
	/**
	 * 修改
	 */
	public void update(TbXiao xiao);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbXiao findOne(Integer id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer[] ids);

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
//	public PageResult findPage(TbXiao xiao, int pageNum, int pageSize);
	
}
