package com.hengaiw.pay.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hengaiw.pay.model.dao.model.HaPayNotify;
import com.hengaiw.pay.model.dao.model.HaPayNotifyExample;

public interface HaPayNotifyService {
	long countByExample(HaPayNotifyExample example);

    int deleteByExample(HaPayNotifyExample example);

    int deleteByPrimaryKey(Integer notify_id);

    int insert(HaPayNotify record);

    int insertSelective(HaPayNotify record);

    List<HaPayNotify> selectByExampleWithBLOBs(HaPayNotifyExample example);

    List<HaPayNotify> selectByExample(HaPayNotifyExample example);

    HaPayNotify selectByPrimaryKey(Integer notify_id);

    int updateByExampleSelective(@Param("record") HaPayNotify record, @Param("example") HaPayNotifyExample example);

    int updateByExampleWithBLOBs(@Param("record") HaPayNotify record, @Param("example") HaPayNotifyExample example);

    int updateByExample(@Param("record") HaPayNotify record, @Param("example") HaPayNotifyExample example);

    int updateByPrimaryKeySelective(HaPayNotify record);

    int updateByPrimaryKeyWithBLOBs(HaPayNotify record);

    int updateByPrimaryKey(HaPayNotify record);
}
