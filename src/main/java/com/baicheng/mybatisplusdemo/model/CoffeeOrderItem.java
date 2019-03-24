package com.baicheng.mybatisplusdemo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * @author baicheng
 * @description
 * @create 2019-03-23 16:33
 */
@TableName(value = "t_order_coffee_rel")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CoffeeOrderItem implements Serializable {
    private static final long serialVersionUID = 3540572246876994357L;

    @TableId(type = IdType.AUTO)
    private Long id;

    private Date createTime;

    private Date updateTime;

    private Long coffeeOrderId;

    private Long coffeeId;

    private Integer amount;
}
