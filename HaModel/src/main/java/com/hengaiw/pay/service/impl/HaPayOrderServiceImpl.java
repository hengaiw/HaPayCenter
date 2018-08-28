package com.hengaiw.pay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hengaiw.pay.model.dao.mapper.HaPayOrderMapper;
import com.hengaiw.pay.model.dao.model.HaPayOrder;
import com.hengaiw.pay.model.dao.model.HaPayOrderExample;
import com.hengaiw.pay.model.dao.model.HaPayOrderExample.Criteria;
import com.hengaiw.pay.service.HaPayOrderService;

@Service
public class HaPayOrderServiceImpl implements HaPayOrderService{

	@Autowired
	private HaPayOrderMapper haPayOrderMapper;

	@Override
	public long countByExample(HaPayOrderExample example) {
		// TODO Auto-generated method stub
		return haPayOrderMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(HaPayOrderExample example) {
		// TODO Auto-generated method stub
		return haPayOrderMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Long pay_order_id) {
		// TODO Auto-generated method stub
		return haPayOrderMapper.deleteByPrimaryKey(pay_order_id);
	}

	@Override
	public int insert(HaPayOrder record) {
		// TODO Auto-generated method stub
		return haPayOrderMapper.insert(record);
	}

	@Override
	public int insertSelective(HaPayOrder record) {
		// TODO Auto-generated method stub
		return haPayOrderMapper.insertSelective(record);
	}

	@Override
	public List<HaPayOrder> selectByExample(HaPayOrderExample example) {
		// TODO Auto-generated method stub
		return haPayOrderMapper.selectByExample(example);
	}

	@Override
	public HaPayOrder selectByPrimaryKey(Long pay_order_id) {
		// TODO Auto-generated method stub
		return haPayOrderMapper.selectByPrimaryKey(pay_order_id);
	}

	@Override
	public int updateByExampleSelective(HaPayOrder record, HaPayOrderExample example) {
		// TODO Auto-generated method stub
		return haPayOrderMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(HaPayOrder record, HaPayOrderExample example) {
		// TODO Auto-generated method stub
		return haPayOrderMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(HaPayOrder record) {
		// TODO Auto-generated method stub
		return haPayOrderMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(HaPayOrder record) {
		// TODO Auto-generated method stub
		return haPayOrderMapper.updateByPrimaryKey(record);
	}

	@Override
	public HaPayOrder selectByOrderSn(String pay_order_sn) {
		// TODO Auto-generated method stub
		HaPayOrder payOrder=new HaPayOrder();
		payOrder.setPay_order_sn(pay_order_sn);
		List<HaPayOrder> list=selectByExamplePage(0,1,payOrder);
		if(list.size()>0) return list.get(0);
		return null;
	}

	@Override
	public void setCriteria(Criteria criteria, HaPayOrder record) {
		// TODO Auto-generated method stub
		if (record != null) {
			if(record.getMerchant_id()!=null && record.getMerchant_id()>0) criteria.andMerchant_idEqualTo(record.getMerchant_id());
			if(record.getPay_order_sn()!=null && record.getPay_order_sn()!="") criteria.andPay_order_snEqualTo(record.getPay_order_sn());
			if(record.getMerchant_order_no()!=null && record.getMerchant_order_no()!="") criteria.andMerchant_order_noEqualTo(record.getMerchant_order_no());
		}
	}

	@Override
	public List<HaPayOrder> selectByExamplePage(int offset, int limit, HaPayOrder record) {
		// TODO Auto-generated method stub
		HaPayOrderExample example = new HaPayOrderExample();
		example.setOrderByClause("pay_order_id asc");
		example.setOffset(offset);
		example.setLimit(limit);
		Criteria criteria = example.createCriteria();
		setCriteria(criteria, record);
		return haPayOrderMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public HaPayOrder selectByMerchantOrderNo(String merchant_order_no) {
		// TODO Auto-generated method stub
		HaPayOrder payOrder=new HaPayOrder();
		payOrder.setMerchant_order_no(merchant_order_no);
		List<HaPayOrder> list=selectByExamplePage(0,1,payOrder);
		if(list.size()>0) return list.get(0);
		return null;
	}

	

}
