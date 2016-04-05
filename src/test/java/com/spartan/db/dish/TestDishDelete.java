package com.spartan.db.dish;

import com.spartan.dao.DishMapper;
import com.spartan.model.DishExample;
import com.spartan.service.DishService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TestDishDelete {
    @Resource
    private DishService dishService;
    @Resource
    private DishMapper dishMapper;

    @Test
    public void testDeleteByPrimaryKey() {
        dishMapper.deleteByPrimaryKey(1);

    }

    @Test
    public void testDeleteByExample() {
        DishExample dishExample = new DishExample();
        DishExample.Criteria criteria = dishExample.createCriteria();
        criteria.andDishDescriptionLike("瓦煲蒸炖");
        criteria.andDishIdEqualTo(1);
        dishMapper.deleteByExample(dishExample);
    }
}
