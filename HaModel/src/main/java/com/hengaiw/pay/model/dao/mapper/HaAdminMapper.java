package com.hengaiw.pay.model.dao.mapper;

import com.hengaiw.pay.model.dao.model.HaAdmin;
import com.hengaiw.pay.model.dao.model.HaAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaAdminMapper {
    long countByExample(HaAdminExample example);

    int deleteByExample(HaAdminExample example);

    int deleteByPrimaryKey(Integer admin_id);

    int insert(HaAdmin record);

    int insertSelective(HaAdmin record);

    List<HaAdmin> selectByExample(HaAdminExample example);

    HaAdmin selectByPrimaryKey(Integer admin_id);

    int updateByExampleSelective(@Param("record") HaAdmin record, @Param("example") HaAdminExample example);

    int updateByExample(@Param("record") HaAdmin record, @Param("example") HaAdminExample example);

    int updateByPrimaryKeySelective(HaAdmin record);

    int updateByPrimaryKey(HaAdmin record);
}