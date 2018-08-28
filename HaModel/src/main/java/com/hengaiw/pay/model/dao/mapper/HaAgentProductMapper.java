package com.hengaiw.pay.model.dao.mapper;

import com.hengaiw.pay.model.dao.model.HaAgentProduct;
import com.hengaiw.pay.model.dao.model.HaAgentProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaAgentProductMapper {
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
}