package com.spartan.db.department;

import com.spartan.dao.DepartmentMapper;
import com.spartan.model.Department;
import com.spartan.model.DepartmentExample;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TestDepartmentSelect {
    @Resource
    private DepartmentMapper departmentMapper;

    @Test
    public void testSelectByPrimaryKey() {
        Department department = departmentMapper.selectByPrimaryKey(1);
        System.out.println(department.toString());
    }

    @Test
    public void testSelectByExample() {
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        criteria.andSubbyIsNotNull();
        criteria.andDepartmentNameLike("%部门%");
        criteria.andDelFlagEqualTo((byte) 0);
        List<Department> list = departmentMapper.selectByExample(departmentExample);
        for (Department department : list) {
            System.out.println(department.toString());
        }
    }

    @Test
    public void testCountByExample() {
        DepartmentExample departmentExample = new DepartmentExample();
        DepartmentExample.Criteria criteria = departmentExample.createCriteria();
        criteria.andSubbyBetween(1, 1000);
        int size = departmentMapper.countByExample(departmentExample);
        System.out.println(size);
    }
}
