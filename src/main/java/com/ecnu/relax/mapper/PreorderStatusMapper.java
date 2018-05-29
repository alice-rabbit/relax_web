package com.ecnu.relax.mapper;

import com.ecnu.relax.model.PreorderStatus;
import com.ecnu.relax.model.PreorderStatusKey;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface PreorderStatusMapper {
    @Delete({
        "delete from preorder_status",
        "where timeslot_id = #{timeslotId,jdbcType=INTEGER}",
          "and specialist_id = #{specialistId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(PreorderStatusKey key);

    @Insert({
        "insert into preorder_status (timeslot_id, specialist_id, ",
        "status)",
        "values (#{timeslotId,jdbcType=INTEGER}, #{specialistId,jdbcType=INTEGER}, ",
        "#{status,jdbcType=INTEGER})"
    })
    int insert(PreorderStatus record);

    int insertSelective(PreorderStatus record);

    @Select({
        "select",
        "timeslot_id, specialist_id, status",
        "from preorder_status",
        "where timeslot_id = #{timeslotId,jdbcType=INTEGER}",
          "and specialist_id = #{specialistId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    PreorderStatus selectByPrimaryKey(PreorderStatusKey key);

    int updateByPrimaryKeySelective(PreorderStatus record);

    @Update({
        "update preorder_status",
        "set status = #{status,jdbcType=INTEGER}",
        "where timeslot_id = #{timeslotId,jdbcType=INTEGER}",
          "and specialist_id = #{specialistId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(PreorderStatus record);
}