package com.hengaiw.pay.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hengaiw.pay.model.dao.model.HaMerchantNotify;
import com.hengaiw.pay.model.dao.model.HaMerchantNotifyExample;

public interface HaMerchantNotifyService {
	long countByExample(HaMerchantNotifyExample example);

    int deleteByExample(HaMerchantNotifyExample example);

    int deleteByPrimaryKey(Integer merchant_notify_id);

    int insert(HaMerchantNotify record);

    int insertSelective(HaMerchantNotify record);

    List<HaMerchantNotify> selectByExampleWithBLOBs(HaMerchantNotifyExample example);

    List<HaMerchantNotify> selectByExample(HaMerchantNotifyExample example);

    HaMerchantNotify selectByPrimaryKey(Integer merchant_notify_id);

    int updateByExampleSelective(@Param("record") HaMerchantNotify record, @Param("example") HaMerchantNotifyExample example);

    int updateByExampleWithBLOBs(@Param("record") HaMerchantNotify record, @Param("example") HaMerchantNotifyExample example);

    int updateByExample(@Param("record") HaMerchantNotify record, @Param("example") HaMerchantNotifyExample example);

    int updateByPrimaryKeySelective(HaMerchantNotify record);

    int updateByPrimaryKeyWithBLOBs(HaMerchantNotify record);

    int updateByPrimaryKey(HaMerchantNotify record);
}
