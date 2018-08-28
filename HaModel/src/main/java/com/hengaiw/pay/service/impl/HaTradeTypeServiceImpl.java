package com.hengaiw.pay.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hengaiw.pay.model.dao.mapper.HaTradeTypeMapper;
import com.hengaiw.pay.model.dao.model.HaTradeType;
import com.hengaiw.pay.model.dao.model.HaTradeTypeExample;
import com.hengaiw.pay.service.HaTradeTypeService;

@Service
public  class HaTradeTypeServiceImpl implements HaTradeTypeService{

	@Autowired
	private  HaTradeTypeMapper  haTradeTypeMapper;

	@Override
	public long countByExample(HaTradeTypeExample example) {
		// TODO Auto-generated method stub
		return haTradeTypeMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(HaTradeTypeExample example) {
		// TODO Auto-generated method stub
		return haTradeTypeMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer trade_type_id) {
		// TODO Auto-generated method stub
		return haTradeTypeMapper.deleteByPrimaryKey(trade_type_id);
	}

	@Override
	public int insert(HaTradeType record) {
		// TODO Auto-generated method stub
		return haTradeTypeMapper.insert(record);
	}

	@Override
	public int insertSelective(HaTradeType record) {
		// TODO Auto-generated method stub
		return haTradeTypeMapper.insertSelective(record);
	}

	@Override
	public List<HaTradeType> selectByExample(HaTradeTypeExample example) {
		// TODO Auto-generated method stub
		return haTradeTypeMapper.selectByExample(example);
	}

	@Override
	public HaTradeType selectByPrimaryKey(Integer trade_type_id) {
		// TODO Auto-generated method stub
		return haTradeTypeMapper.selectByPrimaryKey(trade_type_id);
	}

	@Override
	public int updateByExampleSelective(HaTradeType record, HaTradeTypeExample example) {
		// TODO Auto-generated method stub
		return haTradeTypeMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(HaTradeType record, HaTradeTypeExample example) {
		// TODO Auto-generated method stub
		return haTradeTypeMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(HaTradeType record) {
		// TODO Auto-generated method stub
		return haTradeTypeMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(HaTradeType record) {
		// TODO Auto-generated method stub
		return haTradeTypeMapper.updateByPrimaryKey(record);
	}
	

}
