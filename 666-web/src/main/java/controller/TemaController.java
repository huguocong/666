package controller;
import java.util.Date;
import java.util.List;


import net.sf.json.JSONArray;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.Result;
import pojo.TbTema;
import com.service.TemaService;
import pojo.TbXiao;

import javax.annotation.Resource;

/**
 * controller
 * @author Administrator
 *
 */
@Controller
@RequestMapping("/tema")
public class TemaController {

	@Resource
	private TemaService temaService;
	/**
	 * 返回全部列表
	 * @return*/
	@RequestMapping("/findAll")
	public List<TbTema> findAll(){
		return temaService.findAll();
	}

	//通过特码查询
	/*@RequestMapping("/find1")
	@ResponseBody
	public String find1(String xiao){
	 	System.out.println(xiao);
		List<TbXiao> xiaos = temaService.find1(xiao);
		String s = JSONArray.fromObject(xiaos).toString();
		return s;
	}*/
	//spring配置了json转换
	@RequestMapping("/find1")
	@ResponseBody
	public List<TbXiao> find1(String xiao){
		System.out.println(xiao);
		List<TbXiao> xiaos = temaService.find1(xiao);
		return xiaos;
	}


	//通过日期查询
	@RequestMapping("finddate")
	public String findDate(String n, Model model){
		List<TbTema> list = temaService.finddate(n);
		model.addAttribute("tema",list);
		return "tema";
	}

	//增加
	@RequestMapping("/add")
    @ResponseBody
	public Result add(@RequestBody TbTema tema){
		try {
			tema.setDate(new Date());
			temaService.add(tema);
			return new Result(true,"添加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(true,"添加成失败");
		}

	}

	//删除
	@RequestMapping("/del")
	@ResponseBody
	//@Param("s") Integer s
	public Result delete(Integer [] ids){
		try {
			temaService.delete(ids);
			return new Result(true, "删除成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "删除失败");
		}
	}


	/**
	 * 返回全部列表
	 * @return
	 */
	/*@RequestMapping("/findPage")
	public PageResult  findPage(int page,int rows){			
		return temaService.findPage(page, rows);
	}
	*/
	/**
	 * 增加
	 * @param tema
	 * @return
	 */
/*	@RequestMapping("/add")
	public Result add(@RequestBody TbTema tema){
		try {
			temaService.add(tema);
			return new Result(true, "增加成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "增加失败");
		}
	}*/
	
	/**
	 * 修改
	 * @param tema
	 * @return
	 */
/*	@RequestMapping("/update")
	public Result update(@RequestBody TbTema tema){
		try {
			temaService.update(tema);
			return new Result(true, "修改成功");
		} catch (Exception e) {
			e.printStackTrace();
			return new Result(false, "修改失败");
		}
	}*/
	
	/**
	 * 获取实体
	 * @param id
	 * @return
	 */
/*	@RequestMapping("/findOne")
	public TbTema findOne(Long id){
		return temaService.findOne(id);		
	}*/
	
	/**
	 * 批量删除
	 * @param ids
	 * @return
	 */
/*	@RequestMapping("/delete")
	public Result delete(Long [] ids){
		try {
			temaService.delete(ids);
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
	public PageResult search(@RequestBody TbTema tema, int page, int rows  ){
		return temaService.findPage(tema, page, rows);		
	}*/
	
}
