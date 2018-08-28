package com.hengaiw.pay.model.dao.mapper;

import com.hengaiw.pay.model.dao.model.HaMerchantProduct;
import com.hengaiw.pay.model.dao.model.HaMerchantProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaMerchantProductMapper {
    long countByExample(HaMerchantProductExample example);

    int deleteByExample(HaMerchantProductExample example);

    int deleteByPrimaryKey(Integer merchant_product_id);

    int insert(HaMerchantProduct record);

    int insertSelective(HaMerchantProduct record);

    List<HaMerchantProduct> selectByExampleWithBLOBs(HaMerchantProductExample example);

    List<HaMerchantProduct> selectByExample(HaMerchantProductExample example);

    HaMerchantProduct selectByPrimaryKey(Integer merchant_product_id);

    int updateByExampleSelective(@Param("record") HaMerchantProduct record, @Param("example") HaMerchantProductExample example);

    int updateByExampleWithBLOBs(@Param("record") HaMerchantProduct record, @Param("example") HaMerchantProductExample example);

    int updateByExample(@Param("record") HaMerchantProduct record, @Param("example") HaMerchantProductExample example);

    int updateByPrimaryKeySelective(HaMerchantProduct record);

    int updateByPrimaryKeyWithBLOBs(HaMerchantProduct record);

    int updateByPrimaryKey(HaMerchantProduct record);
}