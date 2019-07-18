package com.zhwxp.sample.spring.boot.tcp.server.service;
import java.util.List;

import com.zhwxp.sample.spring.boot.tcp.server.entity.*;


public interface ILcserverService {
	List<Lcserver> getAll();
	Lcserver getByChannel(String channel);
	
}
