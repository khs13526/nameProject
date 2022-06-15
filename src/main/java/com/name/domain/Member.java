package com.name.domain;

import org.apache.ibatis.type.Alias;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Alias("Member")
@Getter
@Setter
public class Member {
	
	private Long idx;
	private String name;
	
	
}
