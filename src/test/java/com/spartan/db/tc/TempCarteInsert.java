package com.spartan.db.tc;

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
public class TempCarteInsert {
    @Resource
    private EndCarteInfoMapper endCarteInfoMapper;
    @Resource
    private EndCarteContentMapper endCarteContentMapper;
    @Resource
    private DishMapper dishMapper;
    SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd-hh-mm-ss");

    @Test
    public void insertECISelectiveBatch() {
        for (int i = 1; i <= 100; i++) {
            EndCarteInfo endCarteInfo = new EndCarteInfo();
            endCarteInfo.setEciId(i);
            endCarteInfo.setEciSwiftNumber(df.format(new Date()) + EnoughNumber.lpad(3, i));
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
            endCarteInfo.setEciDishNums(countECCForECI(i));
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
            endCarteInfoMapper.insertSelective(endCarteInfo);
        }
    }

    @Test
    public void insertECIBatch() {
        for (int i = 1; i <= 100; i++) {
            EndCarteInfo endCarteInfo = new EndCarteInfo();
            endCarteInfo.setEciId(100 + i);
            System.out.println(df.format(new Date()) + EnoughNumber.lpad(3, i));
            endCarteInfo.setEciSwiftNumber(df.format(new Date()) + EnoughNumber.lpad(3, i));
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
            endCarteInfo.setEciDishNums(countECCForECI(i));
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
            endCarteInfoMapper.insert(endCarteInfo);
        }
    }

    public int countECCForECI(int i) {
        EndCarteContentExample carteContentExample = new EndCarteContentExample();
        EndCarteContentExample.Criteria criteria = carteContentExample.createCriteria();
        criteria.andEccEciIdEqualTo(i);
        return endCarteContentMapper.countByExample(carteContentExample);
    }

    @Test
    public void insertECCSelectiveBatch() {
        for (int i = 1; i <= 100; i++) {
            EndCarteInfo endCarteInfo = new EndCarteInfo();
            int rand = new Random().nextInt(5) + 1;
            for (int j = 1; j <= rand; j++) {
                EndCarteContent endCarteContent = new EndCarteContent();
                endCarteInfo.setEciId(i);
                endCarteContent.setEndCarteInfo(endCarteInfo);
                Dish dish = dishMapper.selectByPrimaryKey(new Random().nextInt(700) + 1);
                endCarteContent.setDish(dish);
                endCarteContent.setEccDishNum(1);
                endCarteContent.setEccTotalPrice(dish.getDishPrice());
                endCarteContent.setEccSpecilDesc(EnoughNumber.lpad(3, i) + EnoughNumber.lpad(3, j));
                endCarteContent.setDelFlag((byte) 1);
                User user = new User();
                user.setUserId(1);
                endCarteContent.setUser(user);
                endCarteContentMapper.insertSelective(endCarteContent);
            }
        }
    }

    @Test
    public void insertECCBatch() {
        for (int i = 1; i <= 100; i++) {
            int rand = new Random().nextInt(6);
            for (int j = 1; j < rand; j++) {
                EndCarteContent endCarteContent = new EndCarteContent();
                EndCarteInfo endCarteInfo = new EndCarteInfo();
                endCarteInfo.setEciId(100 + i);
                endCarteContent.setEndCarteInfo(endCarteInfo);
                Dish dish = dishMapper.selectByPrimaryKey(new Random().nextInt(700) + 1);
                endCarteContent.setDish(dish);
                endCarteContent.setEccDishNum(1);
                endCarteContent.setEccTotalPrice(dish.getDishPrice());
                endCarteContent.setEccSpecilDesc(EnoughNumber.lpad(3, i) + EnoughNumber.lpad(3, j));
                endCarteContent.setDelFlag((byte) 1);
                User user = new User();
                user.setUserId(1);
                endCarteContent.setUser(user);
                endCarteContentMapper.insertSelective(endCarteContent);
            }
        }
    }
}
