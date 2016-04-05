package com.spartan.db.customer;

import com.spartan.dao.CustomerMapper;
import com.spartan.model.Customer;
import com.spartan.model.CustomerExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TestCostomerSelect {
    @Resource
    private CustomerMapper customerMapper;

    @Test
    public void testSelectByPrimaryKey() {
        Customer customer = customerMapper.selectByPrimaryKey(1);
        System.out.println(customer.toString());
    }

    @Test
    public void testSelectByExample() {
        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andSubbyEqualTo(1);
        List<Customer> list = customerMapper.selectByExample(customerExample);
        for (Customer customer : list) {
            System.out.println(customer.toString());
        }
    }


    @Test
    public void testCountByExample() {
        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andSubbyBetween(1, 1000);
        int size = customerMapper.countByExample(customerExample);
        System.out.println(size);
    }
}
