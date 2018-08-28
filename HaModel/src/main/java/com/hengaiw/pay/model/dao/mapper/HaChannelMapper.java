package com.hengaiw.pay.model.dao.mapper;

import com.hengaiw.pay.model.dao.model.HaChannel;
import com.hengaiw.pay.model.dao.model.HaChannelExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaChannelMapper {
    long countByExample(HaChannelExample example);

    int deleteByExample(HaChannelExample example);

    int deleteByPrimaryKey(Integer channel_id);

    int insert(HaChannel record);

    int insertSelective(HaChannel record);

    List<HaChannel> selectByExampleWithBLOBs(HaChannelExample example);

    List<HaChannel> selectByExample(HaChannelExample example);

    HaChannel selectByPrimaryKey(Integer channel_id);

    int updateByExampleSelective(@Param("record") HaChannel record, @Param("example") HaChannelExample example);

    int updateByExampleWithBLOBs(@Param("record") HaChannel record, @Param("example") HaChannelExample example);

    int updateByExample(@Param("record") HaChannel record, @Param("example") HaChannelExample example);

    int updateByPrimaryKeySelective(HaChannel record);

    int updateByPrimaryKeyWithBLOBs(HaChannel record);

    int updateByPrimaryKey(HaChannel record);
}