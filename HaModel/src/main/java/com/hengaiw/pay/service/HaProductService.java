package com.hengaiw.pay.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.hengaiw.pay.model.dao.model.HaProduct;
import com.hengaiw.pay.model.dao.model.HaProductExample;

public interface HaProductService {
	long countByExample(HaProductExample example);

    int deleteByExample(HaProductExample example);

    int deleteByPrimaryKey(Integer product_id);

    int insert(HaProduct record);

    int insertSelective(HaProduct record);

    List<HaProduct> selectByExampleWithBLOBs(HaProductExample example);

    List<HaProduct> selectByExample(HaProductExample example);

    HaProduct selectByPrimaryKey(Integer product_id);

    int updateByExampleSelective(@Param("record") HaProduct record, @Param("example") HaProductExample example);

    int updateByExampleWithBLOBs(@Param("record") HaProduct record, @Param("example") HaProductExample example);

    int updateByExample(@Param("record") HaProduct record, @Param("example") HaProductExample example);

    int updateByPrimaryKeySelective(HaProduct record);

    int updateByPrimaryKeyWithBLOBs(HaProduct record);

    int updateByPrimaryKey(HaProduct record);
}
