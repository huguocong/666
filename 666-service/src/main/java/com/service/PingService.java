package com.service;
import java.util.List;

import pojo.TbPing;

/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface PingService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbPing> findAll();
	
	//返回今日
	public List<TbPing>findToday();

	
	/**
	 * 增加
	*/
	public void add(TbPing ping);
	
	
	/**
	 * 修改
	 */
	public void update(TbPing ping);
	

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbPing findOne(Integer id);
	
	
	/**
	 * 批量删除
	 * @param ids
	 */
	public void delete(Integer[] ids);


}
