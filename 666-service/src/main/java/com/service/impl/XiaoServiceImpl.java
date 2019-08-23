package com.service.impl;
import java.util.List;
import com.service.XiaoService;
import mapper.TbXiaoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import mapper.TbXiaoMapper;
import pojo.TbXiao;
import org.springframework.stereotype.Service;
import pojo.TbXiao;

/**
 * 服务实现层
 * @author Administrator
 *
 */
@Service
public class XiaoServiceImpl implements XiaoService {

	@Autowired
	private TbXiaoMapper xiaoMapper;
	
	/**
	 * 查询全部
	 */
	@Override
	public List<TbXiao> findAll() {
		return xiaoMapper.selectByExample(null);
	}

	@Override
	public void qian() {
		List<TbXiao> tbXiaos = xiaoMapper.selectByExample(null);
		for (int i=0;i<48;i++){
			tbXiaos.get(i).setName(tbXiaos.get(i+1).getName());
			xiaoMapper.updateByPrimaryKey(tbXiaos.get(i));
		}
		tbXiaos.get(48).setName(tbXiaos.get(0).getName());
		xiaoMapper.updateByPrimaryKey(tbXiaos.get(48));
	}

	@Override
	public void hou() {
		List<TbXiao> tbXiaos = xiaoMapper.selectByExample(null);
		for (int j=48;j>0;j--){
			tbXiaos.get(j).setName(tbXiaos.get(j-1).getName());
			xiaoMapper.updateByPrimaryKey(tbXiaos.get(j));
		}
		tbXiaos.get(0).setName(tbXiaos.get(48).getName());
		xiaoMapper.updateByPrimaryKey(tbXiaos.get(0));


	}

	/**
	 * 按分页查询
	 */
	/*@Override
	public PageResult findPage(int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);		
		Page<TbXiao> page=   (Page<TbXiao>) xiaoMapper.selectByExample(null);
		return new PageResult(page.getTotal(), page.getResult());
	}*/

	/**
	 * 增加
	 */
	@Override
	public void add(TbXiao xiao) {
		xiaoMapper.insert(xiao);		
	}

	
	/**
	 * 修改
	 */
	@Override
	public void update(TbXiao xiao){
		xiaoMapper.updateByPrimaryKey(xiao);
	}	
	
	/**
	 * 根据ID获取实体
	 * @param id
	 * @return
	 */
	@Override
	public TbXiao findOne(Integer id){
		return xiaoMapper.selectByPrimaryKey(id);
	}

	/**
	 * 批量删除
	 */
	@Override
	public void delete(Integer[] ids) {
		for(Integer id:ids){
			xiaoMapper.deleteByPrimaryKey(id);
		}		
	}
	
	
	/*	@Override
	public PageResult findPage(TbXiao xiao, int pageNum, int pageSize) {
		PageHelper.startPage(pageNum, pageSize);
		
		TbXiaoExample example=new TbXiaoExample();
		Criteria criteria = example.createCriteria();
		
		if(xiao!=null){			
						if(xiao.getName()!=null && xiao.getName().length()>0){
				criteria.andNameLike("%"+xiao.getName()+"%");
			}
	
		}
		
		Page<TbXiao> page= (Page<TbXiao>)xiaoMapper.selectByExample(example);		
		return new PageResult(page.getTotal(), page.getResult());
	}*/
	
}
