package com.baicheng.mybatisplusdemo.repository;

import com.baicheng.mybatisplusdemo.model.Coffee;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author baicheng
 * @description
 * @create 2019-03-23 17:44
 */
@Repository
public interface CoffeeMapper extends BaseMapper<Coffee> {

    /**
     * 在使用自定义SQL的同时也可以使用Wrapper的便利
     */
    @Select("select * from t_coffee ${ew.customSqlSegment}")
    List<Coffee> selectAllDemo(@Param(Constants.WRAPPER) Wrapper wrapper);
}
