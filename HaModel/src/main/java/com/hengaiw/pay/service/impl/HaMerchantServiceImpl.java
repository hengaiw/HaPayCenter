package com.hengaiw.pay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hengaiw.pay.model.dao.mapper.HaMerchantMapper;
import com.hengaiw.pay.model.dao.model.HaMerchant;
import com.hengaiw.pay.model.dao.model.HaMerchantExample;
import com.hengaiw.pay.model.dao.model.HaMerchantProduct;
import com.hengaiw.pay.model.dao.model.HaMerchantExample.Criteria;
import com.hengaiw.pay.service.HaMerchantService;

@Service
public class HaMerchantServiceImpl implements HaMerchantService{

	@Autowired
	private HaMerchantMapper haMerchantMapper;
	@Override
	public long countByExample(HaMerchantExample example) {
		// TODO Auto-generated method stub
		return haMerchantMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(HaMerchantExample example) {
		// TODO Auto-generated method stub
		return haMerchantMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer merchant_id) {
		// TODO Auto-generated method stub
		return haMerchantMapper.deleteByPrimaryKey(merchant_id);
	}

	@Override
	public int insert(HaMerchant record) {
		// TODO Auto-generated method stub
		return haMerchantMapper.insert(record);
	}

	@Override
	public int insertSelective(HaMerchant record) {
		// TODO Auto-generated method stub
		return haMerchantMapper.insertSelective(record);
	}

	@Override
	public List<HaMerchant> selectByExampleWithBLOBs(HaMerchantExample example) {
		// TODO Auto-generated method stub
		return haMerchantMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public List<HaMerchant> selectByExample(HaMerchantExample example) {
		// TODO Auto-generated method stub
		return haMerchantMapper.selectByExample(example);
	}

	@Override
	public HaMerchant selectByPrimaryKey(Integer merchant_id) {
		// TODO Auto-generated method stub
		return haMerchantMapper.selectByPrimaryKey(merchant_id);
	}

	@Override
	public int updateByExampleSelective(HaMerchant record, HaMerchantExample example) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByExampleWithBLOBs(HaMerchant record, HaMerchantExample example) {
		// TODO Auto-generated method stub
		return haMerchantMapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByExample(HaMerchant record, HaMerchantExample example) {
		// TODO Auto-generated method stub
		return haMerchantMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(HaMerchant record) {
		// TODO Auto-generated method stub
		return haMerchantMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(HaMerchant record) {
		// TODO Auto-generated method stub
		return haMerchantMapper.updateByPrimaryKeyWithBLOBs(record);
	}

	@Override
	public int updateByPrimaryKey(HaMerchant record) {
		// TODO Auto-generated method stub
		return haMerchantMapper.updateByPrimaryKey(record);
	}

	@Override
	public void setCriteria(Criteria criteria, HaMerchant record) {
		// TODO Auto-generated method stub
		if(record!=null) {
			if(record.getMerchant_no()!="" && record.getMerchant_no()!=null) criteria.andMerchant_noEqualTo(record.getMerchant_no());
		}
	}

	@Override
	public List<HaMerchant> selectByExamplePage(int offset, int limit, HaMerchant record) {
		// TODO Auto-generated method stub
		HaMerchantExample example=new HaMerchantExample();
		example.setOrderByClause("merchant_id DESC");
		example.setOffset(offset);
		example.setLimit(limit);
		Criteria criteria=example.createCriteria();
		setCriteria(criteria,record);
		return haMerchantMapper.selectByExample(example);
	}

	@Override
	public HaMerchant findByMerchantNo(String merchant_no) {
		// TODO Auto-generated method stub
		HaMerchantExample example=new HaMerchantExample();
		example.setOrderByClause("merchant_id DESC");
		example.setOffset(0);
		example.setLimit(1);
		Criteria criteria=example.createCriteria();
		if(merchant_no!="") criteria.andMerchant_noEqualTo(merchant_no);
		List<HaMerchant> list=haMerchantMapper.selectByExample(example);
		if(list.size()>0) {
			return list.get(0);
		}else {
			return null;
		}
		
	}

	@Override
	public long countByRecord(HaMerchant record) {
		// TODO Auto-generated method stub
		HaMerchantExample example=new HaMerchantExample();
		Criteria criteria=example.createCriteria();
		setCriteria(criteria,record);
		return haMerchantMapper.countByExample(example);
	}

}
