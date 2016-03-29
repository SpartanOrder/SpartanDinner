package com.spartan.service.impl;

import com.spartan.dao.DishMapper;
import com.spartan.model.Dish;
import com.spartan.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description: .
 * @Date 2016/3/18 15:30
 */
@Service("dishService")
public class DishServiceImpl implements DishService {

    @Autowired
    private DishMapper dishMapper;

    public Dish getDish(int id) {
        return dishMapper.selectByPrimaryKey(id);
    }
}
