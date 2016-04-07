package com.spartan.db.amount;

import com.spartan.dao.AmountTotalMapper;
import com.spartan.model.AmountTotal;
import com.spartan.model.AmountTotalExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TestAmountTotalSelect {
    @Resource
    private AmountTotalMapper amountTotalMapper;

    @Test
    public void testSelectByPrimaryKey() {
        AmountTotal amountTotal = amountTotalMapper.selectByPrimaryKey(1);
        System.out.println(amountTotal.toString());
    }

    @Test
    public void testSelectByExample() {
        AmountTotalExample amountTotalExample = new AmountTotalExample();
        AmountTotalExample.Criteria criteria = amountTotalExample.createCriteria();
        criteria.andSubbyEqualTo(1);
        List<AmountTotal> list = amountTotalMapper.selectByExample(amountTotalExample);
        for (AmountTotal amountTotal : list) {
            System.out.println(amountTotal.toString());
        }
    }


    @Test
    public void testCountByExample() {
        AmountTotalExample amountTotalExample = new AmountTotalExample();
        AmountTotalExample.Criteria criteria = amountTotalExample.createCriteria();
        criteria.andSubbyBetween(1, 1000);
        int size = amountTotalMapper.countByExample(amountTotalExample);
        System.out.println(size);
    }
}
