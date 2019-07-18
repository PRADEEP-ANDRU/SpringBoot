package com.zhwxp.sample.spring.boot.tcp.server.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import com.zhwxp.sample.spring.boot.tcp.server.entity.*;
import com.zhwxp.sample.spring.boot.tcp.server.service.ILcserverService;

@Controller
@RequestMapping("user")
public class LcserverController {
	@Autowired
	private ILcserverService lcserverService;
	@GetMapping("test/{channel}")
	public ResponseEntity<Lcserver> getByChannel(@PathVariable("channel") String channel){
		Lcserver lcserver=lcserverService.getByChannel(channel);
		return new ResponseEntity<Lcserver>(lcserver,HttpStatus.OK);
		
	}
	@GetMapping("test")
	public ResponseEntity<List<Lcserver>> getAll(){
		List<Lcserver> lst=lcserverService.getAll();
		return new ResponseEntity<List<Lcserver>>(lst,HttpStatus.OK);
		
	}
}
