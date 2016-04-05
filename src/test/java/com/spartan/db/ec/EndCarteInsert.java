package com.spartan.db.ec;

import com.spartan.dao.EndCarteContentMapper;
import com.spartan.model.EndCarteInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description: .
 * @Date 2016/4/5 18:21
 */

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class EndCarteInsert {
    @Resource
    private EndCarteContentMapper endCarteContentMapper;

    @Test
    public void insertSelectiveBatch() {
        for (int i = 0; i < 5; i++) {
            EndCarteInfo endCarteInfo = new EndCarteInfo();


        }
    }

}
