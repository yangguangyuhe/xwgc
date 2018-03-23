package com.shtel.test.hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.shtel.test.hello.entity.OfferLabble;
import com.shtel.test.hello.service.OfferLabbleService;

@Controller
public class OfferLabbleController {

	@Autowired
	private OfferLabbleService offerLabbleService;
	
	@ResponseBody
    @RequestMapping(value = "/add")
    public int addUser(OfferLabble labble){
		
		labble = new OfferLabble();
		labble.setName("¶©µ¥");
		labble.setCode("dingdan");
		int result = offerLabbleService.addLabble(labble);
		System.out.println(labble.getId());
        return result;
    }
}
