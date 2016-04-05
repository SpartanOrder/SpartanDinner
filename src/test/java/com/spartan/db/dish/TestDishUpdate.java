package com.spartan.db.dish;

import com.spartan.dao.DishMapper;
import com.spartan.model.Dish;
import com.spartan.model.DishExample;
import com.spartan.model.DishType;
import com.spartan.model.User;
import com.spartan.service.DishService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TestDishUpdate {
    @Resource
    private DishService dishService;
    @Resource
    private DishMapper dishMapper;

    /**
     * 一般不使用
     */
    @Test
    public void testUpdateByExampleSelective() {
        DishExample dishExample = new DishExample();
        DishExample.Criteria criteria = dishExample.createCriteria();
        Dish dish = new Dish();
        //注意此处不能忽略在where后面加上id=1的sql语句，因为此处的update只是对id进行set
        criteria.andDishIdEqualTo(1);
        DishType dishType = new DishType();
        dishType.setDishTypeId(4);
        dish.setDishType(dishType);
        dish.setDishName("大白菜修改");
        dish.setDishSpeel("dbcxg");
        User user = new User();
        user.setUserId(1);
        dish.setUser(user);
        dishMapper.updateByExampleSelective(dish, dishExample);
    }

    /**
     * 一般不使用
     */
    @Test
    public void testUpdateByExample() {
        DishExample dishExample = new DishExample();
        DishExample.Criteria criteria = dishExample.createCriteria();
        Dish dish = new Dish();
        dish.setDishId(1);
        //注意此处不能忽略在where后面加上id=1的sql语句，因为此处的update只是对id进行set
        criteria.andDishIdEqualTo(1);
        DishType dishType = new DishType();
        dishType.setDishTypeId(4);
        dish.setDishType(dishType);
        dish.setDishName("大白菜修改");
        dish.setDishSpeel("dbc");
        dish.setDishCost(new BigDecimal(6));
        dish.setDishUnit("碟");
        dish.setDishPrice(new BigDecimal(10));
        dish.setDishDescription("清炒");
        dish.setDishCooking("清炒");
        dish.setDishImgUrl("test.jpg");
        dish.setDelFlag(new Byte((byte) 1));
        User user = new User();
        user.setUserId(1);
        dish.setUser(user);
        dishMapper.updateByExample(dish, dishExample);
    }

    @Test
    public void testUpdateByPrimaryKeySelective() {
        Dish dish = new Dish();
        dish.setDishId(1);
        DishType dishType = new DishType();
        dishType.setDishTypeId(6);
        dish.setDishType(dishType);
        dish.setDishName("大白菜修改5");
        dish.setDishImgUrl("test3.jpg");
        User user = new User();
        user.setUserId(2);
        dish.setUser(user);
        dishMapper.updateByPrimaryKeySelective(dish);
    }

    @Test
    public void testUpdateByPrimaryKey() {
        Dish dish = new Dish();
        dish.setDishId(1);
        DishType dishType = new DishType();
        dishType.setDishTypeId(2);
        dish.setDishType(dishType);
        dish.setDishName("大白菜修改3");
        dish.setDishSpeel("dbc");
        dish.setDishCost(new BigDecimal(6));
        dish.setDishUnit("碟");
        dish.setDishPrice(new BigDecimal(10));
        dish.setDishDescription("清炒");
        dish.setDishCooking("清炒");
        dish.setDishImgUrl("test.jpg");
        dish.setDelFlag(new Byte((byte) 1));
        User user = new User();
        user.setUserId(1);
        dish.setUser(user);
        dishMapper.updateByPrimaryKey(dish);
    }

    ;
}
