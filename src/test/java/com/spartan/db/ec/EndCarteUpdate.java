package com.spartan.db.ec;

import com.spartan.dao.DishMapper;
import com.spartan.dao.EndCarteContentMapper;
import com.spartan.dao.EndCarteInfoMapper;
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
public class EndCarteUpdate {
    @Resource
    private EndCarteContentMapper endCarteContentMapper;
    @Resource
    private EndCarteInfoMapper endCarteInfoMapper;
    @Resource
    private DishMapper dishMapper;
    SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd-hh-mm-ss");

    @Test
    public void updateECIByPrimarySelective() {
        EndCarteInfo endCarteInfo = new EndCarteInfo();
        endCarteInfo.setEciId(108);
        EmployeeInfo eciWaiter = new EmployeeInfo();
        eciWaiter.setEmployeeId(new Random().nextInt(6));
        endCarteInfo.setEciWaiter(eciWaiter);
        User user = new User();
        user.setUserId(new Random().nextInt(6));
        endCarteInfo.setUser(user);
        endCarteInfoMapper.updateByPrimaryKeySelective(endCarteInfo);
    }

    @Test
    public void updateECIByPrimary() {
        EndCarteInfo endCarteInfo = new EndCarteInfo();
        endCarteInfo.setEciId(108);
        endCarteInfo.setEciSwiftNumber(df.format(new Date()) + EnoughNumber.lpad(3, 999));
        endCarteInfo.setEciState((byte) 1);
        DinningTable dinningTable = new DinningTable();
        dinningTable.setTableId(new Random().nextInt(6));
        endCarteInfo.setDinningTable(dinningTable);
        EmployeeInfo eciWaiter = new EmployeeInfo();
        eciWaiter.setEmployeeId(new Random().nextInt(6));
        endCarteInfo.setEciWaiter(eciWaiter);
        EmployeeInfo eciCashier = new EmployeeInfo();
        eciCashier.setEmployeeId(new Random().nextInt(6));
        endCarteInfo.setEciCashier(eciCashier);
        Customer customer = new Customer();
        customer.setCustomerId(new Random().nextInt(6));
        endCarteInfo.setCustomer(customer);
        MemberInfo memberInfo = new MemberInfo();
        memberInfo.setMemId(new Random().nextInt(6));
        endCarteInfo.setMemberInfo(memberInfo);
        endCarteInfo.setEciDishNums(2);
        endCarteInfo.setEciAmountPeoplo(10);
        endCarteInfo.setEciRepastTime(new Date());
        String[] payMethods = {"现金", "刷卡", "微信支付"};
        endCarteInfo.setEciPayMethod(payMethods[new Random().nextInt(3)]);
        endCarteInfo.setEciConsumeAmount(new BigDecimal(100));
        endCarteInfo.setEciDiscount(new BigDecimal(10));
        endCarteInfo.setEciPaidAmount(new BigDecimal(100));
        endCarteInfo.setDelFlag((byte) 1);
        User user = new User();
        user.setUserId(new Random().nextInt(6));
        endCarteInfo.setUser(user);
        endCarteInfoMapper.updateByPrimaryKey(endCarteInfo);
    }

    @Test
    public void updateECIByExampleSelective() {
        EndCarteInfo endCarteInfo = new EndCarteInfo();
        EmployeeInfo eciWaiter = new EmployeeInfo();
        eciWaiter.setEmployeeId(new Random().nextInt(6));
        endCarteInfo.setEciWaiter(eciWaiter);
        User user = new User();
        user.setUserId(new Random().nextInt(6));
        endCarteInfo.setUser(user);
        endCarteInfo.setEciState((byte) 2);
        EndCarteInfoExample endCarteInfoExample = new EndCarteInfoExample();
        EndCarteInfoExample.Criteria criteria = endCarteInfoExample.createCriteria();
        criteria.andEciWaiterIdBetween(1, 3);
        criteria.andEciIdBetween(1, 4);
        endCarteInfoMapper.updateByExampleSelective(endCarteInfo, endCarteInfoExample);
    }


    @Test
    public void updateECIByExample() {
        EndCarteInfo endCarteInfo = new EndCarteInfo();
        endCarteInfo.setEciId(1);
        endCarteInfo.setEciSwiftNumber(df.format(new Date()) + EnoughNumber.lpad(3, 999));
        endCarteInfo.setEciState((byte) 1);
        DinningTable dinningTable = new DinningTable();
        dinningTable.setTableId(new Random().nextInt(6));
        endCarteInfo.setDinningTable(dinningTable);
        EmployeeInfo eciWaiter = new EmployeeInfo();
        eciWaiter.setEmployeeId(new Random().nextInt(6));
        endCarteInfo.setEciWaiter(eciWaiter);
        EmployeeInfo eciCashier = new EmployeeInfo();
        eciCashier.setEmployeeId(new Random().nextInt(6));
        endCarteInfo.setEciCashier(eciCashier);
        Customer customer = new Customer();
        customer.setCustomerId(new Random().nextInt(6));
        endCarteInfo.setCustomer(customer);
        MemberInfo memberInfo = new MemberInfo();
        memberInfo.setMemId(new Random().nextInt(6));
        endCarteInfo.setMemberInfo(memberInfo);
        endCarteInfo.setEciDishNums(2);
        endCarteInfo.setEciAmountPeoplo(10);
        endCarteInfo.setEciRepastTime(new Date());
        String[] payMethods = {"现金", "刷卡", "微信支付"};
        endCarteInfo.setEciPayMethod(payMethods[new Random().nextInt(3)]);
        endCarteInfo.setEciConsumeAmount(new BigDecimal(100));
        endCarteInfo.setEciDiscount(new BigDecimal(10));
        endCarteInfo.setEciPaidAmount(new BigDecimal(100));
        endCarteInfo.setDelFlag((byte) 1);
        User user = new User();
        user.setUserId(new Random().nextInt(6));
        endCarteInfo.setUser(user);
        EndCarteInfoExample endCarteInfoExample = new EndCarteInfoExample();
        EndCarteInfoExample.Criteria criteria = endCarteInfoExample.createCriteria();
        criteria.andEciIdEqualTo(1);
        endCarteInfoMapper.updateByExample(endCarteInfo, endCarteInfoExample);
    }


    @Test
    public void updateTCCByPrimarySelective() {
        EndCarteContent endCarteContent = new EndCarteContent();
        endCarteContent.setEccId(1681);
        Dish dish = new Dish();
        dish.setDishId(1);
        endCarteContent.setDish(dish);
        endCarteContentMapper.updateByPrimaryKeySelective(endCarteContent);
    }

    @Test
    public void updateTCCByPrimary() {
        EndCarteContent endCarteContent = new EndCarteContent();
        endCarteContent.setEccId(1681);
        EndCarteInfo endCarteInfo = new EndCarteInfo();
        endCarteInfo.setEciId(200);
        endCarteContent.setEndCarteInfo(endCarteInfo);
        Dish dish = dishMapper.selectByPrimaryKey(new Random().nextInt(700) + 1);
        endCarteContent.setDish(dish);
        endCarteContent.setEccDishNum(1);
        endCarteContent.setEccTotalPrice(dish.getDishPrice());
        endCarteContent.setEccSpecilDesc("updateTCCByPrimary");
        endCarteContent.setDelFlag((byte) 1);
        User user = new User();
        user.setUserId(1);
        endCarteContent.setUser(user);
        endCarteContentMapper.updateByPrimaryKey(endCarteContent);
    }

    @Test
    public void updateTCCByExampleSelective() {
        EndCarteContent endCarteContent = new EndCarteContent();
        Dish dish = new Dish();
        dish.setDishId(1);
        endCarteContent.setDish(dish);
        EndCarteContentExample endCarteContentExample = new EndCarteContentExample();
        EndCarteContentExample.Criteria criteria = endCarteContentExample.createCriteria();
        criteria.andEccSpecilDescEqualTo("updateTCCByPrimary");
        criteria.andEccEciIdEqualTo(200);
        endCarteContentMapper.updateByExampleSelective(endCarteContent, endCarteContentExample);
    }


    @Test
    public void updateTCCByExample() {
        EndCarteContent endCarteContent = new EndCarteContent();
        endCarteContent.setEccId(1681);
        EndCarteInfo endCarteInfo = new EndCarteInfo();
        endCarteInfo.setEciId(200);
        endCarteContent.setEndCarteInfo(endCarteInfo);
        Dish dish = dishMapper.selectByPrimaryKey(new Random().nextInt(700) + 1);
        endCarteContent.setDish(dish);
        endCarteContent.setEccDishNum(1);
        endCarteContent.setEccTotalPrice(dish.getDishPrice());
        endCarteContent.setEccSpecilDesc("updateTCCByExample");
        endCarteContent.setDelFlag((byte) 1);
        User user = new User();
        user.setUserId(1);
        endCarteContent.setUser(user);
        EndCarteContentExample endCarteContentExample = new EndCarteContentExample();
        EndCarteContentExample.Criteria criteria = endCarteContentExample.createCriteria();
        criteria.andEccSpecilDescEqualTo("updateTCCByPrimary");
        endCarteContentMapper.updateByExample(endCarteContent, endCarteContentExample);
    }

}
