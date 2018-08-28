package com.hengaiw.pay.model.dao.mapper;

import com.hengaiw.pay.model.dao.model.HaMerchant;
import com.hengaiw.pay.model.dao.model.HaMerchantExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaMerchantMapper {
    long countByExample(HaMerchantExample example);

    int deleteByExample(HaMerchantExample example);

    int deleteByPrimaryKey(Integer merchant_id);

    int insert(HaMerchant record);

    int insertSelective(HaMerchant record);

    List<HaMerchant> selectByExampleWithBLOBs(HaMerchantExample example);

    List<HaMerchant> selectByExample(HaMerchantExample example);

    HaMerchant selectByPrimaryKey(Integer merchant_id);

    int updateByExampleSelective(@Param("record") HaMerchant record, @Param("example") HaMerchantExample example);

    int updateByExampleWithBLOBs(@Param("record") HaMerchant record, @Param("example") HaMerchantExample example);

    int updateByExample(@Param("record") HaMerchant record, @Param("example") HaMerchantExample example);

    int updateByPrimaryKeySelective(HaMerchant record);

    int updateByPrimaryKeyWithBLOBs(HaMerchant record);

    int updateByPrimaryKey(HaMerchant record);
}