package controller;
import java.util.List;

import com.service.PingService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Result;
import pojo.TbPing;

import javax.annotation.Resource;

/**
 * controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/ping")
public class PingController {

	@Resource
	private PingService pingService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public List<TbPing> findAll(){
		return pingService.findAll();
	}

	@RequestMapping("/today")
	@ResponseBody
	public  List<TbPing>findToday(){
		return pingService.findToday();
	}
	
	

	/**
	 * 增加
	 * @param ping
	 * @return
	 */
	@RequestMapping("/add")
	@ResponseBody
	public Result add(@RequestBody TbPing ping){
		try {
			pingService.add(ping);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}
	
	/**
	 * 修改
	 * @param ping
	 * @return
	 */
	@RequestMapping("/update")
	@ResponseBody
	public Result update(@RequestBody TbPing ping){
		try {
			pingService.update(ping);
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
	public TbPing findOne(Integer id){
		return pingService.findOne(id);		
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
			pingService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}
	

	
}
