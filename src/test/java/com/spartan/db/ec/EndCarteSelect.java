package com.spartan.db.ec;

import com.spartan.dao.EndCarteContentMapper;
import com.spartan.dao.EndCarteInfoMapper;
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
public class EndCarteSelect {
    @Resource
    private EndCarteContentMapper endCarteContentMapper;
    @Resource
    private EndCarteInfoMapper endCarteInfoMapper;

    @Test
    public void selectByPrimary() {
        EndCarteInfo endCarteInfo = endCarteInfoMapper.selectByPrimaryKey(1);
        System.out.println(endCarteInfo.toString());
    }

}
