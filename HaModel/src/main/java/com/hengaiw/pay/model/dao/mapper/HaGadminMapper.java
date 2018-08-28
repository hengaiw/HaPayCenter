package com.hengaiw.pay.model.dao.mapper;

import com.hengaiw.pay.model.dao.model.HaGadmin;
import com.hengaiw.pay.model.dao.model.HaGadminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaGadminMapper {
    long countByExample(HaGadminExample example);

    int deleteByExample(HaGadminExample example);

    int deleteByPrimaryKey(Short gid);

    int insert(HaGadmin record);

    int insertSelective(HaGadmin record);

    List<HaGadmin> selectByExampleWithBLOBs(HaGadminExample example);

    List<HaGadmin> selectByExample(HaGadminExample example);

    HaGadmin selectByPrimaryKey(Short gid);

    int updateByExampleSelective(@Param("record") HaGadmin record, @Param("example") HaGadminExample example);

    int updateByExampleWithBLOBs(@Param("record") HaGadmin record, @Param("example") HaGadminExample example);

    int updateByExample(@Param("record") HaGadmin record, @Param("example") HaGadminExample example);

    int updateByPrimaryKeySelective(HaGadmin record);

    int updateByPrimaryKeyWithBLOBs(HaGadmin record);

    int updateByPrimaryKey(HaGadmin record);
}