package com.shtel.test.hello.service;

import java.util.List;

import com.shtel.test.hello.entity.OfferDimension;

public interface OfferDimensionService {

	public void addLabble(OfferDimension dim);

	public List<OfferDimension> queryOfferDimensionByLabbleId(Integer id);

}
