package com.ecnu.relax.mapper;

import com.ecnu.relax.model.Type;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface TypeMapper {
    @Delete({
        "delete from type",
        "where type_id = #{typeId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer typeId);

    @Insert({
        "insert into type (type_id, title)",
        "values (#{typeId,jdbcType=INTEGER}, #{title,jdbcType=VARCHAR})"
    })
    int insert(Type record);

    int insertSelective(Type record);

    @Select({
        "select",
        "type_id, title",
        "from type",
        "where type_id = #{typeId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Type selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(Type record);

    @Update({
        "update type",
        "set title = #{title,jdbcType=VARCHAR}",
        "where type_id = #{typeId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Type record);
}