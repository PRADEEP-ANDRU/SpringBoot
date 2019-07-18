package com.zhwxp.sample.spring.boot.tcp.server.dao;
import java.util.List;

import com.zhwxp.sample.spring.boot.tcp.server.entity.*;
public interface ILcserverDAO {
	
	List<Lcserver> getAll();
	Lcserver getByChannel(String channel);
}
