package com.shtel.test.hello.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.shtel.test.hello.entity.OfferLabble;
import com.shtel.test.hello.entity.OfferLabbleExample;
import com.shtel.test.hello.entity.OfferLabbleExample.Criteria;
import com.shtel.test.hello.mapper.OfferLabbleMapper;
import com.shtel.test.hello.service.OfferLabbleService;

@Service
public class OfferLabbleServiceImpl implements OfferLabbleService{

	@Autowired
	private OfferLabbleMapper offerlabbleMapper;
	
	public int addLabble(OfferLabble labble) {
		offerlabbleMapper.insertSelective(labble);
		System.out.println(labble.getId());
		return labble.getId();
	}

	public OfferLabble queryOfferLabbleByCode(String code) {
		OfferLabbleExample example = new OfferLabbleExample();
		Criteria criteria = example.createCriteria();
		criteria.andCodeEqualTo(code);
		List<OfferLabble> list = offerlabbleMapper.selectByExample(example);
		return list.get(0);
	}

}
