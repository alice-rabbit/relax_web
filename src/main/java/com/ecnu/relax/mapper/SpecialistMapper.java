package com.ecnu.relax.mapper;

import com.ecnu.relax.model.Specialist;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface SpecialistMapper {
    @Delete({
        "delete from specialist",
        "where specialist_id = #{specialistId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer specialistId);

    @Insert({
        "insert into specialist (specialist_id, rating, ",
        "qualification, employ_length, ",
        "introduction)",
        "values (#{specialistId,jdbcType=INTEGER}, #{rating,jdbcType=DOUBLE}, ",
        "#{qualification,jdbcType=VARCHAR}, #{employLength,jdbcType=INTEGER}, ",
        "#{introduction,jdbcType=VARCHAR})"
    })
    int insert(Specialist record);

    int insertSelective(Specialist record);

    @Select({
        "select",
        "specialist_id, rating, qualification, employ_length, introduction",
        "from specialist",
        "where specialist_id = #{specialistId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Specialist selectByPrimaryKey(Integer specialistId);

    int updateByPrimaryKeySelective(Specialist record);

    @Update({
        "update specialist",
        "set rating = #{rating,jdbcType=DOUBLE},",
          "qualification = #{qualification,jdbcType=VARCHAR},",
          "employ_length = #{employLength,jdbcType=INTEGER},",
          "introduction = #{introduction,jdbcType=VARCHAR}",
        "where specialist_id = #{specialistId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Specialist record);
}