package controller;


import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.alibaba.fastjson.JSONObject;
import com.service.PingService;
import com.service.TemaService;
import com.service.YonghuService;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.ResponseBody;
import pojo.*;

import javax.annotation.Resource;

/**
 * controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/yonghu")
public class YonghuController {

	@Resource
	private YonghuService yonghuService;

	//返回今日列表
	@RequestMapping("/findToday")
	@ResponseBody
	public List<TbYonghu>  findToday(){
		return yonghuService.findtoyay();
	}



	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public List<TbYonghu> findAll(){
		return yonghuService.findAll();
	}
	

	/**
	 * 增加
	 * @param yonghu
	 * @return
	 */
	@RequestMapping("/add")
	@ResponseBody
	public Result add(@RequestBody TbYonghu yonghu){
		try {
			List<ma> mas = JSONObject.parseArray(yonghu.getTema(), ma.class); //用户特码
			int yingfu=0;
			if (mas!=null) {
				for (ma s : mas
				) {
					yingfu += s.getMonny();

				}
			}
			List<ma> mas1 = JSONObject.parseArray(yonghu.getPin(), ma.class); //用户平码
			if (mas1!=null) {
				for (ma xx : mas1
				) {
					yingfu += xx.getMonny();

				}
			}



			yonghu.setYingfu(yingfu);
			yonghu.setDate(new Date());
			if (yonghu.getBeishu()==null){
				yonghu.setBeishu(42);
			}
			if (yonghu.getShifu()==null){
				yonghu.setShifu(0);
			}
			yonghuService.add(yonghu);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param yonghu
	 * @return
	 */
	@RequestMapping("/update")
	@ResponseBody
	public Result update(@RequestBody TbYonghu yonghu){
		try {
			yonghuService.update(yonghu);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	@ResponseBody
	public TbYonghu findOne(Integer id){
		return yonghuService.findOne(id);		
	}
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	@RequestMapping("/delete")
	@ResponseBody
	public Result delete(Integer [] ids){
		try {
			yonghuService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}

	@Resource
	private TemaService temaService;

	@Resource
	private PingService pingService;


	//计算结果、
	@RequestMapping("/count")
	@ResponseBody
	public List<TbYonghu> count(){
		int tema = 0;  //今日特码
		int ping[]=new int[7];  //平码
	   //生肖
		Set<String> xiaos = new HashSet<>();

		try {
			List<TbTema> finddate = temaService.finddate("1");
			tema = finddate.get(0).getTema();
			xiaos.add(finddate.get(0).getXiao());

			List<TbPing> today = pingService.findToday();
			String ping1 = today.get(0).getPing();
			List<TbXiao> pinma = JSONObject.parseArray(ping1, TbXiao.class);
			int i=0;
			for (TbXiao x:pinma
				 ) {
				ping[i++]=x.getNumber();
				xiaos.add(x.getName());
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		List<TbYonghu> findtoyay = yonghuService.findtoyay(); //返回今日用户
		for (TbYonghu user:findtoyay
			 ) {
			int zhon=0;    //单个用户中奖数额
			if (user.getTema()!=null) {
				List<ma> mas = JSONObject.parseArray(user.getTema(), ma.class);
				for (ma s : mas
				) {
					if (s.getHaoma() == tema) {
						zhon += s.getMonny() * user.getBeishu();
					}
				}
			}

			if(user.getPin()!=null) {
			   List<ma> pinma = JSONObject.parseArray(user.getPin(), ma.class);
				for (ma m : pinma
				) {
					for (int i = 0; i < 6; i++) {
						if (m.getHaoma() == ping[i]) {
							zhon += m.getMonny();
						}
					}
				}
			}


			user.setResult(zhon-(user.getYingfu()-user.getShifu()));
			yonghuService.update(user);

		}
		return yonghuService.findtoyay();
	}

	//汇表
	@RequestMapping("biao")
	@ResponseBody
	public List<shubiao> shubiao(){
		return yonghuService.biao();
	}
	

	
}
