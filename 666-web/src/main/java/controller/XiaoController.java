package controller;
import com.service.XiaoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Result;
import pojo.TbXiao;

import javax.annotation.Resource;
import java.util.List;


/**
 * controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/xiao")
public class XiaoController {

	@Resource
	private XiaoService xiaoService;
	
	/**
	 * 返回全部列表
	 * @return
	 */
	@RequestMapping("/findAll")
	public String findAll(Model model){
		List<TbXiao> all = xiaoService.findAll();
		model.addAttribute("xiao",all);
		return "xiao";
	}

	//前移
	@RequestMapping("/qian")
	public String qian(){
		xiaoService.qian();
		return "redirect:/xiao/findAll";
	}

	//后移
	@RequestMapping("/hou")
	public String hou(){
		xiaoService.hou();
		return "redirect:/xiao/findAll";
	}

	//查询单个
	@RequestMapping("/findOne")
	@ResponseBody
	public TbXiao findOne(Integer id){
		return xiaoService.findOne(id);
	}

	//修改
	@RequestMapping("/save")
	@ResponseBody
	public Result add(@RequestBody TbXiao xiao){
			xiaoService.update(xiao);
		    return new Result(true,"修改成功");
	}


	/**
	 * 增加
	 * @param xiao
	 * @return
	 */
	/*@RequestMapping("/add")
	public Result add(@RequestBody TbXiao xiao){
		try {
			xiaoService.add(xiao);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}*/
	
	/**
	 * 修改
	 * @param xiao
	 * @return
	 */
/*	@RequestMapping("/update")
	public Result update(@RequestBody TbXiao xiao){
		try {
			xiaoService.update(xiao);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}	*/
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
	/*@RequestMapping("/findOne")
	public TbXiao findOne(Long id){
		return xiaoService.findOne(id);		
	}
	*/
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
	/*@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			xiaoService.delete(ids);
			return new Result(true, "删除成功"); 
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}*/
	
		/**
	 * 查询+分页
	 * @param brand
	 * @param page
	 * @param rows
	 * @return
	 */
	/*@RequestMapping("/search")
	public PageResult search(@RequestBody TbXiao xiao, int page, int rows  ){
		return xiaoService.findPage(xiao, page, rows);		
	}*/
	
}
