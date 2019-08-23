package com.service;

import java.util.List;
import pojo.TbYonghu;
import pojo.shubiao;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface YonghuService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbYonghu> findAll();
	

	//返回今日列表
	public List<TbYonghu>findtoyay();
	
	/**
	 * 增加
	*/
	public void add(TbYonghu yonghu);
	
	
	/**
	 * 修改
	 */
	public void update(TbYonghu yonghu);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbYonghu findOne(Integer id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer[] ids);

	//汇表
	public List<shubiao> biao();


}
