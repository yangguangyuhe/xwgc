package com.shtel.test.hello.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shtel.test.hello.entity.OfferDimension;
import com.shtel.test.hello.entity.OfferDimensionExample;
import com.shtel.test.hello.entity.OfferDimensionExample.Criteria;
import com.shtel.test.hello.mapper.OfferDimensionMapper;
import com.shtel.test.hello.service.OfferDimensionService;

@Service(value="OfferDimensionService")
public class OfferDimensionServiceImpl implements OfferDimensionService {

	@Autowired
	private OfferDimensionMapper offerDimensionMapper;
	
	public void addLabble(OfferDimension dim) {
		
		offerDimensionMapper.insertSelective(dim);
	}

	public List<OfferDimension> queryOfferDimensionByLabbleId(Integer id) {
		OfferDimensionExample example = new OfferDimensionExample();
		Criteria criteria = example.createCriteria();
		criteria.andLabbleidEqualTo(id);
		example.setOrderByClause("number asc");
		return offerDimensionMapper.selectByExample(example);
	}

}
