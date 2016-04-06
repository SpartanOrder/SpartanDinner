package com.spartan.db.tc;

import com.spartan.dao.EndCarteContentMapper;
import com.spartan.dao.EndCarteInfoMapper;
import com.spartan.model.EndCarteContentExample;
import com.spartan.model.EndCarteInfoExample;
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
    private EndCarteContentMapper endCarteContentMapper;
    @Resource
    private EndCarteInfoMapper endCarteInfoMapper;

    @Test
    public void deleteECCByPrimary() {
        endCarteContentMapper.deleteByPrimaryKey(1389);

    }

    @Test
    public void deleteECCByExample() {
        EndCarteContentExample endCarteContentExample = new EndCarteContentExample();
        EndCarteContentExample.Criteria criteria = endCarteContentExample.createCriteria();
        criteria.andEccIdEqualTo(1390);
        criteria.andSubbyIsNotNull();
        endCarteContentMapper.deleteByExample(endCarteContentExample);
    }

    @Test
    public void deleteECIByPrimary() {
        endCarteInfoMapper.deleteByPrimaryKey(1);

    }

    @Test
    public void deleteECIByExample() {
        EndCarteInfoExample endCarteInfoExample = new EndCarteInfoExample();
        EndCarteInfoExample.Criteria criteria = endCarteInfoExample.createCriteria();
        criteria.andEciIdEqualTo(2);
        criteria.andSubbyIsNotNull();
        endCarteInfoMapper.deleteByExample(endCarteInfoExample);
    }

}
