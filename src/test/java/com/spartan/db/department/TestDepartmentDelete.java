package com.spartan.db.department;

import com.spartan.dao.DepartmentMapper;
import com.spartan.model.DepartmentExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TestDepartmentDelete {
    @Resource
    private DepartmentMapper departmentMapper;

    @Test
    public void testDeleteByPrimaryKey() {
        departmentMapper.deleteByPrimaryKey(1);
    }

    @Test
    public void testDeleteByExample() {
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        criteria.andDepartmentNameBetween("部门4", "部门8");
        criteria.andSubbyEqualTo(1);
        System.out.println(departmentMapper.deleteByExample(departmentExample));
    }
}
