package com.spartan.db.tc;

import com.spartan.dao.DishMapper;
import com.spartan.dao.TempCarteContentMapper;
import com.spartan.dao.TempCarteInfoMapper;
import com.spartan.model.*;
import com.spartan.util.EnoughNumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description: .
 * @Date 2016/4/5 18:21
 */

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TempCarteUpdate {
    @Resource
    private TempCarteContentMapper tempCarteContentMapper;
    @Resource
    private TempCarteInfoMapper tempCarteInfoMapper;
    @Resource
    private DishMapper dishMapper;
    SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd-hh-mm-ss");

    @Test
    public void updateTCIByPrimarySelective() {
        TempCarteInfo tempCarteInfo = new TempCarteInfo();
        tempCarteInfo.setTciId(1);
        EmployeeInfo eciWaiter = new EmployeeInfo();
        eciWaiter.setEmployeeId(new Random().nextInt(6));
        tempCarteInfo.setTciWaiter(eciWaiter);
        User user = new User();
        user.setUserId(new Random().nextInt(6));
        tempCarteInfo.setUser(user);
        tempCarteInfoMapper.updateByPrimaryKeySelective(tempCarteInfo);
    }

    @Test
    public void updateTCIByPrimary() {
        TempCarteInfo tempCarteInfo = new TempCarteInfo();
        tempCarteInfo.setTciId(108);
        tempCarteInfo.setTciSwiftNumber(df.format(new Date()) + EnoughNumber.lpad(3, 999));
        tempCarteInfo.setTciState((byte) 1);
        DinningTable dinningTable = new DinningTable();
        dinningTable.setTableId(new Random().nextInt(6));
        tempCarteInfo.setDinningTable(dinningTable);
        EmployeeInfo eciWaiter = new EmployeeInfo();
        eciWaiter.setEmployeeId(new Random().nextInt(6));
        tempCarteInfo.setTciWaiter(eciWaiter);
        EmployeeInfo eciCashier = new EmployeeInfo();
        eciCashier.setEmployeeId(new Random().nextInt(6));
        Customer customer = new Customer();
        customer.setCustomerId(new Random().nextInt(6));
        tempCarteInfo.setCustomer(customer);
        MemberInfo memberInfo = new MemberInfo();
        memberInfo.setMemId(new Random().nextInt(6));
        tempCarteInfo.setMemberInfo(memberInfo);
        tempCarteInfo.setTciDishNums(2);
        tempCarteInfo.setTciAmountPeoplo(10);
        tempCarteInfo.setTciRepastTime(new Date());
        tempCarteInfo.setTciConsumeAmount(new BigDecimal(100));
        tempCarteInfo.setTciDiscount(new BigDecimal(10));
        tempCarteInfo.setTciCostAmount(new BigDecimal(100));
        tempCarteInfo.setDelFlag((byte) 1);
        User user = new User();
        user.setUserId(new Random().nextInt(6));
        tempCarteInfo.setUser(user);
        tempCarteInfoMapper.updateByPrimaryKey(tempCarteInfo);
    }

    @Test
    public void updateTCIByExampleSelective() {
        TempCarteInfo tempCarteInfo = new TempCarteInfo();
        EmployeeInfo eciWaiter = new EmployeeInfo();
        eciWaiter.setEmployeeId(new Random().nextInt(6));
        tempCarteInfo.setTciWaiter(eciWaiter);
        User user = new User();
        user.setUserId(new Random().nextInt(6));
        tempCarteInfo.setUser(user);
        tempCarteInfo.setTciState((byte) 2);
        TempCarteInfoExample tempCarteInfoExample = new TempCarteInfoExample();
        TempCarteInfoExample.Criteria criteria = tempCarteInfoExample.createCriteria();
        criteria.andTciWaiterIdBetween(1, 3);
        criteria.andTciIdBetween(1, 4);
        tempCarteInfoMapper.updateByExampleSelective(tempCarteInfo, tempCarteInfoExample);
    }


    @Test
    public void updateTCIByExample() {
        TempCarteInfo tempCarteInfo = new TempCarteInfo();
        tempCarteInfo.setTciId(1);
        tempCarteInfo.setTciSwiftNumber(df.format(new Date()) + EnoughNumber.lpad(3, 999));
        tempCarteInfo.setTciState((byte) 1);
        DinningTable dinningTable = new DinningTable();
        dinningTable.setTableId(new Random().nextInt(6));
        tempCarteInfo.setDinningTable(dinningTable);
        EmployeeInfo eciWaiter = new EmployeeInfo();
        eciWaiter.setEmployeeId(new Random().nextInt(6));
        tempCarteInfo.setTciWaiter(eciWaiter);
        EmployeeInfo eciCashier = new EmployeeInfo();
        eciCashier.setEmployeeId(new Random().nextInt(6));
        Customer customer = new Customer();
        customer.setCustomerId(new Random().nextInt(6));
        tempCarteInfo.setCustomer(customer);
        MemberInfo memberInfo = new MemberInfo();
        memberInfo.setMemId(new Random().nextInt(6));
        tempCarteInfo.setMemberInfo(memberInfo);
        tempCarteInfo.setTciDishNums(2);
        tempCarteInfo.setTciAmountPeoplo(10);
        tempCarteInfo.setTciRepastTime(new Date());
        tempCarteInfo.setTciConsumeAmount(new BigDecimal(100));
        tempCarteInfo.setTciDiscount(new BigDecimal(10));
        tempCarteInfo.setTciCostAmount(new BigDecimal(100));
        tempCarteInfo.setDelFlag((byte) 1);
        User user = new User();
        user.setUserId(new Random().nextInt(6));
        tempCarteInfo.setUser(user);
        TempCarteInfoExample tempCarteInfoExample = new TempCarteInfoExample();
        TempCarteInfoExample.Criteria criteria = tempCarteInfoExample.createCriteria();
        criteria.andTciIdEqualTo(1);
        tempCarteInfoMapper.updateByExample(tempCarteInfo, tempCarteInfoExample);
    }


    @Test
    public void updateTCCByPrimarySelective() {
        TempCarteContent tempCarteContent = new TempCarteContent();
        tempCarteContent.setTccId(1681);
        Dish dish = new Dish();
        dish.setDishId(1);
        tempCarteContent.setDish(dish);
        tempCarteContentMapper.updateByPrimaryKeySelective(tempCarteContent);
    }

    @Test
    public void updateTCCByPrimary() {
        TempCarteContent tempCarteContent = new TempCarteContent();
        tempCarteContent.setTccId(1681);
        TempCarteInfo tempCarteInfo = new TempCarteInfo();
        tempCarteInfo.setTciId(200);
        tempCarteContent.setTempCarteInfo(tempCarteInfo);
        Dish dish = dishMapper.selectByPrimaryKey(new Random().nextInt(700) + 1);
        tempCarteContent.setDish(dish);
        tempCarteContent.setTccDishNum(1);
        tempCarteContent.setTccTotalPrice(dish.getDishPrice());
        tempCarteContent.setTccSpecilDesc("updateTCCByPrimary");
        tempCarteContent.setDelFlag((byte) 1);
        User user = new User();
        user.setUserId(1);
        tempCarteContent.setUser(user);
        tempCarteContentMapper.updateByPrimaryKey(tempCarteContent);
    }

    @Test
    public void updateTCCByExampleSelective() {
        TempCarteContent tempCarteContent = new TempCarteContent();
        Dish dish = new Dish();
        dish.setDishId(1);
        tempCarteContent.setDish(dish);
        TempCarteContentExample tempCarteContentExample = new TempCarteContentExample();
        TempCarteContentExample.Criteria criteria = tempCarteContentExample.createCriteria();
        criteria.andTccSpecilDescEqualTo("updateTCCByPrimary");
        criteria.andTccTciIdEqualTo(200);
        tempCarteContentMapper.updateByExampleSelective(tempCarteContent, tempCarteContentExample);
    }


    @Test
    public void updateTCCByExample() {
        TempCarteContent tempCarteContent = new TempCarteContent();
        tempCarteContent.setTccId(1681);
        TempCarteInfo tempCarteInfo = new TempCarteInfo();
        tempCarteInfo.setTciId(200);
        tempCarteContent.setTempCarteInfo(tempCarteInfo);
        Dish dish = dishMapper.selectByPrimaryKey(new Random().nextInt(700) + 1);
        tempCarteContent.setDish(dish);
        tempCarteContent.setTccDishNum(1);
        tempCarteContent.setTccTotalPrice(dish.getDishPrice());
        tempCarteContent.setTccSpecilDesc("updateTCCByExample");
        tempCarteContent.setDelFlag((byte) 1);
        User user = new User();
        user.setUserId(1);
        tempCarteContent.setUser(user);
        TempCarteContentExample tempCarteContentExample = new TempCarteContentExample();
        TempCarteContentExample.Criteria criteria = tempCarteContentExample.createCriteria();
        criteria.andTccSpecilDescEqualTo("updateTCCByPrimary");
        tempCarteContentMapper.updateByExample(tempCarteContent, tempCarteContentExample);
    }
}
