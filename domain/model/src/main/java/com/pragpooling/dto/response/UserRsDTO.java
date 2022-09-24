package com.pragpooling.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserRsDTO {

	private Long idUser;

	private String email;

	private String firstName;

	private String lastName;

	private String phone;

	private String address;

}
