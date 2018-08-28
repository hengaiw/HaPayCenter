package com.hengaiw.pay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hengaiw.pay.model.dao.mapper.HaMerchantNotifyMapper;
import com.hengaiw.pay.model.dao.model.HaMerchantNotify;
import com.hengaiw.pay.model.dao.model.HaMerchantNotifyExample;
import com.hengaiw.pay.service.HaMerchantNotifyService;

@Service
public class HaMerchantNotifyServiceImpl implements HaMerchantNotifyService{

	@Autowired
	private HaMerchantNotifyMapper haMerchantNotifyMapper;

	@Override
	public long countByExample(HaMerchantNotifyExample example) {
		// TODO Auto-generated method stub
		return haMerchantNotifyMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(HaMerchantNotifyExample example) {
		// TODO Auto-generated method stub
		return haMerchantNotifyMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer merchant_notify_id) {
		// TODO Auto-generated method stub
		return haMerchantNotifyMapper.deleteByPrimaryKey(merchant_notify_id);
	}

	@Override
	public int insert(HaMerchantNotify record) {
		// TODO Auto-generated method stub
		return haMerchantNotifyMapper.insert(record);
	}

	@Override
	public int insertSelective(HaMerchantNotify record) {
		// TODO Auto-generated method stub
		return haMerchantNotifyMapper.insertSelective(record);
	}

	@Override
	public List<HaMerchantNotify> selectByExampleWithBLOBs(HaMerchantNotifyExample example) {
		// TODO Auto-generated method stub
		return haMerchantNotifyMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<HaMerchantNotify> selectByExample(HaMerchantNotifyExample example) {
		// TODO Auto-generated method stub
		return haMerchantNotifyMapper.selectByExample(example);
	}

	@Override
	public HaMerchantNotify selectByPrimaryKey(Integer merchant_notify_id) {
		// TODO Auto-generated method stub
		return haMerchantNotifyMapper.selectByPrimaryKey(merchant_notify_id);
	}

	@Override
	public int updateByExampleSelective(HaMerchantNotify record, HaMerchantNotifyExample example) {
		// TODO Auto-generated method stub
		return haMerchantNotifyMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExampleWithBLOBs(HaMerchantNotify record, HaMerchantNotifyExample example) {
		// TODO Auto-generated method stub
		return haMerchantNotifyMapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(HaMerchantNotify record, HaMerchantNotifyExample example) {
		// TODO Auto-generated method stub
		return haMerchantNotifyMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(HaMerchantNotify record) {
		// TODO Auto-generated method stub
		return haMerchantNotifyMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(HaMerchantNotify record) {
		// TODO Auto-generated method stub
		return haMerchantNotifyMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(HaMerchantNotify record) {
		// TODO Auto-generated method stub
		return haMerchantNotifyMapper.updateByPrimaryKey(record);
	}
	
}
