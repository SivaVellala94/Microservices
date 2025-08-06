package com.springcloud.microservices.limits_service.Bean;

public class Limits {
	
	private int limits_min;
	private int limits_max;
	
	public Limits(int limits_min, int limits_max) {
		super();
		this.limits_min = limits_min;
		this.limits_max = limits_max;
	}

	public int getLimits_min() {
		return limits_min;
	}

	public void setLimits_min(int limits_min) {
		this.limits_min = limits_min;
	}

	public int getLimits_max() {
		return limits_max;
	}

	public void setLimits_max(int limits_max) {
		this.limits_max = limits_max;
	}
	

}
