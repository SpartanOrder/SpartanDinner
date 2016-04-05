package com.spartan.db.user;

import com.spartan.dao.CustomerMapper;
import com.spartan.model.Customer;
import com.spartan.model.CustomerExample;
import com.spartan.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TestCustomerUpdate {
    @Resource
    private CustomerMapper customerMapper;


    @Test
    public void testUpdateByExampleSelective() {
        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andSubbyEqualTo(1);
        Customer customer = new Customer();
        customer.setCustomerGender((byte) 1);
        User user = new User();
        user.setUserId(2);
        customer.setUser(user);
        customerMapper.updateByExampleSelective(customer, customerExample);
    }


    @Test
    public void testUpdateByPrimaryKeySelective() {
        Customer customer = new Customer();
        customer.setCustomerId(1);
        customer.setCustomerName("张钧泳修改");
        customerMapper.updateByPrimaryKeySelective(customer);
    }

}
