package com.pragpooling.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.*;

@Data
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
public class UserRqDTO extends PersonRqDTO {

	@NotBlank(message = "email is mandatory")
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}",
			message = "Please enter a valid e-mail address")
	private String email;

	@NotBlank(message = "password is mandatory")
	@Size(min = 8, max = 15,
			message = "About Me must be between 8 and 15 characters")
	private String password;
}
