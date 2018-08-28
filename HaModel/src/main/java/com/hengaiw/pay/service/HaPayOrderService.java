package com.hengaiw.pay.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import com.hengaiw.pay.model.dao.model.HaPayOrder;
import com.hengaiw.pay.model.dao.model.HaPayOrderExample;
import com.hengaiw.pay.model.dao.model.HaPayOrderExample.Criteria;

public interface HaPayOrderService {
	long countByExample(HaPayOrderExample example);

    int deleteByExample(HaPayOrderExample example);

    int deleteByPrimaryKey(Long pay_order_id);

    int insert(HaPayOrder record);

    int insertSelective(HaPayOrder record);

    List<HaPayOrder> selectByExample(HaPayOrderExample example);

    HaPayOrder selectByPrimaryKey(Long pay_order_id);
    
    HaPayOrder selectByOrderSn(String pay_order_sn);
    
    HaPayOrder selectByMerchantOrderNo(String merchant_order_no);

    int updateByExampleSelective(@Param("record") HaPayOrder record, @Param("example") HaPayOrderExample example);

    int updateByExample(@Param("record") HaPayOrder record, @Param("example") HaPayOrderExample example);

    int updateByPrimaryKeySelective(HaPayOrder record);

    int updateByPrimaryKey(HaPayOrder record);
    
    void setCriteria(Criteria criteria, HaPayOrder record);
    
    List<HaPayOrder> selectByExamplePage(int offset, int limit,HaPayOrder record);
}
