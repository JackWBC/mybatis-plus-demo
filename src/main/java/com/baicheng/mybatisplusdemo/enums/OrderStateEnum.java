package com.baicheng.mybatisplusdemo.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author baicheng
 * @description
 * @create 2019-03-23 18:33
 */
@Getter
@AllArgsConstructor
public enum OrderStateEnum {

    INIT(1, "预付订单"),
    PAID(2, "支付完成"),
    BREWING(3, "生成中"),
    BREWED(4, "生产完成"),
    TAKEN(5, "已领取"),
    CANCELLED(0, "取消订单");

    @EnumValue
    private int code;

    private String des;
}
