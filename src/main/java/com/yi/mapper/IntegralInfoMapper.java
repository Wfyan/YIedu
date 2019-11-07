package com.yi.mapper;

import com.yi.entity.IntegralInfo;
import com.yi.entity.IntegralInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IntegralInfoMapper {
    int countByExample(IntegralInfoExample example);

    int deleteByExample(IntegralInfoExample example);

    int deleteByPrimaryKey(Integer inteId);

    int insert(IntegralInfo record);

    int insertSelective(IntegralInfo record);

    List<IntegralInfo> selectByExample(IntegralInfoExample example);

    IntegralInfo selectByPrimaryKey(Integer inteId);

    int updateByExampleSelective(@Param("record") IntegralInfo record, @Param("example") IntegralInfoExample example);

    int updateByExample(@Param("record") IntegralInfo record, @Param("example") IntegralInfoExample example);

    int updateByPrimaryKeySelective(IntegralInfo record);

    int updateByPrimaryKey(IntegralInfo record);
}