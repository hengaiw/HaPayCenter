package com.hengaiw.pay.model.dao.mapper;

import com.hengaiw.pay.model.dao.model.HaLock;
import com.hengaiw.pay.model.dao.model.HaLockExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HaLockMapper {
    long countByExample(HaLockExample example);

    int deleteByExample(HaLockExample example);

    int insert(HaLock record);

    int insertSelective(HaLock record);

    List<HaLock> selectByExample(HaLockExample example);

    int updateByExampleSelective(@Param("record") HaLock record, @Param("example") HaLockExample example);

    int updateByExample(@Param("record") HaLock record, @Param("example") HaLockExample example);
}