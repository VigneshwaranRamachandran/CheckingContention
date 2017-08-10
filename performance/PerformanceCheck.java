package com.softwareag.performance;

import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

import org.elasticsearch.client.Response;

public class PerformanceCheck {
	private Date d1,d2;
	private Response response;
	private Thread t;
	private AtomicInteger aI;
	
	
	public AtomicInteger getaI() {
		return aI;
	}
	public void setaI(AtomicInteger aI) {
		this.aI = aI;
	}
	public Date getD1() {
		return d1;
	}
	public void setD1(Date d1) {
		this.d1 = d1;
	}
	public Date getD2() {
		return d2;
	}
	public void setD2(Date d2) {
		this.d2 = d2;
	}
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	public Thread getT() {
		return t;
	}
	public void setT(Thread t) {
		this.t = t;
	}
	
}
