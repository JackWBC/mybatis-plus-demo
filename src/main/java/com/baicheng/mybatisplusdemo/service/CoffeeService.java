package com.baicheng.mybatisplusdemo.service;

import com.baicheng.mybatisplusdemo.model.Coffee;
import com.baicheng.mybatisplusdemo.repository.CoffeeMapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author baicheng
 * @description
 * @create 2019-03-23 23:10
 */
@Service
public class CoffeeService extends ServiceImpl<CoffeeMapper, Coffee> {

    public List<Coffee> getAllDemo(Wrapper wrapper){
        return baseMapper.selectAllDemo(wrapper);
    }
}
