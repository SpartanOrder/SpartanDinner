package com.spartan.db.tc;

import com.spartan.dao.TempCarteContentMapper;
import com.spartan.dao.TempCarteInfoMapper;
import com.spartan.model.TempCarteContentExample;
import com.spartan.model.TempCarteInfoExample;
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
public class TempCarteDelete {
    @Resource
    private TempCarteContentMapper tempCarteContentMapper;
    @Resource
    private TempCarteInfoMapper tempCarteInfoMapper;

    @Test
    public void deleteTCCByPrimary() {
        tempCarteContentMapper.deleteByPrimaryKey(199);

    }

    @Test
    public void deleteTCCByExample() {
        TempCarteContentExample tempCarteContentExample = new TempCarteContentExample();
        TempCarteContentExample.Criteria criteria = tempCarteContentExample.createCriteria();
        criteria.andTccIdEqualTo(200);
        criteria.andSubbyIsNotNull();
        tempCarteContentMapper.deleteByExample(tempCarteContentExample);
    }

    @Test
    public void deleteTCIByPrimary() {
        tempCarteInfoMapper.deleteByPrimaryKey(1);

    }

    @Test
    public void deleteTCIByExample() {
        TempCarteInfoExample tempCarteInfoExample = new TempCarteInfoExample();
        TempCarteInfoExample.Criteria criteria = tempCarteInfoExample.createCriteria();
        criteria.andTciIdEqualTo(2);
        criteria.andSubbyIsNotNull();
        tempCarteInfoMapper.deleteByExample(tempCarteInfoExample);
    }

}
