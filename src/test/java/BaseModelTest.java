import com.spartan.model.Dish;
import com.spartan.service.DishService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})

public class BaseModelTest {
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
        Dish dish = dishService.selectByPrimaryKey(1);
        System.out.println(dish);
        dish = dishService.selectByPrimaryKey(2);
        System.out.println(dish);
        // System.out.println(dish.getUserName());
        // logger.info("值："+dish.getUserName());
        // logger.info(JSON.toJSONString(dish));
    }
}
