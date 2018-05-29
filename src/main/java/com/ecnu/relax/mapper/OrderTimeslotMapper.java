package com.ecnu.relax.mapper;

import com.ecnu.relax.model.OrderTimeslotKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;

public interface OrderTimeslotMapper {
    @Delete({
        "delete from order_timeslot",
        "where order_id = #{orderId,jdbcType=INTEGER}",
          "and timeslot_id = #{timeslotId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(OrderTimeslotKey key);

    @Insert({
        "insert into order_timeslot (order_id, timeslot_id)",
        "values (#{orderId,jdbcType=INTEGER}, #{timeslotId,jdbcType=INTEGER})"
    })
    int insert(OrderTimeslotKey record);

    int insertSelective(OrderTimeslotKey record);
}