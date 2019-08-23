package com.service;
import pojo.TbTema;
import pojo.TbXiao;

import java.util.List;



/**
 * 服务层接口
 * @author Administrator
 *
 */
public interface TemaService {

	/**
	 * 返回全部列表
	 * @return
	 */
	public List<TbTema> findAll();
	/**
	 * 增加
	 */
	public void add(TbTema tema);

	/**
	 * 修改
	 */
	public void update(TbTema tema);

	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	public TbTema findOne(Integer id);

	//删除
	//public void delete(Integer id);

	//通过特码查询号码
	public List<TbXiao> find1(String xiao);

	//日期查询
	public List<TbTema> finddate(String n);

   //批量删除
	public void delete(Integer[] ids);

	/*
	
	*//**
	 * 返回分页列表
	 * @return
	 *//*
	//public PageResult findPage(int pageNum, int pageSize);
	
	
	*/

	/*

	

	*//**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 *//*
	public TbTema findOne(Integer id);
	
	
	*//**
	 * 批量删除
	 * @param ids
	 *//*
	public void delete(Integer[] ids);*/

	/**
	 * 分页
	 * @param pageNum 当前页 码
	 * @param pageSize 每页记录数
	 * @return
	 */
	//public PageResult findPage(TbTema tema, int pageNum, int pageSize);
	
}
