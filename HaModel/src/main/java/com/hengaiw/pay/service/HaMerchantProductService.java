package com.hengaiw.pay.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hengaiw.pay.model.dao.model.HaMerchantProduct;
import com.hengaiw.pay.model.dao.model.HaMerchantProductExample;
import com.hengaiw.pay.model.dao.model.HaMerchantProductExample.Criteria;

public interface HaMerchantProductService {
	long countByExample(HaMerchantProductExample example);

    int deleteByExample(HaMerchantProductExample example);

    int deleteByPrimaryKey(Integer merchant_product_id);

    int insert(HaMerchantProduct record);

    int insertSelective(HaMerchantProduct record);

    List<HaMerchantProduct> selectByExample(HaMerchantProductExample example);

    HaMerchantProduct selectByPrimaryKey(Integer merchant_product_id);

    HaMerchantProduct selectByMerchantProduct(Integer merchant_id,Integer product_id);
    
    int updateByExampleSelective(@Param("record") HaMerchantProduct record, @Param("example") HaMerchantProductExample example);

    int updateByExample(@Param("record") HaMerchantProduct record, @Param("example") HaMerchantProductExample example);

    int updateByPrimaryKeySelective(HaMerchantProduct record);

    int updateByPrimaryKey(HaMerchantProduct record);
    
    void setCriteria(Criteria criteria, HaMerchantProduct record);
    
    List<HaMerchantProduct> selectByExamplePage(int offset, int limit,HaMerchantProduct record);
}
