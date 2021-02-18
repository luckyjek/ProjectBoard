package org.zerock.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class SampleDTO {
	
	@NonNull
	private String name;
	private int age;
	
	
}
