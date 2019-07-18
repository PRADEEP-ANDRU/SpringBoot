package com.zhwxp.sample.spring.boot.tcp.server.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="test")
public class Lcserver {

	@Column(name="channel")
	private String channel;
	
	@Column(name="max_tps")
	private int max_tps;

	
	public String getChannel() {
		return channel;
	}

	public int getMax_tps() {
		return max_tps;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public void setMax_tps(int max_tps) {
		this.max_tps = max_tps;
	}
	
	
	
}
