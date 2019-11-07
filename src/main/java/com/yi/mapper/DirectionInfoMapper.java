package com.yi.mapper;

import com.yi.entity.DirectionInfo;
import com.yi.entity.DirectionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DirectionInfoMapper {
    int countByExample(DirectionInfoExample example);

    int deleteByExample(DirectionInfoExample example);

    int deleteByPrimaryKey(Integer did);

    int insert(DirectionInfo record);

    int insertSelective(DirectionInfo record);

    List<DirectionInfo> selectByExample(DirectionInfoExample example);

    DirectionInfo selectByPrimaryKey(Integer did);

    int updateByExampleSelective(@Param("record") DirectionInfo record, @Param("example") DirectionInfoExample example);

    int updateByExample(@Param("record") DirectionInfo record, @Param("example") DirectionInfoExample example);

    int updateByPrimaryKeySelective(DirectionInfo record);

    int updateByPrimaryKey(DirectionInfo record);
}