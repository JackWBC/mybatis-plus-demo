package com.baicheng.mybatisplusdemo.test.repository;

import com.baicheng.mybatisplusdemo.MybatisPlusDemoApplicationTests;
import com.baicheng.mybatisplusdemo.model.Coffee;
import com.baicheng.mybatisplusdemo.repository.CoffeeMapper;
import com.baicheng.mybatisplusdemo.utils.MyPage;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author baicheng
 * @description
 * @create 2019-03-23 17:51
 */
@Slf4j
public class CoffeeMapperTest extends MybatisPlusDemoApplicationTests {

    @Autowired
    private CoffeeMapper coffeeMapper;

    @Test
    public void testCoffeeMapper(){
        QueryWrapper<Coffee> coffeeQueryWrapper =
                new QueryWrapper<Coffee>()
                        .select(Coffee.class, i -> true)
                        .ge("price", 2500)
                        .orderByAsc("price")
                        .orderByDesc("id");

        List<Coffee> coffees = coffeeMapper.selectList(coffeeQueryWrapper);
        log.info("coffees {}", coffees);

        log.info("----------------------------------");

        Coffee coffeeById = coffeeMapper.selectById(1);
        log.info("coffee {} by id {}", coffeeById, 1);
    }

    @Test
    public void testSelectAllDemo(){
        List<Coffee> coffees = coffeeMapper.selectAllDemo(new QueryWrapper<Coffee>().select(Coffee.class, i -> true));

        coffees.forEach(item -> log.info("Coffee {}", item));
    }

    @Test
    public void testPagination(){
        MyPage<Coffee> myPage = new MyPage<>();
        myPage.setCurrent(1).setSize(2);

        IPage<Coffee> coffeeIPage = coffeeMapper.selectPage(myPage, null);

        log.info("MyPage {} {} {}", myPage.getTotal(), myPage.getPages(), myPage.getCurrent());
        log.info("----------------------------------");

        log.info("Total:{} | Pages:{} | Current:{}", coffeeIPage.getTotal(), coffeeIPage.getPages(), coffeeIPage.getCurrent());
        log.info("Coffees {}", coffeeIPage.getRecords());
    }

    @Test
    public void testOptimisticLock(){
        Coffee coffee = coffeeMapper.selectById(1);
        log.info("origin coffee: {}", coffee);
        coffee.setInventory(coffee.getInventory() - 1);
        int i = coffeeMapper.updateById(coffee);
        log.info("updated result: {}, updated coffee: {}", i, coffeeMapper.selectById(1));
    }
}
