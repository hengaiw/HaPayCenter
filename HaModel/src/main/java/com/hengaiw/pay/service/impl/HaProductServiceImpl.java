package com.hengaiw.pay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hengaiw.pay.model.dao.mapper.HaProductMapper;
import com.hengaiw.pay.model.dao.model.HaProduct;
import com.hengaiw.pay.model.dao.model.HaProductExample;
import com.hengaiw.pay.service.HaProductService;

@Service
public class HaProductServiceImpl implements HaProductService{

	@Autowired
	private HaProductMapper haProductMapper;

	@Override
	public long countByExample(HaProductExample example) {
		// TODO Auto-generated method stub
		return haProductMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(HaProductExample example) {
		// TODO Auto-generated method stub
		return haProductMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer merchant_product_id) {
		// TODO Auto-generated method stub
		return haProductMapper.deleteByPrimaryKey(merchant_product_id);
	}

	@Override
	public int insert(HaProduct record) {
		// TODO Auto-generated method stub
		return haProductMapper.insert(record);
	}

	@Override
	public int insertSelective(HaProduct record) {
		// TODO Auto-generated method stub
		return haProductMapper.insertSelective(record);
	}

	@Override
	public List<HaProduct> selectByExample(HaProductExample example) {
		// TODO Auto-generated method stub
		
		return haProductMapper.selectByExample(example);
	}

	@Override
	public HaProduct selectByPrimaryKey(Integer merchant_product_id) {
		// TODO Auto-generated method stub
		return haProductMapper.selectByPrimaryKey(merchant_product_id);
	}

	@Override
	public int updateByExampleSelective(HaProduct record, HaProductExample example) {
		// TODO Auto-generated method stub
		return haProductMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(HaProduct record, HaProductExample example) {
		// TODO Auto-generated method stub
		return haProductMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(HaProduct record) {
		// TODO Auto-generated method stub
		return haProductMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(HaProduct record) {
		// TODO Auto-generated method stub
		return haProductMapper.updateByPrimaryKey(record);
	}

	@Override
	public List<HaProduct> selectByExampleWithBLOBs(HaProductExample example) {
		// TODO Auto-generated method stub
		return haProductMapper.selectByExampleWithBLOBs(example);
	}

	@Override
	public int updateByExampleWithBLOBs(HaProduct record, HaProductExample example) {
		// TODO Auto-generated method stub
		return haProductMapper.updateByExampleWithBLOBs(record, example);
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(HaProduct record) {
		// TODO Auto-generated method stub
		return haProductMapper.updateByPrimaryKeyWithBLOBs(record)
				;
	}

	
	

}
