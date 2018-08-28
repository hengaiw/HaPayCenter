package com.hengaiw.pay.model.dao.mapper;

import com.hengaiw.pay.model.dao.model.HaAdminLog;
import com.hengaiw.pay.model.dao.model.HaAdminLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaAdminLogMapper {
    long countByExample(HaAdminLogExample example);

    int deleteByExample(HaAdminLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(HaAdminLog record);

    int insertSelective(HaAdminLog record);

    List<HaAdminLog> selectByExample(HaAdminLogExample example);

    HaAdminLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") HaAdminLog record, @Param("example") HaAdminLogExample example);

    int updateByExample(@Param("record") HaAdminLog record, @Param("example") HaAdminLogExample example);

    int updateByPrimaryKeySelective(HaAdminLog record);

    int updateByPrimaryKey(HaAdminLog record);
}