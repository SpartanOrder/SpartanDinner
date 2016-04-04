package com.spartan.db;

import com.spartan.dao.DishMapper;
import com.spartan.model.Dish;
import com.spartan.model.DishExample;
import com.spartan.model.DishType;
import com.spartan.service.DishService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TestDishSelect {
    @Resource
    private DishService dishService;
    @Resource
    private DishMapper dishMapper;

    @Test
    public void testSelectByPrimaryKey() {
        Dish dish = dishService.selectByPrimaryKey(16);
        System.out.println(dish.toString());
    }

    @Test
    public void testSelectByExample() {
        DishExample example = new DishExample();
        DishExample.Criteria critera = example.createCriteria();
        critera.andDishNameLike("%菜%");
        critera.andDishNameIsNotNull();
        critera.andSubbyIsNotNull();
        example.setOrderByClause("dish_Name ASC");
        List<Dish> list = dishMapper.selectByExample(example);
        for (Dish dish : list) {
            System.out.println(dish.toString());
        }
    }

    @Test
    public void testSelectAll() {
        List<Dish> list = dishMapper.selectAll();
        System.out.println(list.size());
        for (Dish dish : list) {
            System.out.println(dish.toString());
        }
    }

    @Test
    public void testCountByExample() {
        DishExample dishExample = new DishExample();
        int size = dishMapper.countByExample(dishExample);
        System.out.println(size);
    }
}
