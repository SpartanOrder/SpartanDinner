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
public class TempCarteInsert {
    @Resource
    private TempCarteInfoMapper tempCarteInfoMapper;
    @Resource
    private TempCarteContentMapper tempCarteContentMapper;
    @Resource
    private DishMapper dishMapper;
    SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd-hh-mm-ss");

    @Test
    public void insertTCISelectiveBatch() {
        for (int i = 1; i <= 100; i++) {
            TempCarteInfo tempCarteInfo = new TempCarteInfo();
            tempCarteInfo.setTciId(i);
            tempCarteInfo.setTciSwiftNumber(df.format(new Date()) + EnoughNumber.lpad(3, i));
            tempCarteInfo.setTciState((byte) 1);
            DinningTable dinningTable = new DinningTable();
            dinningTable.setTableId(new Random().nextInt(6));
            tempCarteInfo.setDinningTable(dinningTable);
            EmployeeInfo eciWaiter = new EmployeeInfo();
            eciWaiter.setEmployeeId(new Random().nextInt(6));
            tempCarteInfo.setTciWaiter(eciWaiter);
            Customer customer = new Customer();
            customer.setCustomerId(new Random().nextInt(6));
            tempCarteInfo.setCustomer(customer);
            MemberInfo memberInfo = new MemberInfo();
            memberInfo.setMemId(new Random().nextInt(6));
            tempCarteInfo.setMemberInfo(memberInfo);
            tempCarteInfo.setTciDishNums(countTCCForTCI(i));
            tempCarteInfo.setTciAmountPeoplo(10);
            tempCarteInfo.setTciRepastTime(new Date());
            tempCarteInfo.setTciConsumeAmount(new BigDecimal(100));
            tempCarteInfo.setTciCostAmount(new BigDecimal(100));
            tempCarteInfo.setTciDiscount(new BigDecimal(10));
            tempCarteInfo.setDelFlag((byte) 1);
            User user = new User();
            user.setUserId(new Random().nextInt(6));
            tempCarteInfo.setUser(user);
            tempCarteInfoMapper.insertSelective(tempCarteInfo);
        }
    }

    @Test
    public void insertTCIBatch() {
        for (int i = 1; i <= 100; i++) {
            TempCarteInfo tempCarteInfo = new TempCarteInfo();
            tempCarteInfo.setTciId(100 + i);
            System.out.println(df.format(new Date()) + EnoughNumber.lpad(3, i));
            tempCarteInfo.setTciSwiftNumber(df.format(new Date()) + EnoughNumber.lpad(3, i));
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
            tempCarteInfo.setTciDishNums(countTCCForTCI(i));
            tempCarteInfo.setTciAmountPeoplo(10);
            tempCarteInfo.setTciRepastTime(new Date());
            tempCarteInfo.setTciConsumeAmount(new BigDecimal(100));
            tempCarteInfo.setTciDiscount(new BigDecimal(10));
            tempCarteInfo.setTciCostAmount(new BigDecimal(100));
            tempCarteInfo.setDelFlag((byte) 1);
            User user = new User();
            user.setUserId(new Random().nextInt(6));
            tempCarteInfo.setUser(user);
            tempCarteInfoMapper.insert(tempCarteInfo);
        }
    }

    public int countTCCForTCI(int i) {
        TempCarteContentExample carteContentExample = new TempCarteContentExample();
        TempCarteContentExample.Criteria criteria = carteContentExample.createCriteria();
        criteria.andTccTciIdEqualTo(i);
        return tempCarteContentMapper.countByExample(carteContentExample);
    }

    @Test
    public void insertTCCSelectiveBatch() {
        for (int i = 1; i <= 100; i++) {
            TempCarteInfo tempCarteInfo = new TempCarteInfo();
            int rand = new Random().nextInt(10) + 1;
            for (int j = 1; j <= rand; j++) {
                TempCarteContent tempCarteContent = new TempCarteContent();
                tempCarteInfo.setTciId(i);
                tempCarteContent.setTempCarteInfo(tempCarteInfo);
                Dish dish = dishMapper.selectByPrimaryKey(new Random().nextInt(700) + 1);
                tempCarteContent.setDish(dish);
                tempCarteContent.setTccDishNum(1);
                tempCarteContent.setTccTotalPrice(dish.getDishPrice());
                tempCarteContent.setTccSpecilDesc(EnoughNumber.lpad(3, i) + EnoughNumber.lpad(3, j));
                tempCarteContent.setDelFlag((byte) 1);
                User user = new User();
                user.setUserId(1);
                tempCarteContent.setUser(user);
                tempCarteContentMapper.insertSelective(tempCarteContent);
            }
        }
    }

    @Test
    public void insertTCCBatch() {
        for (int i = 1; i <= 100; i++) {
            int rand = new Random().nextInt(6);
            for (int j = 1; j < rand; j++) {
                TempCarteContent tempCarteContent = new TempCarteContent();
                TempCarteInfo tempCarteInfo = new TempCarteInfo();
                tempCarteInfo.setTciId(100 + i);
                tempCarteContent.setTempCarteInfo(tempCarteInfo);
                Dish dish = dishMapper.selectByPrimaryKey(new Random().nextInt(700) + 1);
                tempCarteContent.setDish(dish);
                tempCarteContent.setTccDishNum(1);
                tempCarteContent.setTccTotalPrice(dish.getDishPrice());
                tempCarteContent.setTccSpecilDesc(EnoughNumber.lpad(3, i) + EnoughNumber.lpad(3, j));
                tempCarteContent.setDelFlag((byte) 1);
                User user = new User();
                user.setUserId(1);
                tempCarteContent.setUser(user);
                tempCarteContentMapper.insertSelective(tempCarteContent);
            }
        }
    }
}
