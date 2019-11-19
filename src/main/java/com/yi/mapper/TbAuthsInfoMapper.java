package com.yi.mapper;

import com.yi.entity.TbAuthsInfo;
import com.yi.entity.TbAuthsInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbAuthsInfoMapper {
    int countByExample(TbAuthsInfoExample example);

    int deleteByExample(TbAuthsInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAuthsInfo record);

    int insertSelective(TbAuthsInfo record);

    List<TbAuthsInfo> selectByExample(TbAuthsInfoExample example);

    TbAuthsInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAuthsInfo record, @Param("example") TbAuthsInfoExample example);

    int updateByExample(@Param("record") TbAuthsInfo record, @Param("example") TbAuthsInfoExample example);

    int updateByPrimaryKeySelective(TbAuthsInfo record);

    int updateByPrimaryKey(TbAuthsInfo record);
}