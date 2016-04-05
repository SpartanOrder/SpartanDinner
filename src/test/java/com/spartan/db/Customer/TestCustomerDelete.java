package com.spartan.db.customer;

import com.spartan.dao.CustomerMapper;
import com.spartan.model.CustomerExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TestCustomerDelete {
    @Resource
    private CustomerMapper customerMapper;

    @Test
    public void testDeleteByPrimaryKey() {
        customerMapper.deleteByPrimaryKey(1);
    }

    @Test
    public void testDeleteByExample() {
        CustomerExample customerExample = new CustomerExample();
        CustomerExample.Criteria criteria = customerExample.createCriteria();
        criteria.andSubbyEqualTo(2);
        System.out.println(customerMapper.deleteByExample(customerExample));
    }
}
