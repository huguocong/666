package my;

import com.service.TemaService;
import com.service.UserService;
import com.service.impl.TemaServiceImpl;
import jdk.nashorn.internal.ir.annotations.Reference;
import mapper.TbTemaMapper;
import mapper.UserMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import pojo.TbTema;
import pojo.User;
import pojo.UserExample;

import javax.annotation.Resource;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class test {

    @Test
    public void x() {
      ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/applicationContext-dao.xml");
       TbTemaMapper tbTemaMapper = (TbTemaMapper) applicationContext.getBean(TbTemaMapper.class);
        TbTema tbTema = new TbTema();
        tbTema.setTema(1);
        tbTema.setXiao("long");
        tbTema.setDate(new Date());
        tbTemaMapper.insert(tbTema);
    }


    @Test
    public void x1() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("/spring/applicationContext-*.xml");
        UserMapper userMapper = (UserMapper) applicationContext.getBean(UserMapper.class);
        Calendar calendar2 = Calendar.getInstance();
        calendar2.set(calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH), calendar2.get(Calendar.DAY_OF_MONTH),
                23, 59, 59);
        Date endDate = calendar2.getTime();
        calendar2.set(calendar2.get(Calendar.YEAR), calendar2.get(Calendar.MONTH), calendar2.get(Calendar.DAY_OF_MONTH),
                0, 0, 0);
        Date startDate = calendar2.getTime();

        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andDateBetween(startDate,endDate);

        List<User> users = userMapper.selectByExample(example);
        for (User s:users
             ) {
            System.out.println(s);

        }
        }

    @Test
    public void Count() {



        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/spring/applicationContext-*.xml");


        TemaService temaService = (TemaService) applicationContext.getBean(TemaService.class);
        List<TbTema> finddate = temaService.finddate("1");
        for (TbTema s:finddate
             ) {
            System.out.println(s);

        }

    }




}

