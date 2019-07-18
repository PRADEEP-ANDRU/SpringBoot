package com.zhwxp.sample.spring.boot.tcp.server.client;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.zhwxp.sample.spring.boot.tcp.server.entity.Lcserver;

public class TestClientA {
	
	 public void getByChannelDemo() {
	    	HttpHeaders headers = new HttpHeaders();
	    	headers.setContentType(MediaType.APPLICATION_JSON);
	        RestTemplate restTemplate = new RestTemplate();
		String url = "http://localhost:8080/user/test/{channel}";
	        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
	        ResponseEntity<Lcserver> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity,Lcserver.class, 1);
	        Lcserver lcserver = responseEntity.getBody();
	        System.out.println("Channel:"+lcserver.getChannel());
	        System.out.println("Max_tps:"+lcserver.getMax_tps());
	    }
	 
	 public void getAllDemo() {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
		    RestTemplate restTemplate = new RestTemplate();
			String url = "http://localhost:8080/user/test";
		        HttpEntity<String> requestEntity = new HttpEntity<String>(headers);
		        ResponseEntity<Lcserver[]> responseEntity = restTemplate.exchange(url, HttpMethod.GET, requestEntity, Lcserver[].class);
		        Lcserver[] lcservers = responseEntity.getBody();
		        for(Lcserver lcserver : lcservers) {
		              System.out.println("Channel:"+lcserver.getChannel());
		              System.out.println("Max_tps:"+lcserver.getMax_tps());
		        }
		    }
	 
	 public static void main(String args[]) {
	    	TestClientA util = new TestClientA();
	        util.getByChannelDemo();
	    	util.getAllDemo();
	    	//util.addArticleDemo();
	    	//util.updateArticleDemo();
	    	//util.deleteArticleDemo();
	    } 
}
