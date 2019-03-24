package com.baicheng.mybatisplusdemo.service;

import com.baicheng.mybatisplusdemo.model.CoffeeOrderItem;
import com.baicheng.mybatisplusdemo.repository.CoffeeOrderItemMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author baicheng
 * @description
 * @create 2019-03-24 09:24
 */
@Service
public class CoffeeOrderItemService extends ServiceImpl<CoffeeOrderItemMapper, CoffeeOrderItem> {
}
