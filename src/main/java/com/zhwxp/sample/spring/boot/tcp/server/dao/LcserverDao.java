package com.zhwxp.sample.spring.boot.tcp.server.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.zhwxp.sample.spring.boot.tcp.server.entity.Lcserver;

public class LcserverDao implements ILcserverDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Lcserver> getAll() {
		String hql="FROM test";
		return (List<Lcserver>)entityManager.createQuery(hql).getResultList();
	}

	@Override
	public Lcserver getByChannel(String channel) {
		return entityManager.find(Lcserver.class, channel);
	}

}
