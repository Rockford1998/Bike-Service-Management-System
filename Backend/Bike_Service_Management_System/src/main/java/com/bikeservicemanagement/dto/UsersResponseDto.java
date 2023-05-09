package com.bikeservicemanagement.dto;

import java.util.List;

import com.bikeservicemanagement.entity.User;

import lombok.Data;

@Data
public class UsersResponseDto extends CommanApiResponse {
	
	private List<User> users;
	
	private User user;

}