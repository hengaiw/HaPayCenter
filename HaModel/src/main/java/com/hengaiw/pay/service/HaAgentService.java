package com.hengaiw.pay.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hengaiw.pay.model.dao.model.HaAgent;
import com.hengaiw.pay.model.dao.model.HaAgentExample;

public interface HaAgentService {
	long countByExample(HaAgentExample example);

    int deleteByExample(HaAgentExample example);

    int deleteByPrimaryKey(Integer agent_id);

    int insert(HaAgent record);

    int insertSelective(HaAgent record);

    List<HaAgent> selectByExampleWithBLOBs(HaAgentExample example);

    List<HaAgent> selectByExample(HaAgentExample example);

    HaAgent selectByPrimaryKey(Integer agent_id);

    int updateByExampleSelective(@Param("record") HaAgent record, @Param("example") HaAgentExample example);

    int updateByExampleWithBLOBs(@Param("record") HaAgent record, @Param("example") HaAgentExample example);

    int updateByExample(@Param("record") HaAgent record, @Param("example") HaAgentExample example);

    int updateByPrimaryKeySelective(HaAgent record);

    int updateByPrimaryKeyWithBLOBs(HaAgent record);

    int updateByPrimaryKey(HaAgent record);
}
