package my;

import com.alibaba.fastjson.JSONObject;
import com.service.TemaService;
import com.service.XiaoService;
import mapper.TbTemaMapper;
import mapper.TbXiaoMapper;
import net.sf.json.JSON;
import net.sf.json.JSONArray;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.TbTema;
import pojo.TbXiao;
import pojo.ma;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;


public class x {
/*
    @Resource
    private TemaService temaService;

    @Test
    public void s(){

       *//*
       ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        TemaService xiaoMapper = (TemaService) applicationContext.getBean("TemaService");*//*
        TbTema tbTema = new TbTema();
        tbTema.setId(1);
        tbTema.setTema(1);
        tbTema.setXiao("Long");
        tbTema.setDate(new Date());
        temaService.add(tbTema);
       *//* List<TbTema> all = xiaoMapper.findAll();
        for (TbTema s:all
             ) {
            System.out.println(s);

        }*//*

    }

    @Test
    public void user(){

        ApplicationContext applicationContext = new
                ClassPathXmlApplicationContext("spring/applicationContext-*.xml");
        TbTemaMapper bean = applicationContext.getBean(TbTemaMapper.class);
      *//*  TbTema tbTema = new TbTema();
        tbTema.setId(1);
        tbTema.setTema(1);
        tbTema.setXiao("Long");
        tbTema.setDate(new Date());
        bean.insert(tbTema);*//*
        List<TbTema> tbTemas =
                bean.selectByExample(null);
        for (TbTema s:tbTemas
             ) {
            System.out.println(s.toString());

        }
   *//*     TemaService xiaoMapper = (TemaService) applicationContext.getBean();
        List<TbTema> all = xiaoMapper.findAll();
        for (TbTema s:all
        ) {
            System.out.println(s);

        }*//*
    }*/

    @Test
    public  void s(){
        String s="[ {\"haoma\":\"21\",\"monny\":\"20\"},{\"haoma\":\"221\",\"monny\":\"220\"}]";
        List<ma> mas = JSONObject.parseArray(s, ma.class);
        for (ma ss:mas
             ) {
            System.out.println(ss);
        }


    }
}


















