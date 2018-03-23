package com.shtel.test.hello.service;

import org.springframework.stereotype.Service;

import com.shtel.test.hello.entity.OfferLabble;


public interface OfferLabbleService {

	public int addLabble(OfferLabble labble);

	public OfferLabble queryOfferLabbleByCode(String code);

}
