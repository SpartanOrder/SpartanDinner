package com.spartan.db.insert;

import com.spartan.model.Dish;
import com.spartan.service.DishService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class InsertDish {
    @Resource
    private DishService dishService = null;

    @Test
    public void testInsertBatch() {
        for (int i = 1; i <= 100; i++) {
            Dish dish = new Dish();
            dish.setDishTypeId(2);
            dish.setDishName("鱼香茄子煲30" + i);
            dish.setDishSpeel("yxqzb");
            dish.setDishCost(new BigDecimal(6));
            dish.setDishUnit("堡");
            dish.setDishPrice(new BigDecimal(10));
            dish.setDishDescription("瓦煲蒸炖");
            dish.setDishCooking("味重，飘香四里");
            dish.setDishImgUrl("test.jpg");
            dish.setDelFlag(new Byte((byte) 1));
            dishService.insert(dish);
        }
        Dish dish = new Dish();
        dish.setDishId(102);
        dish.setDishTypeId(1);
        dish.setDishName("大白菜i");
        dish.setDishSpeel("dbc");
        dish.setDishCost(new BigDecimal(6));
        dish.setDishUnit("斤");
        dish.setDishPrice(new BigDecimal(10));
        dish.setDishDescription("四季菜");
        dish.setDishCooking("清炒、微辣");
        dish.setDishImgUrl("test.jpg");
        dish.setDelFlag(new Byte((byte) 1));
        dish.setSubby(1);
        dishService.updateByPrimaryKey(dish);
    }

}
