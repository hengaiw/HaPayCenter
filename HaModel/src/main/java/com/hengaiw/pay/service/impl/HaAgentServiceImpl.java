package com.hengaiw.pay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hengaiw.pay.model.dao.mapper.HaAgentMapper;
import com.hengaiw.pay.model.dao.model.HaAgent;
import com.hengaiw.pay.model.dao.model.HaAgentExample;
import com.hengaiw.pay.service.HaAgentService;

@Service
public class HaAgentServiceImpl implements HaAgentService{

	@Autowired
	private HaAgentMapper haAgentMapper;

	@Override
	public long countByExample(HaAgentExample example) {
		// TODO Auto-generated method stub
		return haAgentMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(HaAgentExample example) {
		// TODO Auto-generated method stub
		return haAgentMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer agent_id) {
		// TODO Auto-generated method stub
		return haAgentMapper.deleteByPrimaryKey(agent_id);
	}

	@Override
	public int insert(HaAgent record) {
		// TODO Auto-generated method stub
		return haAgentMapper.insert(record);
	}

	@Override
	public int insertSelective(HaAgent record) {
		// TODO Auto-generated method stub
		return haAgentMapper.insertSelective(record);
	}

	@Override
	public List<HaAgent> selectByExampleWithBLOBs(HaAgentExample example) {
		// TODO Auto-generated method stub
		return haAgentMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<HaAgent> selectByExample(HaAgentExample example) {
		// TODO Auto-generated method stub
		return haAgentMapper.selectByExample(example);
	}

	@Override
	public HaAgent selectByPrimaryKey(Integer agent_id) {
		// TODO Auto-generated method stub
		return haAgentMapper.selectByPrimaryKey(agent_id);
	}

	@Override
	public int updateByExampleSelective(HaAgent record, HaAgentExample example) {
		// TODO Auto-generated method stub
		return haAgentMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(HaAgent record, HaAgentExample example) {
		// TODO Auto-generated method stub
		return haAgentMapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(HaAgent record, HaAgentExample example) {
		// TODO Auto-generated method stub
		return haAgentMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(HaAgent record) {
		// TODO Auto-generated method stub
		return haAgentMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(HaAgent record) {
		// TODO Auto-generated method stub
		return haAgentMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(HaAgent record) {
		// TODO Auto-generated method stub
		return haAgentMapper.updateByPrimaryKey(record);
	}

	

}
