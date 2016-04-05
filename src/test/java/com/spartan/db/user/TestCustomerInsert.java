package com.spartan.db.user;

import com.spartan.dao.CustomerMapper;
import com.spartan.model.Customer;
import com.spartan.model.User;
import com.spartan.util.EnoughNumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TestCustomerInsert {
    @Resource
    private CustomerMapper customerMapper;

    @Test
    public void testInsertSelectiveBatch() {
        for (int i = 1; i <= 100; i++) {
            Customer customer = new Customer();
            customer.setCustomerName("张钧泳" + i);
            customer.setCustomerTel(EnoughNumber.lpad(11, 135368235 + i));
            //            customer.setCustomerGender((byte) 1);
            customer.setDelFlag((byte) 0);
            User user = new User();
            user.setUserId(1);
            customer.setUser(user);
            customerMapper.insertSelective(customer);
        }
    }

    @Test
    public void testInsertBatch() {
        for (int i = 1; i <= 100; i++) {
            Customer customer = new Customer();
            customer.setCustomerName("张钧泳" + i);
            customer.setCustomerTel(EnoughNumber.lpad(11, 135338214 + i));
            customer.setCustomerGender((byte) 1);
            customer.setDelFlag((byte) 0);
            User user = new User();
            user.setUserId(1);
            customer.setUser(user);
            customerMapper.insert(customer);
        }
    }

}
