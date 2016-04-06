package com.spartan.db.ec;

import com.spartan.dao.EndCarteContentMapper;
import com.spartan.model.*;
import com.spartan.util.EnoughNumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;

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
    SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd-hh-mm-ss");

    @Test
    public void insertECISelectiveBatch() {
        for (int i = 0; i < 100; i++) {
            EndCarteInfo endCarteInfo = new EndCarteInfo();
            endCarteInfo.setEciSwiftNumber(df.format(new Date()) + EnoughNumber.lpad(3, i));
            endCarteInfo.setEciState((byte) 1);
            DinningTable dinningTable = new DinningTable();
            dinningTable.setTableId(1);
            endCarteInfo.setDinningTable(dinningTable);
            EmployeeInfo eciWaiter = new EmployeeInfo();
            eciWaiter.setEmployeeId(1);
            endCarteInfo.setEciWaiter(eciWaiter);
            EmployeeInfo eciCashier = new EmployeeInfo();
            eciCashier.setEmployeeId(1);
            endCarteInfo.setEciCashier(eciCashier);
            Customer customer = new Customer();
            customer.setCustomerId(1);
            endCarteInfo.setCustomer(customer);
            MemberInfo memberInfo = new MemberInfo();
            memberInfo.setMemId(1);
            endCarteInfo.setMemberInfo(memberInfo);
            User user = new User();
            user.setUserId(1);
            endCarteInfo.setUser(user);
        }
    }

}
