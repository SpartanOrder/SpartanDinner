package com.spartan.db.amount;

import com.spartan.dao.AmountTotalMapper;
import com.spartan.model.AmountTotalExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TestAmountTotalDelete {
    @Resource
    private AmountTotalMapper amountTotalMapper;

    @Test
    public void testDeleteByPrimaryKey() {
        amountTotalMapper.deleteByPrimaryKey(1);
    }

    @Test
    public void testDeleteByExample() {
        AmountTotalExample amountTotalExample = new AmountTotalExample();
        AmountTotalExample.Criteria criteria = amountTotalExample.createCriteria();
        criteria.andSubbyEqualTo(1);
        System.out.println(amountTotalMapper.deleteByExample(amountTotalExample));
    }
}
