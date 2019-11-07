package com.yi.mapper;

import com.yi.entity.MajorInfo;
import com.yi.entity.MajorInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MajorInfoMapper {
    int countByExample(MajorInfoExample example);

    int deleteByExample(MajorInfoExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(MajorInfo record);

    int insertSelective(MajorInfo record);

    List<MajorInfo> selectByExample(MajorInfoExample example);

    MajorInfo selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") MajorInfo record, @Param("example") MajorInfoExample example);

    int updateByExample(@Param("record") MajorInfo record, @Param("example") MajorInfoExample example);

    int updateByPrimaryKeySelective(MajorInfo record);

    int updateByPrimaryKey(MajorInfo record);
}