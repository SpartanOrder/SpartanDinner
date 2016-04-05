package com.spartan.db.user;

import com.spartan.dao.UserMapper;
import com.spartan.model.User;
import com.spartan.model.UserExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TestUserSelect {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelectByPrimaryKey() {
        User user = userMapper.selectByPrimaryKey(1);
        System.out.println(user.toString());
    }

    @Test
    public void testSelectByExample() {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andUserNameLike("%钧%");
        List<User> list = userMapper.selectByExample(userExample);
        for (User user : list) {
            System.out.println(user.toString());
        }
    }


    @Test
    public void testCountByExample() {
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andSubbyIsNotNull();
        int size = userMapper.countByExample(userExample);
        System.out.println(size);
    }
}
