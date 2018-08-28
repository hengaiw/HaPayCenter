package com.hengaiw.pay.model.dao.mapper;

import com.hengaiw.pay.model.dao.model.HaPayOrder;
import com.hengaiw.pay.model.dao.model.HaPayOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaPayOrderMapper {
    long countByExample(HaPayOrderExample example);

    int deleteByExample(HaPayOrderExample example);

    int deleteByPrimaryKey(Long pay_order_id);

    int insert(HaPayOrder record);

    int insertSelective(HaPayOrder record);

    List<HaPayOrder> selectByExampleWithBLOBs(HaPayOrderExample example);

    List<HaPayOrder> selectByExample(HaPayOrderExample example);

    HaPayOrder selectByPrimaryKey(Long pay_order_id);

    int updateByExampleSelective(@Param("record") HaPayOrder record, @Param("example") HaPayOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") HaPayOrder record, @Param("example") HaPayOrderExample example);

    int updateByExample(@Param("record") HaPayOrder record, @Param("example") HaPayOrderExample example);

    int updateByPrimaryKeySelective(HaPayOrder record);

    int updateByPrimaryKeyWithBLOBs(HaPayOrder record);

    int updateByPrimaryKey(HaPayOrder record);
}