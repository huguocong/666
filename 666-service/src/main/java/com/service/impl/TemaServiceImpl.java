package com.service.impl;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.service.TemaService;
import mapper.TbTemaMapper;

import mapper.TbXiaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pojo.TbTema;
import pojo.TbTemaExample;
import pojo.TbXiao;
import pojo.TbXiaoExample;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service(value = "TemaService")
public class TemaServiceImpl implements TemaService {

	@Autowired
	private TbTemaMapper temaMapper;

	/**
	 * 查询全部
	 */
	@Override
	public List<TbTema> findAll() {
		return temaMapper.selectByExample(null);
	}

	@Override
	public void add(TbTema tema) {
		temaMapper.insert(tema);
	}

	@Override
	public void update(TbTema tema) {

	}

	@Override
	public TbTema findOne(Integer id) {
		return null;
	}


	@Autowired
	private TbXiaoMapper xiaoMapper;

	@Override
	public List<TbXiao> find1(String xiao) {
		//TbTemaExample example = new TbTemaExample();
		TbXiaoExample example = new TbXiaoExample();
		TbXiaoExample.Criteria criteria = example.createCriteria();
		criteria.andNameEqualTo(xiao);
		List<TbXiao> list = xiaoMapper.selectByExample(example);

		return list;
	}

	@Override
	public List<TbTema> finddate(String n) {
		List<TbTema> list=null;
		if (n.equals("0")){
			//查询所有
		 list = temaMapper.selectByExample(null);
		}else if (n.equals("1")){
			Calendar calendar2 = Calendar.getInstance();
			calendar2.set(calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH), calendar2.get(Calendar.DAY_OF_MONTH),
					23, 59, 59);
			Date endDate = calendar2.getTime();
			calendar2.set(calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH), calendar2.get(Calendar.DAY_OF_MONTH),
					0, 0, 0);
			Date startDate = calendar2.getTime();

			TbTemaExample example = new TbTemaExample();
			TbTemaExample.Criteria criteria = example.createCriteria();
			criteria.andDateBetween(startDate,endDate);
			list=temaMapper.selectByExample(example);
		}

		return list;
	}

	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			temaMapper.deleteByPrimaryKey(id);
		}
	}

	/*
	*//**
	 * 查询全部
	 *//*
	@Override
	public List<TbTema> findAll() {
		return temaMapper.selectByExample(null);
	}

	*//**
	 * 按分页查询
	 *//*
*//*	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbTema> page=   (Page<TbTema>) temaMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}*//*

	*//**
	 * 增加
	 *//*
	@Override
	public void add(TbTema tema) {
		temaMapper.insert(tema);		
	}

	
	*//**
	 * 修改
	 *//*
	@Override
	public void update(TbTema tema){
		temaMapper.updateByPrimaryKey(tema);
	}	
	
	*//**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 *//*
	@Override
	public TbTema findOne(Integer id){
		return temaMapper.selectByPrimaryKey(id);
	}

	*//**
	 * 批量删除
	 *//*
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			temaMapper.deleteByPrimaryKey(id);
		}		
	}*/
	
	
/*		@Override
	public PageResult findPage(TbTema tema, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbTemaExample example=new TbTemaExample();
		Criteria criteria = example.createCriteria();
		
		if(tema!=null){			
						if(tema.getXiao()!=null && tema.getXiao().length()>0){
				criteria.andXiaoLike("%"+tema.getXiao()+"%");
			}
	
		}
		
		Page<TbTema> page= (Page<TbTema>)temaMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}*/
	
}
