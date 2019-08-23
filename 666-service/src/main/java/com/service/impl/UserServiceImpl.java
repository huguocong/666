package com.service.impl;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.JSONObject;
import com.service.UserService;
import mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import pojo.User;
import pojo.UserExample;
import pojo.ma;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<User> findAll() {
		return userMapper.selectByExample(null);
	}

	@Override
	public List<User> findtoday() {
		Calendar calendar2 = Calendar.getInstance();
		calendar2.set(calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH), calendar2.get(Calendar.DAY_OF_MONTH),
				23, 59, 59);
		Date endDate = calendar2.getTime();
		calendar2.set(calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH), calendar2.get(Calendar.DAY_OF_MONTH),
				0, 0, 0);
		Date startDate = calendar2.getTime();

		UserExample userExample = new UserExample();
		UserExample.Criteria criteria = userExample.createCriteria();
		criteria.andDateBetween(startDate,endDate);
		List<User> users = userMapper.selectByExample(userExample);
		return users;
	}

	/**
	 * 按分页查询
	 */
/*	@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<User> page=   (Page<User>) userMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}*/

	@Override
	public List<User> coun() {
		return null;
	}

	/**
	 * 增加
	 */
	@Override
	public void add(User user) {
		userMapper.insert(user);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(User user){
		userMapper.updateByPrimaryKey(user);
	}
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public User findOne(Integer id){
		return userMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			userMapper.deleteByPrimaryKey(id);
		}		
	}

	@Override
	public List<User> find(User user) {
		UserExample example = new UserExample();
		UserExample.Criteria criteria = example.createCriteria();
		if(user!=null){
			if(user.getName()!=null && user.getName().length()>0){
				criteria.andNameEqualTo(user.getName());
			}
		}
		List<User> users = userMapper.selectByExample(example);
		return users;
	}

	/*		@Override
	public PageResult findPage(User user, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		UserExample example=new UserExample();
		Criteria criteria = example.createCriteria();
		
		if(user!=null){			
						if(user.getName()!=null && user.getName().length()>0){
				criteria.andNameLike("%"+user.getName()+"%");
			}
			if(user.getText()!=null && user.getText().length()>0){
				criteria.andTextLike("%"+user.getText()+"%");
			}
	
		}
		
		Page<User> page= (Page<User>)userMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}*/
	
}
