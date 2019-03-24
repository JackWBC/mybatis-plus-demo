package com.baicheng.mybatisplusdemo.service;

import com.baicheng.mybatisplusdemo.model.CoffeeOrder;
import com.baicheng.mybatisplusdemo.repository.CoffeeOrderMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author baicheng
 * @description
 * @create 2019-03-24 09:23
 */
@Service
public class CoffeeOrderService extends ServiceImpl<CoffeeOrderMapper, CoffeeOrder> {
}
