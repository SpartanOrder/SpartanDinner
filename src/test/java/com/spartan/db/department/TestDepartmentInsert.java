package com.spartan.db.department;

import com.spartan.dao.DepartmentMapper;
import com.spartan.model.Department;
import com.spartan.model.User;
import com.spartan.util.EnoughNumber;
import com.spartan.util.UserUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)     //表示继承了SpringJUnit4ClassRunner类
@ContextConfiguration(locations = {"classpath:ApplicationContext.xml", "classpath:spring-mybatis.xml"})
public class TestDepartmentInsert {
    @Resource
    private DepartmentMapper departmentMapper;

    @Test
    public void testInsertSelectiveBatch() {
        for (int i = 1; i <= 10; i++) {
            Department department = new Department();
            department.setDepartmentName("部门" + i);
            department.setDescription("部门描述" + i);
            department.setRemark("部门备注" + i);
            department.setDelFlag((byte) 0);
            department.setUser(UserUtil.user);
            departmentMapper.insertSelective(department);
        }
    }

    @Test
    public void testInsertBatch() {
        for (int i = 1; i <= 10; i++) {
            Department department = new Department();
            department.setDepartmentName("部门" + i);
            department.setDescription("部门描述" + i);
            department.setRemark("部门备注" + i);
            //            department.setDelFlag((byte) 0);
            //            department.setUser(UserUtil.user);
            departmentMapper.insertSelective(department);
        }
    }

}
