package com.multicampus.biz.user;

import lombok.Data;

// 1. VO Ŭ����
@Data
public class UserVO {
	private String id;
	private String password;
	private String name;
	private String role;
}
