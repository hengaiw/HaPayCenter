package com.hengaiw.pay.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hengaiw.pay.model.dao.model.HaAgentProduct;
import com.hengaiw.pay.model.dao.model.HaAgentProductExample;
import com.hengaiw.pay.model.dao.model.HaAgentProductExample.Criteria;

public interface HaAgentProductService {
	long countByExample(HaAgentProductExample example);

    int deleteByExample(HaAgentProductExample example);

    int deleteByPrimaryKey(Integer agent_product_id);

    int insert(HaAgentProduct record);

    int insertSelective(HaAgentProduct record);

    List<HaAgentProduct> selectByExample(HaAgentProductExample example);

    HaAgentProduct selectByPrimaryKey(Integer agent_product_id);

    int updateByExampleSelective(@Param("record") HaAgentProduct record, @Param("example") HaAgentProductExample example);

    int updateByExample(@Param("record") HaAgentProduct record, @Param("example") HaAgentProductExample example);

    int updateByPrimaryKeySelective(HaAgentProduct record);

    int updateByPrimaryKey(HaAgentProduct record);
    
    void setCriteria(Criteria criteria, HaAgentProduct record);
    
    List<HaAgentProduct> selectByExamplePage(int offset, int limit,HaAgentProduct record);
}
