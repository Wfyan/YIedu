package com.yi.mapper;

import com.yi.entity.TbComment;
import com.yi.entity.TbCommentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbCommentMapper {
    int countByExample(TbCommentExample example);

    int deleteByExample(TbCommentExample example);

    int deleteByPrimaryKey(Integer comId);

    int insert(TbComment record);

    int insertSelective(TbComment record);

    List<TbComment> selectByExample(TbCommentExample example);

    TbComment selectByPrimaryKey(Integer comId);

    int updateByExampleSelective(@Param("record") TbComment record, @Param("example") TbCommentExample example);

    int updateByExample(@Param("record") TbComment record, @Param("example") TbCommentExample example);

    int updateByPrimaryKeySelective(TbComment record);

    int updateByPrimaryKey(TbComment record);
}