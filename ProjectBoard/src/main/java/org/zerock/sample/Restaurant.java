package org.zerock.sample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Setter;

@Component
@Data
public class Restaurant {
	
	@Setter(onMethod_ = @Autowired)
	private Chef chef;
	
//	@Autowired
//	private Chef chef1;
//	
//	public void setChef1(Chef chef1) {
//		this.chef1 = chef1;
//	}
}
