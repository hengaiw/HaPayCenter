package com.hengaiw.pay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hengaiw.pay.model.dao.mapper.HaQueryOrderMapper;
import com.hengaiw.pay.model.dao.model.HaQueryOrder;
import com.hengaiw.pay.model.dao.model.HaQueryOrderExample;
import com.hengaiw.pay.service.HaQueryOrderService;

@Service
public class HaQueryOrderServiceImpl implements HaQueryOrderService{

	@Autowired
	private HaQueryOrderMapper haQueryOrderMapper;

	@Override
	public long countByExample(HaQueryOrderExample example) {
		// TODO Auto-generated method stub
		return haQueryOrderMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(HaQueryOrderExample example) {
		// TODO Auto-generated method stub
		return haQueryOrderMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer query_order_id) {
		// TODO Auto-generated method stub
		return haQueryOrderMapper.deleteByPrimaryKey(query_order_id);
	}

	@Override
	public int insert(HaQueryOrder record) {
		// TODO Auto-generated method stub
		return haQueryOrderMapper.insert(record);
	}

	@Override
	public int insertSelective(HaQueryOrder record) {
		// TODO Auto-generated method stub
		return haQueryOrderMapper.insertSelective(record);
	}

	@Override
	public List<HaQueryOrder> selectByExampleWithBLOBs(HaQueryOrderExample example) {
		// TODO Auto-generated method stub
		return haQueryOrderMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<HaQueryOrder> selectByExample(HaQueryOrderExample example) {
		// TODO Auto-generated method stub
		return haQueryOrderMapper.selectByExample(example);
	}

	@Override
	public HaQueryOrder selectByPrimaryKey(Integer query_order_id) {
		// TODO Auto-generated method stub
		return haQueryOrderMapper.selectByPrimaryKey(query_order_id);
	}

	@Override
	public int updateByExampleSelective(HaQueryOrder record, HaQueryOrderExample example) {
		// TODO Auto-generated method stub
		return haQueryOrderMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(HaQueryOrder record, HaQueryOrderExample example) {
		// TODO Auto-generated method stub
		return haQueryOrderMapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(HaQueryOrder record, HaQueryOrderExample example) {
		// TODO Auto-generated method stub
		return haQueryOrderMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(HaQueryOrder record) {
		// TODO Auto-generated method stub
		return haQueryOrderMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(HaQueryOrder record) {
		// TODO Auto-generated method stub
		return haQueryOrderMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(HaQueryOrder record) {
		// TODO Auto-generated method stub
		return haQueryOrderMapper.updateByPrimaryKey(record);
	}

	

}
