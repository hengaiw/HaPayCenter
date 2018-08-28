package com.hengaiw.pay.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hengaiw.pay.model.dao.model.HaMerchant;
import com.hengaiw.pay.model.dao.model.HaMerchantExample;
import com.hengaiw.pay.model.dao.model.HaMerchantProduct;
import com.hengaiw.pay.model.dao.model.HaMerchantExample.Criteria;

public interface HaMerchantService {
	long countByExample(HaMerchantExample example);

    int deleteByExample(HaMerchantExample example);

    int deleteByPrimaryKey(Integer merchant_id);

    int insert(HaMerchant record);

    int insertSelective(HaMerchant record);

    List<HaMerchant> selectByExampleWithBLOBs(HaMerchantExample example);

    List<HaMerchant> selectByExample(HaMerchantExample example);

    HaMerchant selectByPrimaryKey(Integer merchant_id);
    
    HaMerchant findByMerchantNo(String merchant_no);

    int updateByExampleSelective(@Param("record") HaMerchant record, @Param("example") HaMerchantExample example);

    int updateByExampleWithBLOBs(@Param("record") HaMerchant record, @Param("example") HaMerchantExample example);

    int updateByExample(@Param("record") HaMerchant record, @Param("example") HaMerchantExample example);

    int updateByPrimaryKeySelective(HaMerchant record);

    int updateByPrimaryKeyWithBLOBs(HaMerchant record);

    int updateByPrimaryKey(HaMerchant record);
   
    
    void setCriteria(Criteria criteria, HaMerchant record);
    
    List<HaMerchant> selectByExamplePage(int offset, int limit,HaMerchant record);
}
