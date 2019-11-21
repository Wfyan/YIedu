package com.yi.mapper;

import com.yi.entity.PayInfo;
import com.yi.entity.PayInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PayInfoMapper {
    int countByExample(PayInfoExample example);

    int deleteByExample(PayInfoExample example);

    int deleteByPrimaryKey(String payId);

    int insert(PayInfo record);

    int insertSelective(PayInfo record);

    List<PayInfo> selectByExample(PayInfoExample example);

    PayInfo selectByPrimaryKey(String payId);

    int updateByExampleSelective(@Param("record") PayInfo record, @Param("example") PayInfoExample example);

    int updateByExample(@Param("record") PayInfo record, @Param("example") PayInfoExample example);

    int updateByPrimaryKeySelective(PayInfo record);

    int updateByPrimaryKey(PayInfo record);
}