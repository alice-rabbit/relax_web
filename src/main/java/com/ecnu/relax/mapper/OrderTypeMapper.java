package com.ecnu.relax.mapper;

import com.ecnu.relax.model.OrderTypeKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface OrderTypeMapper {
    @Delete({
        "delete from order_type",
        "where order_id = #{orderId,jdbcType=INTEGER}",
          "and type_id = #{typeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(OrderTypeKey key);

    @Insert({
        "insert into order_type (order_id, type_id)",
        "values (#{orderId,jdbcType=INTEGER}, #{typeId,jdbcType=INTEGER})"
    })
    int insert(OrderTypeKey record);

    int insertSelective(OrderTypeKey record);
}