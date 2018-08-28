package com.hengaiw.pay.model.dao.mapper;

import com.hengaiw.pay.model.dao.model.HaBill;
import com.hengaiw.pay.model.dao.model.HaBillExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaBillMapper {
    long countByExample(HaBillExample example);

    int deleteByExample(HaBillExample example);

    int deleteByPrimaryKey(Integer bill_id);

    int insert(HaBill record);

    int insertSelective(HaBill record);

    List<HaBill> selectByExample(HaBillExample example);

    HaBill selectByPrimaryKey(Integer bill_id);

    int updateByExampleSelective(@Param("record") HaBill record, @Param("example") HaBillExample example);

    int updateByExample(@Param("record") HaBill record, @Param("example") HaBillExample example);

    int updateByPrimaryKeySelective(HaBill record);

    int updateByPrimaryKey(HaBill record);
}