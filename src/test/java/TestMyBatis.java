import javax.annotation.Resource;

import com.spartan.model.Dish;
import com.spartan.service.DishService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
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
    //  private ApplicationContext oc = null;
    @Resource
    private DishService dishService = null;

    //  @Before
    //  public void before() {
    //      oc = new ClassPathXmlApplicationContext("applicationContext.xml");
    //      userService = (IUserService) oc.getBean("userService");
    //  }

    @Test
    public void test1() {
        Dish dish = dishService.selectByPrimaryKey(1);
        System.out.println(dish);
        dish = dishService.selectByPrimaryKey(2);
        System.out.println(dish);
        // System.out.println(dish.getUserName());
        // logger.info("值："+dish.getUserName());
        // logger.info(JSON.toJSONString(dish));
    }
}
