package com.yi.mapper;

import com.yi.entity.StuIntegralInfo;
import com.yi.entity.StuIntegralInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StuIntegralInfoMapper {
    int countByExample(StuIntegralInfoExample example);

    int deleteByExample(StuIntegralInfoExample example);

    int deleteByPrimaryKey(Integer inteId);

    int insert(StuIntegralInfo record);

    int insertSelective(StuIntegralInfo record);

    List<StuIntegralInfo> selectByExample(StuIntegralInfoExample example);

    StuIntegralInfo selectByPrimaryKey(Integer inteId);

    int updateByExampleSelective(@Param("record") StuIntegralInfo record, @Param("example") StuIntegralInfoExample example);

    int updateByExample(@Param("record") StuIntegralInfo record, @Param("example") StuIntegralInfoExample example);

    int updateByPrimaryKeySelective(StuIntegralInfo record);

    int updateByPrimaryKey(StuIntegralInfo record);
}