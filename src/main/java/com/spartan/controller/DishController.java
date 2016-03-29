package com.spartan.controller;

import com.spartan.model.Dish;
import com.spartan.service.DishService;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * @author Wind
 * @version V1.0
 * @Description: .
 * @Date 2016/3/18 16:55
 */
@Controller
@RequestMapping("/dish")
public class DishController {
    @Resource
    private DishService dishService;

    @RequestMapping("/showDish")
    public String toIndex(HttpServletRequest request, Model model) {
        System.out.println("进来了");
        int dishId = Integer.parseInt(request.getParameter("id"));
        Dish dish = dishService.getDish(dishId);
        model.addAttribute("dish", dish);
        return "showDish";
    }
}