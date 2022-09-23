package com.pragpooling.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserModel extends  PersonModel {
	
	private Long idUser;

	private String email;

	private String password;

}
