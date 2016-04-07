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
public class OnAccountCarteInsert {
    @Resource
    private OnAccountCarteInfoMapper onaccountCarteInfoMapper;
    @Resource
    private OnAccountCarteContentMapper onaccountCarteContentMapper;
    @Resource
    private DishMapper dishMapper;
    SimpleDateFormat df = new SimpleDateFormat("yy-MM-dd-hh-mm-ss");

    @Test
    public void insertOCISelectiveBatch() {
        for (int i = 1; i <= 100; i++) {
            OnAccountCarteInfo onaccountCarteInfo = new OnAccountCarteInfo();
            onaccountCarteInfo.setOciId(i);
            onaccountCarteInfo.setOciSwiftNumber(df.format(new Date()) + EnoughNumber.lpad(3, i));
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
            onaccountCarteInfo.setOciDishNums(countOCCForOCI(i));
            onaccountCarteInfo.setOciAmountPeoplo(10);
            onaccountCarteInfo.setOciRepastTime(new Date());
            onaccountCarteInfo.setOciConsumeAmount(new BigDecimal(100));
            onaccountCarteInfo.setOciDiscount(new BigDecimal(10));
            onaccountCarteInfo.setOciPaidAmount(new BigDecimal(100));
            onaccountCarteInfo.setDelFlag((byte) 1);
            User user = new User();
            user.setUserId(new Random().nextInt(6));
            onaccountCarteInfo.setUser(user);
            onaccountCarteInfoMapper.insertSelective(onaccountCarteInfo);
        }
    }

    @Test
    public void insertOCIBatch() {
        for (int i = 1; i <= 100; i++) {
            OnAccountCarteInfo onaccountCarteInfo = new OnAccountCarteInfo();
            onaccountCarteInfo.setOciId(100 + i);
            System.out.println(df.format(new Date()) + EnoughNumber.lpad(3, i));
            onaccountCarteInfo.setOciSwiftNumber(df.format(new Date()) + EnoughNumber.lpad(3, i));
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
            onaccountCarteInfo.setOciDishNums(countOCCForOCI(i));
            onaccountCarteInfo.setOciAmountPeoplo(10);
            onaccountCarteInfo.setOciRepastTime(new Date());
            onaccountCarteInfo.setOciConsumeAmount(new BigDecimal(100));
            onaccountCarteInfo.setOciDiscount(new BigDecimal(10));
            onaccountCarteInfo.setOciPaidAmount(new BigDecimal(100));
            onaccountCarteInfo.setDelFlag((byte) 1);
            User user = new User();
            user.setUserId(new Random().nextInt(6));
            onaccountCarteInfo.setUser(user);
            onaccountCarteInfoMapper.insert(onaccountCarteInfo);
        }
    }

    public int countOCCForOCI(int i) {
        OnAccountCarteContentExample carteContentExample = new OnAccountCarteContentExample();
        OnAccountCarteContentExample.Criteria criteria = carteContentExample.createCriteria();
        criteria.andOccOciIdEqualTo(i);
        return onaccountCarteContentMapper.countByExample(carteContentExample);
    }

    @Test
    public void insertOCCSelectiveBatch() {
        for (int i = 1; i <= 100; i++) {
            OnAccountCarteInfo onaccountCarteInfo = new OnAccountCarteInfo();
            int rand = new Random().nextInt(5) + 1;
            for (int j = 1; j <= rand; j++) {
                OnAccountCarteContent onaccountCarteContent = new OnAccountCarteContent();
                onaccountCarteInfo.setOciId(i);
                onaccountCarteContent.setOnAccountCarteInfo(onaccountCarteInfo);
                Dish dish = dishMapper.selectByPrimaryKey(new Random().nextInt(700) + 1);
                onaccountCarteContent.setDish(dish);
                onaccountCarteContent.setOccDishNum(1);
                onaccountCarteContent.setOccTotalPrice(dish.getDishPrice());
                onaccountCarteContent.setOccSpecilDesc("OCCSelectiveBatch");
                onaccountCarteContent.setDelFlag((byte) 1);
                User user = new User();
                user.setUserId(1);
                onaccountCarteContent.setUser(user);
                onaccountCarteContentMapper.insertSelective(onaccountCarteContent);
            }
        }
    }

    @Test
    public void insertOCCBatch() {
        for (int i = 1; i <= 100; i++) {
            int rand = new Random().nextInt(6);
            for (int j = 1; j < rand; j++) {
                OnAccountCarteContent onaccountCarteContent = new OnAccountCarteContent();
                OnAccountCarteInfo onaccountCarteInfo = new OnAccountCarteInfo();
                onaccountCarteInfo.setOciId(100 + i);
                onaccountCarteContent.setOnAccountCarteInfo(onaccountCarteInfo);
                Dish dish = dishMapper.selectByPrimaryKey(new Random().nextInt(700) + 1);
                onaccountCarteContent.setDish(dish);
                onaccountCarteContent.setOccDishNum(1);
                onaccountCarteContent.setOccTotalPrice(dish.getDishPrice());
                onaccountCarteContent.setOccSpecilDesc("OCCSelectiveBatch");
                onaccountCarteContent.setDelFlag((byte) 1);
                User user = new User();
                user.setUserId(1);
                onaccountCarteContent.setUser(user);
                onaccountCarteContentMapper.insertSelective(onaccountCarteContent);
            }
        }
    }
}
