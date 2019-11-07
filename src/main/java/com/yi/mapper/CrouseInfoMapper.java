package com.yi.mapper;

import com.yi.entity.CrouseInfo;
import com.yi.entity.CrouseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CrouseInfoMapper {
    int countByExample(CrouseInfoExample example);

    int deleteByExample(CrouseInfoExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(CrouseInfo record);

    int insertSelective(CrouseInfo record);

    List<CrouseInfo> selectByExample(CrouseInfoExample example);

    CrouseInfo selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") CrouseInfo record, @Param("example") CrouseInfoExample example);

    int updateByExample(@Param("record") CrouseInfo record, @Param("example") CrouseInfoExample example);

    int updateByPrimaryKeySelective(CrouseInfo record);

    int updateByPrimaryKey(CrouseInfo record);
}