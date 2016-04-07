package com.spartan.db.amount;

import com.spartan.dao.AmountTotalMapper;
import com.spartan.model.AmountTotal;
import com.spartan.model.AmountTotalExample;
import com.spartan.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TestAmountTotalUpdate {
    @Resource
    private AmountTotalMapper amountTotalMapper;


    @Test
    public void testUpdateByExampleSelective() {
        AmountTotalExample amountTotalExample = new AmountTotalExample();
        AmountTotalExample.Criteria criteria = amountTotalExample.createCriteria();
        criteria.andSubbyEqualTo(1);
        AmountTotal amountTotal = new AmountTotal();
        amountTotal.setTotalYear(2016);
        amountTotal.setTotalMonth(1);
        amountTotal.setTotalDay(0);
        amountTotal.setTotalDaytime(0);
        amountTotal.setTotalNum(10);
        amountTotal.setTotalEndNum(10);
        amountTotal.setTotalOnaccountNum(0);
        amountTotal.setTotalAmount(new BigDecimal(1000));
        amountTotal.setTotalEndAmount(new BigDecimal(1000));
        amountTotal.setTotalOnaccountAmount(new BigDecimal(0));
        User user = new User();
        user.setUserId(1);
        amountTotal.setUser(user);
        amountTotalMapper.updateByExampleSelective(amountTotal, amountTotalExample);
    }


    @Test
    public void testUpdateByPrimaryKeySelective() {
        AmountTotal amountTotal = new AmountTotal();
        amountTotal.setTotalYear(2015);
        amountTotal.setTotalMonth(1);
        amountTotal.setTotalDay(0);
        amountTotal.setTotalDaytime(0);
        amountTotal.setTotalNum(10);
        amountTotal.setTotalEndNum(10);
        amountTotal.setTotalOnaccountNum(0);
        amountTotal.setTotalAmount(new BigDecimal(1000));
        amountTotal.setTotalEndAmount(new BigDecimal(1000));
        amountTotal.setTotalOnaccountAmount(new BigDecimal(0));
        amountTotal.setDelFlag((byte) 0);
        User user = new User();
        user.setUserId(1);
        amountTotal.setUser(user);
        amountTotalMapper.updateByPrimaryKeySelective(amountTotal);
    }

}
