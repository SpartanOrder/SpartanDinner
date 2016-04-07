package com.spartan.db.oc;

import com.spartan.dao.OnAccountCarteContentMapper;
import com.spartan.dao.OnAccountCarteInfoMapper;
import com.spartan.model.OnAccountCarteContentExample;
import com.spartan.model.OnAccountCarteInfoExample;
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
public class OnAccountCarteDelete {
    @Resource
    private OnAccountCarteContentMapper onaccountCarteContentMapper;
    @Resource
    private OnAccountCarteInfoMapper onaccountCarteInfoMapper;

    @Test
    public void deleteOCCByPrimary() {
        onaccountCarteContentMapper.deleteByPrimaryKey(1389);

    }

    @Test
    public void deleteOCCByExample() {
        OnAccountCarteContentExample onaccountCarteContentExample = new OnAccountCarteContentExample();
        OnAccountCarteContentExample.Criteria criteria = onaccountCarteContentExample.createCriteria();
        criteria.andOccIdEqualTo(1390);
        criteria.andSubbyIsNotNull();
        onaccountCarteContentMapper.deleteByExample(onaccountCarteContentExample);
    }

    @Test
    public void deleteOCIByPrimary() {
        onaccountCarteInfoMapper.deleteByPrimaryKey(1);

    }

    @Test
    public void deleteOCIByExample() {
        OnAccountCarteInfoExample onaccountCarteInfoExample = new OnAccountCarteInfoExample();
        OnAccountCarteInfoExample.Criteria criteria = onaccountCarteInfoExample.createCriteria();
        criteria.andOciIdEqualTo(2);
        criteria.andSubbyIsNotNull();
        onaccountCarteInfoMapper.deleteByExample(onaccountCarteInfoExample);
    }

}
