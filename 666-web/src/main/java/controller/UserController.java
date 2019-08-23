package controller;

import com.alibaba.fastjson.JSONObject;
import com.service.TemaService;
import com.service.UserService;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Result;
import pojo.TbTema;
import pojo.User;
import pojo.ma;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


/**
 * controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private UserService userService;

	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	@ResponseBody
	public List<User> findAll(){
		return userService.findAll();
	}
	
	
	/**
	 * 返回今日列表
	 * @return
	 */
	@RequestMapping("/findToday")
	@ResponseBody
	public List<User>  findToday(){
		return userService.findtoday();
	}

	/**
	 * 增加
	 * @param user
	 * @return
	 */
	@RequestMapping("/add")
	@ResponseBody
	public Result add(@RequestBody User user){
		try {
			List<ma> mas = JSONObject.parseArray(user.getText(), ma.class);
			int yingfu=0;
			for (ma s:mas
			) {
				yingfu+=s.getMonny();
			}
			user.setYingfu(yingfu);
			user.setDate(new Date());

			userService.add(user);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}

	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	@RequestMapping("/findOne")
	@ResponseBody
	public User findOne(Integer id){
		return userService.findOne(id);
	}

	@Resource
	private  TemaService temaService;


	//计算结果
	@RequestMapping("/count")
	@ResponseBody
	public List<User>  count(){
		List<TbTema> finddate1 = temaService.finddate("1");
		int tema = finddate1.get(0).getTema();       //今日特码数
		List<User> findtoday = userService.findtoday();   //今日下注用户

		for (User u:findtoday
		) {
			int zhon=0;           //今日每个用户中奖数额
			List<ma> m = com.alibaba.fastjson.JSONObject.parseArray(u.getText(), ma.class);
			for (ma x:m
			) {
				if (x.getHaoma()==tema){
					zhon+=x.getMonny()*42;
				}
			}
			u.setResult(zhon-(u.getYingfu()-u.getShifu()));
			userService.update(u);
		}
		return userService.findtoday();
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
			userService.delete(ids);
			return new Result(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}

	/**
	 * 修改
	 * @param user
	 * @return
	 */
	@RequestMapping("/update")
	@ResponseBody
	public Result update(@RequestBody User user){
		try {
			userService.update(user);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}

	//查询、
	/*@RequestMapping("/search")
	@ResponseBody
	public List<User> search(@RequestBody User user ){
		return userService.find(user);
	}*/

	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	/*@RequestMapping("/findOne")
	public TbUser findOne(Long id){
		return userService.findOne(id);		
	}
	*/

	
		/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	/*@RequestMapping("/search")
	public PageResult search(@RequestBody TbUser user, int page, int rows  ){
		return userService.findPage(user, page, rows);		
	}*/
	
}
