package com.spartan.dao;

import com.spartan.model.Dish;
import com.spartan.model.DishExample;
import org.apache.ibatis.annotations.Param;

import java.io.Serializable;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description:一个有关ExampleMapper的模板实际上无作用,作用是在sql语句后面添加附加条件.
 * @Date 2016/4/2 8:48
 */
public interface BaseExampleMapper<T, ID extends Serializable> {
    int countByExample(DishExample example);//按条件计数

    int deleteByExample(DishExample example);//按条件删除

    List<Dish> selectByExample(DishExample example);//按条件查询

    int updateByExampleSelective(@Param("record") Dish record, @Param("example") DishExample example);//按条件选择性更新

    int updateByExample(@Param("record") Dish record, @Param("example") DishExample example);//按条件全部更新
}
