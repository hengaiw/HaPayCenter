package com.hengaiw.pay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hengaiw.pay.model.dao.mapper.HaChannelMapper;
import com.hengaiw.pay.model.dao.model.HaChannel;
import com.hengaiw.pay.model.dao.model.HaChannelExample;
import com.hengaiw.pay.service.HaChannelService;

@Service
public class HaChannelServiceImpl implements HaChannelService{

	@Autowired
	private HaChannelMapper haChannelMapper;

	@Override
	public long countByExample(HaChannelExample example) {
		// TODO Auto-generated method stub
		return haChannelMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(HaChannelExample example) {
		// TODO Auto-generated method stub
		return haChannelMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer channel_id) {
		// TODO Auto-generated method stub
		return haChannelMapper.deleteByPrimaryKey(channel_id);
	}

	@Override
	public int insert(HaChannel record) {
		// TODO Auto-generated method stub
		return haChannelMapper.insert(record);
	}

	@Override
	public int insertSelective(HaChannel record) {
		// TODO Auto-generated method stub
		return haChannelMapper.insertSelective(record);
	}

	@Override
	public List<HaChannel> selectByExampleWithBLOBs(HaChannelExample example) {
		// TODO Auto-generated method stub
		return haChannelMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<HaChannel> selectByExample(HaChannelExample example) {
		// TODO Auto-generated method stub
		return haChannelMapper.selectByExample(example);
	}

	@Override
	public HaChannel selectByPrimaryKey(Integer channel_id) {
		// TODO Auto-generated method stub
		return haChannelMapper.selectByPrimaryKey(channel_id);
	}

	@Override
	public int updateByExampleSelective(HaChannel record, HaChannelExample example) {
		// TODO Auto-generated method stub
		return haChannelMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(HaChannel record, HaChannelExample example) {
		// TODO Auto-generated method stub
		return haChannelMapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(HaChannel record, HaChannelExample example) {
		// TODO Auto-generated method stub
		return haChannelMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(HaChannel record) {
		// TODO Auto-generated method stub
		return haChannelMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(HaChannel record) {
		// TODO Auto-generated method stub
		return haChannelMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(HaChannel record) {
		// TODO Auto-generated method stub
		return haChannelMapper.updateByPrimaryKey(record);
	}

	

}
