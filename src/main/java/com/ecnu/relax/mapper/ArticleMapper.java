package com.ecnu.relax.mapper;

import com.ecnu.relax.model.Article;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface ArticleMapper {
    @Delete({
        "delete from article",
        "where article_id = #{articleId,jdbcType=INTEGER}"
    })
    int deleteByPrimaryKey(Integer articleId);

    @Insert({
        "insert into article (article_id, specialist_id, ",
        "publish_time, title, ",
        "content)",
        "values (#{articleId,jdbcType=INTEGER}, #{specialistId,jdbcType=INTEGER}, ",
        "#{publishTime,jdbcType=TIMESTAMP}, #{title,jdbcType=VARCHAR}, ",
        "#{content,jdbcType=VARCHAR})"
    })
    int insert(Article record);

    int insertSelective(Article record);

    @Select({
        "select",
        "article_id, specialist_id, publish_time, title, content",
        "from article",
        "where article_id = #{articleId,jdbcType=INTEGER}"
    })
    @ResultMap("BaseResultMap")
    Article selectByPrimaryKey(Integer articleId);

    int updateByPrimaryKeySelective(Article record);

    @Update({
        "update article",
        "set specialist_id = #{specialistId,jdbcType=INTEGER},",
          "publish_time = #{publishTime,jdbcType=TIMESTAMP},",
          "title = #{title,jdbcType=VARCHAR},",
          "content = #{content,jdbcType=VARCHAR}",
        "where article_id = #{articleId,jdbcType=INTEGER}"
    })
    int updateByPrimaryKey(Article record);
}