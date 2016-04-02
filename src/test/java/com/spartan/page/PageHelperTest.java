package com.spartan.page;

import javax.annotation.Resource;

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
public class PageHelperTest {
    private static Logger logger = Logger.getLogger(PageHelperTest.class);
    //  private ApplicationContext ac = null;
    @Resource
    private DishService dishService = null;

    @Test
    public void test1() {
        dishService.selectAll();
    }
}
