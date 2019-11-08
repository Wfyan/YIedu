package com.yi.mapper;

import com.yi.entity.KindInfo;
import com.yi.entity.KindInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface KindInfoMapper {
    int countByExample(KindInfoExample example);

    int deleteByExample(KindInfoExample example);

    int deleteByPrimaryKey(Integer kid);

    int insert(KindInfo record);

    int insertSelective(KindInfo record);

    List<KindInfo> selectByExample(KindInfoExample example);

    KindInfo selectByPrimaryKey(Integer kid);

    int updateByExampleSelective(@Param("record") KindInfo record, @Param("example") KindInfoExample example);

    int updateByExample(@Param("record") KindInfo record, @Param("example") KindInfoExample example);

    int updateByPrimaryKeySelective(KindInfo record);

    int updateByPrimaryKey(KindInfo record);
}