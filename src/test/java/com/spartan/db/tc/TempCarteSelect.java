package com.spartan.db.tc;

import com.alibaba.fastjson.JSONObject;
import com.spartan.dao.TempCarteContentMapper;
import com.spartan.dao.TempCarteInfoMapper;
import com.spartan.model.TempCarteContent;
import com.spartan.model.TempCarteContentExample;
import com.spartan.model.TempCarteInfo;
import com.spartan.model.TempCarteInfoExample;
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
    private TempCarteContentMapper tempCarteContentMapper;
    @Resource
    private TempCarteInfoMapper tempCarteInfoMapper;

    @Test
    public void selectTCIByPrimary() {
        TempCarteInfo tempCarteInfo = tempCarteInfoMapper.selectByPrimaryKey(3);
        System.out.println(JSONObject.toJSON(tempCarteInfo).toString());
    }

    @Test
    public void selectTCCByPrimary() {
        TempCarteContent tempCarteContent = tempCarteContentMapper.selectByPrimaryKey(2);
        System.out.println(JSONObject.toJSON(tempCarteContent).toString());
    }

    @Test
    public void selectTCIByExample() {
        TempCarteInfoExample tempCarteInfoExample = new TempCarteInfoExample();
        TempCarteInfoExample.Criteria criteria = tempCarteInfoExample.createCriteria();
        criteria.andTciDishNumsGreaterThan(2);
        criteria.andSubbyIsNotNull();
        criteria.andTciRemarkIsNull();
        List<TempCarteInfo> list = tempCarteInfoMapper.selectByExample(tempCarteInfoExample);
        for (TempCarteInfo tempCarteInfo : list) {
            System.out.println(tempCarteInfo.toString());
            System.out.println(JSONObject.toJSON(tempCarteInfo));
        }
    }

    @Test
    public void selectTCCByExample() {
        TempCarteContentExample tempCarteContentExample = new TempCarteContentExample();
        TempCarteContentExample.Criteria criteria = tempCarteContentExample.createCriteria();
        criteria.andDelFlagIsNotNull();
        criteria.andSubbyIsNotNull();
        List<TempCarteContent> list = tempCarteContentMapper.selectByExample(tempCarteContentExample);
        for (TempCarteContent tempCarteContent : list) {
            System.out.println(tempCarteContent.toString());
            System.out.println(JSONObject.toJSON(tempCarteContent));
        }
    }

    @Test
    public void countTCCByExample() {
        TempCarteContentExample tempCarteContentExample = new TempCarteContentExample();
        TempCarteContentExample.Criteria criteria = tempCarteContentExample.createCriteria();
        criteria.andDelFlagIsNotNull();
        criteria.andSubbyIsNotNull();
        System.out.println(tempCarteContentMapper.countByExample(tempCarteContentExample));
    }

    @Test
    public void countTCIByExample() {
        TempCarteInfoExample tempCarteInfoExample = new TempCarteInfoExample();
        TempCarteInfoExample.Criteria criteria = tempCarteInfoExample.createCriteria();
        criteria.andDelFlagIsNotNull();
        criteria.andSubbyIsNotNull();
        System.out.println(tempCarteInfoMapper.countByExample(tempCarteInfoExample));
    }
}
