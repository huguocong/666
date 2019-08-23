package com.service.impl;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.service.YonghuService;
import mapper.TbYonghuMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import pojo.TbYonghu;
import pojo.TbYonghuExample;
import pojo.ma;
import pojo.shubiao;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class YonghuServiceImpl implements YonghuService {

	@Autowired
	private TbYonghuMapper yonghuMapper;

	//返回今日列表
	@Override
	public List<TbYonghu> findtoyay() {
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH), calendar2.get(Calendar.DAY_OF_MONTH),
				23, 59, 59);
		Date endDate = calendar2.getTime();
		calendar2.set(calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH), calendar2.get(Calendar.DAY_OF_MONTH),
				0, 0, 0);
		Date startDate = calendar2.getTime();

		TbYonghuExample example = new TbYonghuExample();
		TbYonghuExample.Criteria criteria = example.createCriteria();
		criteria.andDateBetween(startDate,endDate);
		List<TbYonghu> tbYonghus = yonghuMapper.selectByExample(example);


		return tbYonghus;
	}

	/**
	 * 查询全部
	 */
	@Override
	public List<TbYonghu> findAll() {
		return yonghuMapper.selectByExample(null);
	}



	/**
	 * 增加
	 */
	@Override
	public void add(TbYonghu yonghu) {
		yonghuMapper.insert(yonghu);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbYonghu yonghu){
		yonghuMapper.updateByPrimaryKey(yonghu);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbYonghu findOne(Integer id){
		return yonghuMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			yonghuMapper.deleteByPrimaryKey(id);
		}		
	}


	//汇表

	@Override
	public List<shubiao> biao() {
		List<TbYonghu> all = findtoyay();
		//List<TbYonghu> all = yonghuMapper.selectByExample(null);
		int a[]=new int[50];
		for (TbYonghu user:all
			 ) {
			List<ma> mas = JSONObject.parseArray(user.getTema(), ma.class);
			for (ma m:mas
				 ) {
				a[m.getHaoma()]+=m.getMonny();
			}
		}
		int min=1000000;
		for (int j=0;j<49;j++){
			if(a[j]<min && a[j]!=0){
				min=a[j];
			}
		}

		List<shubiao> shubiaos = new ArrayList<shubiao>();
		for (int i=0;i<49;i++){
			if(a[i]!=0) {
				shubiaos.add(new shubiao(i + 1, a[i], a[i] - min));
			}
		}

		return shubiaos;



	}
}
