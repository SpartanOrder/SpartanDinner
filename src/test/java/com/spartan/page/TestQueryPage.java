package com.spartan.page;

import com.github.pagehelper.PageHelper;
import com.spartan.model.Dish;
import com.spartan.service.DishService;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})

public class TestQueryPage {
    private static Logger logger = Logger.getLogger(TestQueryPage.class);
    @Resource
    private DishService dishService = null;


    @Test
    public void testQuery() {
        PageHelper.startPage(1, 10);
        List<Dish> list = dishService.selectAll();
        PageBean<Dish> pageBean = new PageBean<>(list);
        for (Dish dish : list) {
            System.out.println(dish.toString());
        }
        System.out.println(pageBean.toString());
    }

    @Test
    public void testQueryReasonable() {
        PageHelper.startPage(-11, 10);
        List<Dish> list = dishService.selectAll();
        PageBean<Dish> pageBean = new PageBean<>(list);
        for (Dish dish : list) {
            System.out.println(dish.toString());
        }
        System.out.println(pageBean.toString());
    }
}
