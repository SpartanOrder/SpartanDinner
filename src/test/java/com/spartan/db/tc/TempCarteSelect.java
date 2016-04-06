package com.spartan.db.tc;

import com.alibaba.fastjson.JSONObject;
import com.spartan.dao.EndCarteContentMapper;
import com.spartan.dao.EndCarteInfoMapper;
import com.spartan.model.EndCarteContent;
import com.spartan.model.EndCarteContentExample;
import com.spartan.model.EndCarteInfo;
import com.spartan.model.EndCarteInfoExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description: .
 * @Date 2016/4/5 18:21
 */

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TempCarteSelect {
    @Resource
    private EndCarteContentMapper endCarteContentMapper;
    @Resource
    private EndCarteInfoMapper endCarteInfoMapper;

    @Test
    public void selectECIByPrimary() {
        EndCarteInfo endCarteInfo = endCarteInfoMapper.selectByPrimaryKey(3);
        System.out.println(JSONObject.toJSON(endCarteInfo).toString());
    }

    @Test
    public void selectECCByPrimary() {
        EndCarteContent endCarteContent = endCarteContentMapper.selectByPrimaryKey(1256);
        System.out.println(JSONObject.toJSON(endCarteContent).toString());
    }

    @Test
    public void selectECIByExample() {
        EndCarteInfoExample endCarteInfoExample = new EndCarteInfoExample();
        EndCarteInfoExample.Criteria criteria = endCarteInfoExample.createCriteria();
        criteria.andEciDishNumsGreaterThan(2);
        criteria.andSubbyIsNotNull();
        criteria.andEciRemarkIsNull();
        List<EndCarteInfo> list = endCarteInfoMapper.selectByExample(endCarteInfoExample);
        for (EndCarteInfo endCarteInfo : list) {
            System.out.println(endCarteInfo.toString());
            System.out.println(JSONObject.toJSON(endCarteInfo));
        }
    }

    @Test
    public void selectECCByExample() {
        EndCarteContentExample endCarteContentExample = new EndCarteContentExample();
        EndCarteContentExample.Criteria criteria = endCarteContentExample.createCriteria();
        criteria.andDelFlagIsNotNull();
        criteria.andSubbyIsNotNull();
        List<EndCarteContent> list = endCarteContentMapper.selectByExample(endCarteContentExample);
        for (EndCarteContent endCarteContent : list) {
            System.out.println(endCarteContent.toString());
            System.out.println(JSONObject.toJSON(endCarteContent));
        }
    }

    @Test
    public void countECCByExample() {
        EndCarteContentExample endCarteContentExample = new EndCarteContentExample();
        EndCarteContentExample.Criteria criteria = endCarteContentExample.createCriteria();
        criteria.andDelFlagIsNotNull();
        criteria.andSubbyIsNotNull();
        System.out.println(endCarteContentMapper.countByExample(endCarteContentExample));
    }

    @Test
    public void countECIByExample() {
        EndCarteInfoExample endCarteInfoExample = new EndCarteInfoExample();
        EndCarteInfoExample.Criteria criteria = endCarteInfoExample.createCriteria();
        criteria.andDelFlagIsNotNull();
        criteria.andSubbyIsNotNull();
        System.out.println(endCarteInfoMapper.countByExample(endCarteInfoExample));
    }
}
