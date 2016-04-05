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

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description: .
 * @Date 2016/2/22 17:22
 */
@RunWith(SpringJUnit4ClassRunner.class)
//配置了@ContextConfiguration注解并使用该注解的locations属性指明spring和配置文件之后，
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class SpringTest {

    private static Logger logger = Logger.getLogger(TestMyBatis.class);
    private ApplicationContext ac = null;
    @Resource
    private DishService dishService;

    @Before
    public void before() {
        ac = new ClassPathXmlApplicationContext("ApplicationContext.xml", "spring-mybatis.xml");
        dishService = (DishService) ac.getBean("dishService");
    }

    @Test
    public void test1() {
        Dish dish = dishService.selectByPrimaryKey(1);
        System.out.println(dish);
        dish = dishService.selectByPrimaryKey(4);
        System.out.println(dish);
        // System.out.println(dish.getUserName());
        // logger.info("值："+dish.getUserName());
        // logger.info(JSON.toJSONString(dish));
    }
}
