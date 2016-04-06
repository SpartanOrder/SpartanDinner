package com.spartan.db.department;

import com.spartan.dao.DepartmentMapper;
import com.spartan.model.Department;
import com.spartan.model.DepartmentExample;
import com.spartan.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TestDepartmentUpdate {
    @Resource
    private DepartmentMapper customerMapper;


    @Test
    public void testUpdateByExampleSelective() {
        DepartmentExample customerExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = customerExample.createCriteria();
        criteria.andSubbyEqualTo(1);
        Department customer = new Department();
        User user = new User();
        user.setUserId(2);
        customer.setUser(user);
        customerMapper.updateByExampleSelective(customer, customerExample);
    }


    @Test
    public void testUpdateByPrimaryKeySelective() {
        Department customer = new Department();
        customer.setDepartmentId(1);
        customer.setDepartmentName("张钧泳修改");
        customerMapper.updateByPrimaryKeySelective(customer);
    }

}
