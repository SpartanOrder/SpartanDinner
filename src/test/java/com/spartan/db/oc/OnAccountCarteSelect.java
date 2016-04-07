package com.spartan.db.oc;

import com.alibaba.fastjson.JSONObject;
import com.spartan.dao.OnAccountCarteContentMapper;
import com.spartan.dao.OnAccountCarteInfoMapper;
import com.spartan.model.OnAccountCarteContent;
import com.spartan.model.OnAccountCarteContentExample;
import com.spartan.model.OnAccountCarteInfo;
import com.spartan.model.OnAccountCarteInfoExample;
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
public class OnAccountCarteSelect {
    @Resource
    private OnAccountCarteContentMapper onaccountCarteContentMapper;
    @Resource
    private OnAccountCarteInfoMapper onaccountCarteInfoMapper;

    @Test
    public void selectOCIByPrimary() {
        OnAccountCarteInfo onaccountCarteInfo = onaccountCarteInfoMapper.selectByPrimaryKey(3);
        System.out.println(JSONObject.toJSON(onaccountCarteInfo).toString());
    }

    @Test
    public void selectOCCByPrimary() {
        OnAccountCarteContent onaccountCarteContent = onaccountCarteContentMapper.selectByPrimaryKey(1256);
        System.out.println(JSONObject.toJSON(onaccountCarteContent).toString());
    }

    @Test
    public void selectOCIByExample() {
        OnAccountCarteInfoExample onaccountCarteInfoExample = new OnAccountCarteInfoExample();
        OnAccountCarteInfoExample.Criteria criteria = onaccountCarteInfoExample.createCriteria();
        criteria.andOciDishNumsGreaterThan(2);
        criteria.andSubbyIsNotNull();
        criteria.andOciRemarkIsNull();
        List<OnAccountCarteInfo> list = onaccountCarteInfoMapper.selectByExample(onaccountCarteInfoExample);
        for (OnAccountCarteInfo onaccountCarteInfo : list) {
            System.out.println(onaccountCarteInfo.toString());
            System.out.println(JSONObject.toJSON(onaccountCarteInfo));
        }
    }

    @Test
    public void selectOCCByExample() {
        OnAccountCarteContentExample onaccountCarteContentExample = new OnAccountCarteContentExample();
        OnAccountCarteContentExample.Criteria criteria = onaccountCarteContentExample.createCriteria();
        criteria.andDelFlagIsNotNull();
        criteria.andSubbyIsNotNull();
        List<OnAccountCarteContent> list = onaccountCarteContentMapper.selectByExample(onaccountCarteContentExample);
        for (OnAccountCarteContent onaccountCarteContent : list) {
            System.out.println(onaccountCarteContent.toString());
            System.out.println(JSONObject.toJSON(onaccountCarteContent));
        }
    }

    @Test
    public void countOCCByExample() {
        OnAccountCarteContentExample onaccountCarteContentExample = new OnAccountCarteContentExample();
        OnAccountCarteContentExample.Criteria criteria = onaccountCarteContentExample.createCriteria();
        criteria.andDelFlagIsNotNull();
        criteria.andSubbyIsNotNull();
        System.out.println(onaccountCarteContentMapper.countByExample(onaccountCarteContentExample));
    }

    @Test
    public void countOCIByExample() {
        OnAccountCarteInfoExample onaccountCarteInfoExample = new OnAccountCarteInfoExample();
        OnAccountCarteInfoExample.Criteria criteria = onaccountCarteInfoExample.createCriteria();
        criteria.andDelFlagIsNotNull();
        criteria.andSubbyIsNotNull();
        System.out.println(onaccountCarteInfoMapper.countByExample(onaccountCarteInfoExample));
    }
}
