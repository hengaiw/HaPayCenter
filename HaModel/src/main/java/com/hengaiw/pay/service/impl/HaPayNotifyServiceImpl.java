package com.hengaiw.pay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hengaiw.pay.model.dao.mapper.HaPayNotifyMapper;
import com.hengaiw.pay.model.dao.model.HaPayNotify;
import com.hengaiw.pay.model.dao.model.HaPayNotifyExample;
import com.hengaiw.pay.service.HaPayNotifyService;

@Service
public class HaPayNotifyServiceImpl implements HaPayNotifyService{

	@Autowired
	private HaPayNotifyMapper haPayNotifyMapper;

	@Override
	public long countByExample(HaPayNotifyExample example) {
		// TODO Auto-generated method stub
		return haPayNotifyMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(HaPayNotifyExample example) {
		// TODO Auto-generated method stub
		return haPayNotifyMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer notify_id) {
		// TODO Auto-generated method stub
		return haPayNotifyMapper.deleteByPrimaryKey(notify_id);
	}

	@Override
	public int insert(HaPayNotify record) {
		// TODO Auto-generated method stub
		return haPayNotifyMapper.insert(record);
	}

	@Override
	public int insertSelective(HaPayNotify record) {
		// TODO Auto-generated method stub
		return haPayNotifyMapper.insertSelective(record);
	}

	@Override
	public List<HaPayNotify> selectByExampleWithBLOBs(HaPayNotifyExample example) {
		// TODO Auto-generated method stub
		return haPayNotifyMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<HaPayNotify> selectByExample(HaPayNotifyExample example) {
		// TODO Auto-generated method stub
		return haPayNotifyMapper.selectByExample(example);
	}

	@Override
	public HaPayNotify selectByPrimaryKey(Integer notify_id) {
		// TODO Auto-generated method stub
		return haPayNotifyMapper.selectByPrimaryKey(notify_id);
	}

	@Override
	public int updateByExampleSelective(HaPayNotify record, HaPayNotifyExample example) {
		// TODO Auto-generated method stub
		return haPayNotifyMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(HaPayNotify record, HaPayNotifyExample example) {
		// TODO Auto-generated method stub
		return haPayNotifyMapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(HaPayNotify record, HaPayNotifyExample example) {
		// TODO Auto-generated method stub
		return haPayNotifyMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(HaPayNotify record) {
		// TODO Auto-generated method stub
		return haPayNotifyMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(HaPayNotify record) {
		// TODO Auto-generated method stub
		return haPayNotifyMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(HaPayNotify record) {
		// TODO Auto-generated method stub
		return haPayNotifyMapper.updateByPrimaryKey(record);
	}

	

}
