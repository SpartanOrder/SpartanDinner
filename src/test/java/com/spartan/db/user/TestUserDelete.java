package com.spartan.db.user;

import com.spartan.dao.UserMapper;
import com.spartan.model.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TestUserDelete {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testDeleteByPrimaryKey() {
        userMapper.deleteByPrimaryKey(1);
    }

    @Test
    public void testDeleteByExample() {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andSubbyEqualTo(2);
        System.out.println(userMapper.deleteByExample(userExample));
    }
}
