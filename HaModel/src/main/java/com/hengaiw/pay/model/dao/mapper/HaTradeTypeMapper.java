package com.hengaiw.pay.model.dao.mapper;

import com.hengaiw.pay.model.dao.model.HaTradeType;
import com.hengaiw.pay.model.dao.model.HaTradeTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaTradeTypeMapper {
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