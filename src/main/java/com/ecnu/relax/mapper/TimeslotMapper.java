package com.ecnu.relax.mapper;

import com.ecnu.relax.model.Timeslot;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TimeslotMapper {
    @Delete({
        "delete from timeslot",
        "where timeslot_id = #{timeslotId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer timeslotId);

    @Insert({
        "insert into timeslot (timeslot_id, concrete_time)",
        "values (#{timeslotId,jdbcType=INTEGER}, #{concreteTime,jdbcType=VARCHAR})"
    })
    int insert(Timeslot record);

    int insertSelective(Timeslot record);

    @Select({
        "select",
        "timeslot_id, concrete_time",
        "from timeslot",
        "where timeslot_id = #{timeslotId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Timeslot selectByPrimaryKey(Integer timeslotId);

    int updateByPrimaryKeySelective(Timeslot record);

    @Update({
        "update timeslot",
        "set concrete_time = #{concreteTime,jdbcType=VARCHAR}",
        "where timeslot_id = #{timeslotId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Timeslot record);
}