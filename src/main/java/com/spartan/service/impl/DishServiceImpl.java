package com.spartan.service.impl;

import com.spartan.dao.DishMapper;
import com.spartan.model.Dish;
import com.spartan.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description: .
 * @Date 2016/3/18 15:30
 */
@Service("dishService")
public class DishServiceImpl extends AbstractService<Dish, Integer> implements DishService {

    @Autowired
    private DishMapper dishMapper;

    //这句必须要加上。不然会报空指针异常，因为在实际掉用的时候不是BaseMapper调用，而是这个productMapper
    @Autowired
    public void setBaseMapper() {
        super.setBaseMapper(dishMapper);
    }
}
