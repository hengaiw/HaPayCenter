package com.hengaiw.pay.model.dao.mapper;

import com.hengaiw.pay.model.dao.model.HaBillError;
import com.hengaiw.pay.model.dao.model.HaBillErrorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaBillErrorMapper {
    long countByExample(HaBillErrorExample example);

    int deleteByExample(HaBillErrorExample example);

    int deleteByPrimaryKey(Integer bill_error_id);

    int insert(HaBillError record);

    int insertSelective(HaBillError record);

    List<HaBillError> selectByExampleWithBLOBs(HaBillErrorExample example);

    List<HaBillError> selectByExample(HaBillErrorExample example);

    HaBillError selectByPrimaryKey(Integer bill_error_id);

    int updateByExampleSelective(@Param("record") HaBillError record, @Param("example") HaBillErrorExample example);

    int updateByExampleWithBLOBs(@Param("record") HaBillError record, @Param("example") HaBillErrorExample example);

    int updateByExample(@Param("record") HaBillError record, @Param("example") HaBillErrorExample example);

    int updateByPrimaryKeySelective(HaBillError record);

    int updateByPrimaryKeyWithBLOBs(HaBillError record);

    int updateByPrimaryKey(HaBillError record);
}