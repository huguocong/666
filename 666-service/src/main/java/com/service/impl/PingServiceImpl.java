package com.service.impl;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import mapper.TbPingMapper;
import org.springframework.beans.factory.annotation.Autowired;


import com.service.PingService;

import org.springframework.stereotype.Service;
import pojo.TbPing;
import pojo.TbPingExample;


/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class PingServiceImpl implements PingService {

	@Autowired
	private TbPingMapper pingMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbPing> findAll() {
		return pingMapper.selectByExample(null);
	}

	@Override
	public List<TbPing> findToday() {
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH), calendar2.get(Calendar.DAY_OF_MONTH),
				23, 59, 59);
		Date endDate = calendar2.getTime();
		calendar2.set(calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH), calendar2.get(Calendar.DAY_OF_MONTH),
				0, 0, 0);
		Date startDate = calendar2.getTime();

		TbPingExample example = new TbPingExample();
		TbPingExample.Criteria criteria = example.createCriteria();
		criteria.andDateBetween(startDate,endDate);
		List<TbPing> tbPings = pingMapper.selectByExample(example);
		return tbPings;
	}

	/**
	 * 增加
	 */
	@Override
	public void add(TbPing ping) {
		ping.setDate(new Date());
		pingMapper.insert(ping);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbPing ping){
		pingMapper.updateByPrimaryKey(ping);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbPing findOne(Integer id){
		return pingMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			pingMapper.deleteByPrimaryKey(id);
		}		
	}
	

	
}
