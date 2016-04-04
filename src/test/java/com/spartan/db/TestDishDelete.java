package com.spartan.db;

import com.spartan.dao.DishMapper;
import com.spartan.model.Dish;
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
public class TestDishDelete {
    @Resource
    private DishService dishService;
    @Resource
    private DishMapper dishMapper;

    @Test
    public void testInsertSelectiveBatch() {
        for (int i = 1; i <= 100; i++) {
            Dish dish = new Dish();
            DishType dishType = new DishType();
            dishType.setDishTypeId(2);
            dishType.setDishTypeName("青菜");
            dish.setDishType(dishType);
            dish.setDishName("大白菜二" + i);
            dish.setDishSpeel("dbc");
            dish.setDishCost(new BigDecimal(6));
            dish.setDishUnit("碟");
            dish.setDishPrice(new BigDecimal(10));
            dish.setDishDescription("清炒");
            dish.setDishCooking("清炒");
            dish.setDishImgUrl("test.jpg");
            dish.setDelFlag(new Byte((byte) 1));
            User user = new User();
            user.setUserId(2);
            dish.setUser(user);
            dishService.insertSelective(dish);
        }
    }

    @Test
    public void testInsertBatch() {
        for (int i = 1; i <= 100; i++) {
            Dish dish = new Dish();
            DishType dishType = new DishType();
            dishType.setDishTypeId(1);
            dishType.setDishTypeName("热卖");
            dish.setDishType(dishType);
            dish.setDishName("鱼香茄子煲三" + i);//尝试注释改行
            dish.setDishSpeel("yxqzb");
            dish.setDishCost(new BigDecimal(6));
            dish.setDishUnit("堡");
            dish.setDishPrice(new BigDecimal(10));
            dish.setDishDescription("瓦煲蒸炖");
            dish.setDishCooking("味重，飘香四里");
            dish.setDishImgUrl("test.jpg");
            dish.setDelFlag(new Byte((byte) 1));
            User user = new User();
            user.setUserId(1);
            dish.setUser(user);
            dishService.insert(dish);
        }
    }

}
