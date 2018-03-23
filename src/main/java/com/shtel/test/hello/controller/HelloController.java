package com.shtel.test.hello.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.shtel.test.hello.entity.OfferDimension;
import com.shtel.test.hello.entity.OfferLabble;
import com.shtel.test.hello.entity.OfferTem;
import com.shtel.test.hello.mapper.OfferLabbleMapper;
import com.shtel.test.hello.service.OfferDimensionService;
import com.shtel.test.hello.service.OfferLabbleService;


@Controller
public class HelloController {
	
	@Autowired
	private OfferDimensionService offerDimensionService;
	
	@Autowired
	private OfferLabbleService offerLabbleService;
	
	@RequestMapping("/")
	@ResponseBody
	public String hello(){
		return "heeol";
	}
	
	@RequestMapping("/create")
	@ResponseBody
	public String create(){
		
		int labbleid = 0;
		OfferTem tem = new OfferTem();
		tem.setName("神1");
		tem.setCode("DNS");
		List<String> list = new ArrayList<String>();
		list.add("2018");
		list.add("8433");
		tem.setList(list);

		if(tem!=null){
			if(!"".equals(tem.getCode())&&tem.getCode().length()>0){
				//查询数据库中是否有相同的code，
				OfferLabble offerLabble = offerLabbleService.queryOfferLabbleByCode(tem.getCode());
				if(offerLabble==null){
					//ֻ没有相同的code则保存到数据库中
					OfferLabble labble = new OfferLabble();
					labble.setName(tem.getName());
					labble.setCode(tem.getCode());
					labbleid = offerLabbleService.addLabble(labble);
				}else{
					return "有相同的code，不能保存";
				}
			}
			if(tem.getList().size()>0){ 
				for (int i = 0; i < tem.getList().size(); i++) {
					OfferDimension dim = new OfferDimension();
					String dimname = tem.getList().get(i);
					dim.setDimensionname(dimname);
					dim.setLabbleid(labbleid);
					dim.setNumber(i);
					offerDimensionService.addLabble(dim);
				}
			}
		}

		return "";
	}
	
	@RequestMapping("/prefix")
	@ResponseBody
	public String getPrefix(@RequestParam String code){
		//查询
		OfferLabble labble = offerLabbleService.queryOfferLabbleByCode(code);
		//查询
		List<OfferDimension> list = offerDimensionService.queryOfferDimensionByLabbleId(labble.getId());
		
		StringBuffer sbuffer = new StringBuffer(labble.getCode());
		
		for (OfferDimension offerDimension : list) {
			sbuffer.append(offerDimension.getDimensionname());
		}
		return sbuffer.toString();
	}
	
}
