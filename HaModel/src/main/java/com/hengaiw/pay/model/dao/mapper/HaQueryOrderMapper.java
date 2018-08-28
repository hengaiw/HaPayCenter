package com.hengaiw.pay.model.dao.mapper;

import com.hengaiw.pay.model.dao.model.HaQueryOrder;
import com.hengaiw.pay.model.dao.model.HaQueryOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaQueryOrderMapper {
    long countByExample(HaQueryOrderExample example);

    int deleteByExample(HaQueryOrderExample example);

    int deleteByPrimaryKey(Integer query_order_id);

    int insert(HaQueryOrder record);

    int insertSelective(HaQueryOrder record);

    List<HaQueryOrder> selectByExampleWithBLOBs(HaQueryOrderExample example);

    List<HaQueryOrder> selectByExample(HaQueryOrderExample example);

    HaQueryOrder selectByPrimaryKey(Integer query_order_id);

    int updateByExampleSelective(@Param("record") HaQueryOrder record, @Param("example") HaQueryOrderExample example);

    int updateByExampleWithBLOBs(@Param("record") HaQueryOrder record, @Param("example") HaQueryOrderExample example);

    int updateByExample(@Param("record") HaQueryOrder record, @Param("example") HaQueryOrderExample example);

    int updateByPrimaryKeySelective(HaQueryOrder record);

    int updateByPrimaryKeyWithBLOBs(HaQueryOrder record);

    int updateByPrimaryKey(HaQueryOrder record);
}