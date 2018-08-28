package com.hengaiw.pay.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hengaiw.pay.model.dao.mapper.HaAgentProductMapper;
import com.hengaiw.pay.model.dao.model.HaAgentProduct;
import com.hengaiw.pay.model.dao.model.HaAgentProductExample;
import com.hengaiw.pay.model.dao.model.HaAgentProductExample.Criteria;
import com.hengaiw.pay.service.HaAgentProductService;

@Service
public class HaAgentProductServiceImpl implements HaAgentProductService{

	@Autowired
	private HaAgentProductMapper haAgentProductMapper;

	@Override
	public long countByExample(HaAgentProductExample example) {
		// TODO Auto-generated method stub
		return haAgentProductMapper.countByExample(example);
	}

	@Override
	public int deleteByExample(HaAgentProductExample example) {
		// TODO Auto-generated method stub
		return haAgentProductMapper.deleteByExample(example);
	}

	@Override
	public int deleteByPrimaryKey(Integer agent_product_id) {
		// TODO Auto-generated method stub
		return haAgentProductMapper.deleteByPrimaryKey(agent_product_id);
	}

	@Override
	public int insert(HaAgentProduct record) {
		// TODO Auto-generated method stub
		return haAgentProductMapper.insert(record);
	}

	@Override
	public int insertSelective(HaAgentProduct record) {
		// TODO Auto-generated method stub
		return haAgentProductMapper.insertSelective(record);
	}

	@Override
	public List<HaAgentProduct> selectByExample(HaAgentProductExample example) {
		// TODO Auto-generated method stub
		return haAgentProductMapper.selectByExample(example);
	}

	@Override
	public HaAgentProduct selectByPrimaryKey(Integer agent_product_id) {
		// TODO Auto-generated method stub
		return haAgentProductMapper.selectByPrimaryKey(agent_product_id);
	}

	@Override
	public int updateByExampleSelective(HaAgentProduct record, HaAgentProductExample example) {
		// TODO Auto-generated method stub
		return haAgentProductMapper.updateByExampleSelective(record, example);
	}

	@Override
	public int updateByExample(HaAgentProduct record, HaAgentProductExample example) {
		// TODO Auto-generated method stub
		return haAgentProductMapper.updateByExample(record, example);
	}

	@Override
	public int updateByPrimaryKeySelective(HaAgentProduct record) {
		// TODO Auto-generated method stub
		return haAgentProductMapper.updateByPrimaryKeySelective(record);
	}

	@Override
	public int updateByPrimaryKey(HaAgentProduct record) {
		// TODO Auto-generated method stub
		return haAgentProductMapper.updateByPrimaryKey(record);
	}

	@Override
	public void setCriteria(Criteria criteria, HaAgentProduct record) {
		// TODO Auto-generated method stub
		if (record != null) {
			if(record.getAgent_id()!=null && record.getAgent_id()>0) criteria.andAgent_idEqualTo(record.getAgent_id());
			if(record.getProduct_id()!=null && record.getProduct_id()>0) criteria.andProduct_idEqualTo(record.getProduct_id());
		}
	}

	@Override
	public List<HaAgentProduct> selectByExamplePage(int offset, int limit, HaAgentProduct record) {
		// TODO Auto-generated method stub
		HaAgentProductExample example = new HaAgentProductExample();
		example.setOrderByClause("agent_product_id desc");
		example.setOffset(offset);
		example.setLimit(limit);
		HaAgentProductExample.Criteria criteria = example.createCriteria();
		setCriteria(criteria, record);
		return haAgentProductMapper.selectByExample(example);
	}



	

}
