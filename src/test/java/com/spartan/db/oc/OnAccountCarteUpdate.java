package com.spartan.db.oc;

import com.spartan.dao.DishMapper;
import com.spartan.dao.OnAccountCarteContentMapper;
import com.spartan.dao.OnAccountCarteInfoMapper;
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
public class OnAccountCarteUpdate {
    @Resource
    private OnAccountCarteContentMapper onaccountCarteContentMapper;
    @Resource
    private OnAccountCarteInfoMapper onaccountCarteInfoMapper;
    @Resource
    private DishMapper dishMapper;
    SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd-hh-mm-ss");

    @Test
    public void updateOCIByPrimarySelective() {
        OnAccountCarteInfo onaccountCarteInfo = new OnAccountCarteInfo();
        onaccountCarteInfo.setOciId(108);
        EmployeeInfo ociWaiter = new EmployeeInfo();
        ociWaiter.setEmployeeId(new Random().nextInt(6));
        onaccountCarteInfo.setOciWaiter(ociWaiter);
        User user = new User();
        user.setUserId(new Random().nextInt(6));
        onaccountCarteInfo.setUser(user);
        onaccountCarteInfoMapper.updateByPrimaryKeySelective(onaccountCarteInfo);
    }

    @Test
    public void updateOCIByPrimary() {
        OnAccountCarteInfo onaccountCarteInfo = new OnAccountCarteInfo();
        onaccountCarteInfo.setOciId(108);
        onaccountCarteInfo.setOciSwiftNumber(df.format(new Date()) + EnoughNumber.lpad(3, 999));
        onaccountCarteInfo.setOciState((byte) 1);
        DinningTable dinningTable = new DinningTable();
        dinningTable.setTableId(new Random().nextInt(6));
        onaccountCarteInfo.setDinningTable(dinningTable);
        EmployeeInfo ociWaiter = new EmployeeInfo();
        ociWaiter.setEmployeeId(new Random().nextInt(6));
        onaccountCarteInfo.setOciWaiter(ociWaiter);
        EmployeeInfo ociCashier = new EmployeeInfo();
        ociCashier.setEmployeeId(new Random().nextInt(6));
        onaccountCarteInfo.setOciCashier(ociCashier);
        Customer customer = new Customer();
        customer.setCustomerId(new Random().nextInt(6));
        onaccountCarteInfo.setCustomer(customer);
        MemberInfo memberInfo = new MemberInfo();
        memberInfo.setMemId(new Random().nextInt(6));
        onaccountCarteInfo.setMemberInfo(memberInfo);
        onaccountCarteInfo.setOciDishNums(2);
        onaccountCarteInfo.setOciAmountPeoplo(10);
        onaccountCarteInfo.setOciRepastTime(new Date());
        onaccountCarteInfo.setOciConsumeAmount(new BigDecimal(100));
        onaccountCarteInfo.setOciDiscount(new BigDecimal(10));
        onaccountCarteInfo.setOciPaidAmount(new BigDecimal(100));
        onaccountCarteInfo.setDelFlag((byte) 1);
        User user = new User();
        user.setUserId(new Random().nextInt(6));
        onaccountCarteInfo.setUser(user);
        onaccountCarteInfoMapper.updateByPrimaryKey(onaccountCarteInfo);
    }

    @Test
    public void updateOCIByExampleSelective() {
        OnAccountCarteInfo onaccountCarteInfo = new OnAccountCarteInfo();
        EmployeeInfo ociWaiter = new EmployeeInfo();
        ociWaiter.setEmployeeId(new Random().nextInt(6));
        onaccountCarteInfo.setOciWaiter(ociWaiter);
        User user = new User();
        user.setUserId(new Random().nextInt(6));
        onaccountCarteInfo.setUser(user);
        onaccountCarteInfo.setOciState((byte) 2);
        OnAccountCarteInfoExample onaccountCarteInfoExample = new OnAccountCarteInfoExample();
        OnAccountCarteInfoExample.Criteria criteria = onaccountCarteInfoExample.createCriteria();
        criteria.andOciWaiterIdBetween(1, 3);
        criteria.andOciIdBetween(1, 4);
        onaccountCarteInfoMapper.updateByExampleSelective(onaccountCarteInfo, onaccountCarteInfoExample);
    }


    @Test
    public void updateOCIByExample() {
        OnAccountCarteInfo onaccountCarteInfo = new OnAccountCarteInfo();
        onaccountCarteInfo.setOciId(1);
        onaccountCarteInfo.setOciSwiftNumber(df.format(new Date()) + EnoughNumber.lpad(3, 999));
        onaccountCarteInfo.setOciState((byte) 1);
        DinningTable dinningTable = new DinningTable();
        dinningTable.setTableId(new Random().nextInt(6));
        onaccountCarteInfo.setDinningTable(dinningTable);
        EmployeeInfo ociWaiter = new EmployeeInfo();
        ociWaiter.setEmployeeId(new Random().nextInt(6));
        onaccountCarteInfo.setOciWaiter(ociWaiter);
        EmployeeInfo ociCashier = new EmployeeInfo();
        ociCashier.setEmployeeId(new Random().nextInt(6));
        onaccountCarteInfo.setOciCashier(ociCashier);
        Customer customer = new Customer();
        customer.setCustomerId(new Random().nextInt(6));
        onaccountCarteInfo.setCustomer(customer);
        MemberInfo memberInfo = new MemberInfo();
        memberInfo.setMemId(new Random().nextInt(6));
        onaccountCarteInfo.setMemberInfo(memberInfo);
        onaccountCarteInfo.setOciDishNums(2);
        onaccountCarteInfo.setOciAmountPeoplo(10);
        onaccountCarteInfo.setOciRepastTime(new Date());
        onaccountCarteInfo.setOciConsumeAmount(new BigDecimal(100));
        onaccountCarteInfo.setOciDiscount(new BigDecimal(10));
        onaccountCarteInfo.setOciPaidAmount(new BigDecimal(100));
        onaccountCarteInfo.setDelFlag((byte) 1);
        User user = new User();
        user.setUserId(new Random().nextInt(6));
        onaccountCarteInfo.setUser(user);
        OnAccountCarteInfoExample onaccountCarteInfoExample = new OnAccountCarteInfoExample();
        OnAccountCarteInfoExample.Criteria criteria = onaccountCarteInfoExample.createCriteria();
        criteria.andOciIdEqualTo(1);
        onaccountCarteInfoMapper.updateByExample(onaccountCarteInfo, onaccountCarteInfoExample);
    }


    @Test
    public void updateOCCByPrimarySelective() {
        OnAccountCarteContent onaccountCarteContent = new OnAccountCarteContent();
        onaccountCarteContent.setOccId(1);
        Dish dish = new Dish();
        dish.setDishId(1);
        onaccountCarteContent.setDish(dish);
        onaccountCarteContentMapper.updateByPrimaryKeySelective(onaccountCarteContent);
    }

    @Test
    public void updateOCCByPrimary() {
        OnAccountCarteContent onaccountCarteContent = new OnAccountCarteContent();
        onaccountCarteContent.setOccId(1);
        OnAccountCarteInfo onaccountCarteInfo = new OnAccountCarteInfo();
        onaccountCarteInfo.setOciId(200);
        onaccountCarteContent.setOnAccountCarteInfo(onaccountCarteInfo);
        Dish dish = dishMapper.selectByPrimaryKey(new Random().nextInt(700) + 1);
        onaccountCarteContent.setDish(dish);
        onaccountCarteContent.setOccDishNum(1);
        onaccountCarteContent.setOccTotalPrice(dish.getDishPrice());
        onaccountCarteContent.setOccSpecilDesc("updateOCCByPrimary");
        onaccountCarteContent.setDelFlag((byte) 1);
        User user = new User();
        user.setUserId(1);
        onaccountCarteContent.setUser(user);
        onaccountCarteContentMapper.updateByPrimaryKey(onaccountCarteContent);
    }

    @Test
    public void updateOCCByExampleSelective() {
        OnAccountCarteContent onaccountCarteContent = new OnAccountCarteContent();
        Dish dish = new Dish();
        dish.setDishId(1);
        onaccountCarteContent.setDish(dish);
        OnAccountCarteContentExample onaccountCarteContentExample = new OnAccountCarteContentExample();
        OnAccountCarteContentExample.Criteria criteria = onaccountCarteContentExample.createCriteria();
        criteria.andOccSpecilDescEqualTo("updateOCCByPrimary");
        criteria.andOccOciIdEqualTo(200);
        onaccountCarteContentMapper.updateByExampleSelective(onaccountCarteContent, onaccountCarteContentExample);
    }


    @Test
    public void updateOCCByExample() {
        OnAccountCarteContent onaccountCarteContent = new OnAccountCarteContent();
        onaccountCarteContent.setOccId(1681);
        OnAccountCarteInfo onaccountCarteInfo = new OnAccountCarteInfo();
        onaccountCarteInfo.setOciId(200);
        onaccountCarteContent.setOnAccountCarteInfo(onaccountCarteInfo);
        Dish dish = dishMapper.selectByPrimaryKey(new Random().nextInt(700) + 1);
        onaccountCarteContent.setDish(dish);
        onaccountCarteContent.setOccDishNum(1);
        onaccountCarteContent.setOccTotalPrice(dish.getDishPrice());
        onaccountCarteContent.setOccSpecilDesc("updateOCCByExample");
        onaccountCarteContent.setDelFlag((byte) 1);
        User user = new User();
        user.setUserId(1);
        onaccountCarteContent.setUser(user);
        OnAccountCarteContentExample onaccountCarteContentExample = new OnAccountCarteContentExample();
        OnAccountCarteContentExample.Criteria criteria = onaccountCarteContentExample.createCriteria();
        criteria.andOccSpecilDescEqualTo("updateOCCByPrimary");
        onaccountCarteContentMapper.updateByExample(onaccountCarteContent, onaccountCarteContentExample);
    }

}
