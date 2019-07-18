package com.zhwxp.sample.spring.boot.tcp.server.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.zhwxp.sample.spring.boot.tcp.server.dao.ILcserverDAO;
import com.zhwxp.sample.spring.boot.tcp.server.entity.Lcserver;

public class LcserverService implements ILcserverService {
	@Autowired
	private ILcserverDAO lcserverDAO;

	@Override
	public List<Lcserver> getAll() {
		return lcserverDAO.getAll();
	}

	@Override
	public Lcserver getByChannel(String channel) {
		Lcserver obj=lcserverDAO.getByChannel(channel);
		return obj;
		
	}
	
	
	
}
