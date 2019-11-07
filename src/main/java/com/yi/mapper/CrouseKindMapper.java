package com.yi.mapper;

import com.yi.entity.CrouseKind;
import com.yi.entity.CrouseKindExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrouseKindMapper {
    int countByExample(CrouseKindExample example);

    int deleteByExample(CrouseKindExample example);

    int deleteByPrimaryKey(Integer kid);

    int insert(CrouseKind record);

    int insertSelective(CrouseKind record);

    List<CrouseKind> selectByExample(CrouseKindExample example);

    CrouseKind selectByPrimaryKey(Integer kid);

    int updateByExampleSelective(@Param("record") CrouseKind record, @Param("example") CrouseKindExample example);

    int updateByExample(@Param("record") CrouseKind record, @Param("example") CrouseKindExample example);

    int updateByPrimaryKeySelective(CrouseKind record);

    int updateByPrimaryKey(CrouseKind record);
}