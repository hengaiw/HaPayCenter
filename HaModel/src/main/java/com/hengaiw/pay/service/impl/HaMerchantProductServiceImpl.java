package com.hengaiw.pay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hengaiw.pay.model.dao.mapper.HaMerchantProductMapper;
import com.hengaiw.pay.model.dao.model.HaMerchantProduct;
import com.hengaiw.pay.model.dao.model.HaMerchantProductExample;
import com.hengaiw.pay.model.dao.model.HaMerchantProductExample.Criteria;
import com.hengaiw.pay.service.HaMerchantProductService;

@Service
public class HaMerchantProductServiceImpl implements HaMerchantProductService{

	@Autowired
	private HaMerchantProductMapper haMerchantProductMapper;

	@Override
	public long countByExample(HaMerchantProductExample example) {
		// TODO Auto-generated method stub
		return haMerchantProductMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(HaMerchantProductExample example) {
		// TODO Auto-generated method stub
		return haMerchantProductMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer merchant_product_id) {
		// TODO Auto-generated method stub
		return haMerchantProductMapper.deleteByPrimaryKey(merchant_product_id);
	}

	@Override
	public int insert(HaMerchantProduct record) {
		// TODO Auto-generated method stub
		return haMerchantProductMapper.insert(record);
	}

	@Override
	public int insertSelective(HaMerchantProduct record) {
		// TODO Auto-generated method stub
		return haMerchantProductMapper.insertSelective(record);
	}

	@Override
	public List<HaMerchantProduct> selectByExample(HaMerchantProductExample example) {
		// TODO Auto-generated method stub
		
		return haMerchantProductMapper.selectByExample(example);
	}

	@Override
	public HaMerchantProduct selectByPrimaryKey(Integer merchant_product_id) {
		// TODO Auto-generated method stub
		return haMerchantProductMapper.selectByPrimaryKey(merchant_product_id);
	}

	@Override
	public int updateByExampleSelective(HaMerchantProduct record, HaMerchantProductExample example) {
		// TODO Auto-generated method stub
		return haMerchantProductMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(HaMerchantProduct record, HaMerchantProductExample example) {
		// TODO Auto-generated method stub
		return haMerchantProductMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(HaMerchantProduct record) {
		// TODO Auto-generated method stub
		return haMerchantProductMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(HaMerchantProduct record) {
		// TODO Auto-generated method stub
		return haMerchantProductMapper.updateByPrimaryKey(record);
	}

	@Override
	public void setCriteria(Criteria criteria, HaMerchantProduct record) {
		// TODO Auto-generated method stub
		if (record != null) {
			if(record.getMerchant_id()!=null && record.getMerchant_id()>0) criteria.andMerchant_idEqualTo(record.getMerchant_id());
			if(record.getProduct_id()!=null && record.getProduct_id()>0) criteria.andProduct_idEqualTo(record.getProduct_id());
			if(record.getMerchant_no()!=null && record.getMerchant_no()!="") criteria.andMerchant_noEqualTo(record.getMerchant_no());
			if(record.getTrade_type_nickname()!=null && record.getTrade_type_nickname()!="") criteria.andTrade_type_nicknameEqualTo(record.getTrade_type_nickname());
			if(record.getProduct_status()!=null)criteria.andProduct_statusEqualTo(record.getProduct_status());
		}
	}

	@Override
	public List<HaMerchantProduct> selectByExamplePage(int offset, int limit, HaMerchantProduct record) {
		// TODO Auto-generated method stub
		HaMerchantProductExample example = new HaMerchantProductExample();
		example.setOrderByClause("merchant_rate asc");
		example.setOffset(offset);
		example.setLimit(limit);
		HaMerchantProductExample.Criteria criteria = example.createCriteria();
		setCriteria(criteria, record);
		return haMerchantProductMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public HaMerchantProduct selectByMerchantProduct(Integer merchant_id, Integer product_id) {
		// TODO Auto-generated method stub
		HaMerchantProduct record=new HaMerchantProduct();
		record.setMerchant_id(merchant_id);
		record.setProduct_id(product_id);
		List<HaMerchantProduct> list=selectByExamplePage(0,1,record);
		if (list.size()>0) return list.get(0);
		return null;
	}
	

}
