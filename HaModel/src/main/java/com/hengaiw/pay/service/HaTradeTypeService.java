package com.hengaiw.pay.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hengaiw.pay.model.dao.model.HaTradeType;
import com.hengaiw.pay.model.dao.model.HaTradeTypeExample;

public interface HaTradeTypeService {
	long countByExample(HaTradeTypeExample example);

	int deleteByExample(HaTradeTypeExample example);

	int deleteByPrimaryKey(Integer trade_type_id);

	int insert(HaTradeType record);

	int insertSelective(HaTradeType record);

	List<HaTradeType> selectByExample(HaTradeTypeExample example);

	HaTradeType selectByPrimaryKey(Integer trade_type_id);

	int updateByExampleSelective(@Param("record") HaTradeType record, @Param("example") HaTradeTypeExample example);

	int updateByExample(@Param("record") HaTradeType record, @Param("example") HaTradeTypeExample example);

	int updateByPrimaryKeySelective(HaTradeType record);

	int updateByPrimaryKey(HaTradeType record);
}
