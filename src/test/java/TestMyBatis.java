import javax.annotation.Resource;

import com.spartan.model.Dish;
import com.spartan.service.DishService;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description: .
 * @Date 2016/3/18 16:11
 */
@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})

public class TestMyBatis {
    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    //  private ApplicationContext ac = null;
    @Resource
    private DishService dishService = null;

    //  @Before
    //  public void before() {
    //      ac = new ClassPathXmlApplicationContext("applicationContext.xml");
    //      userService = (IUserService) ac.getBean("userService");
    //  }

    @Test
    public void test1() {
        Dish dish = dishService.getDish(1);
        System.out.println(dish);
        dish = dishService.getDish(4);
        System.out.println(dish);
        // System.out.println(user.getUserName());
        // logger.info("值："+user.getUserName());
        // logger.info(JSON.toJSONString(user));
    }
}
