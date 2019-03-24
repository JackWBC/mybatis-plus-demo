package com.baicheng.mybatisplusdemo.test.service;

import com.baicheng.mybatisplusdemo.MybatisPlusDemoApplicationTests;
import com.baicheng.mybatisplusdemo.model.Coffee;
import com.baicheng.mybatisplusdemo.service.CoffeeService;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author baicheng
 * @description
 * @create 2019-03-24 09:26
 */
@Slf4j
public class CoffeeServiceTest extends MybatisPlusDemoApplicationTests {

    @Autowired
    private CoffeeService coffeeService;

    @Test
    public void testGetAllDemo(){
        QueryWrapper<Coffee> queryWrapper = new QueryWrapper<Coffee>()
                .select(Coffee.class, i -> true)
                .between("price", 2000, 2500);

        List<Coffee> coffees = coffeeService.getAllDemo(queryWrapper);

        coffees.forEach(item -> log.info("Coffee: {}", item));
    }
}
