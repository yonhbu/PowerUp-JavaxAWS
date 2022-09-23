package com.pragpooling.usecase.user;

import com.pragpooling.dto.request.UserRqDTO;
import com.pragpooling.dto.response.UserRsDTO;
import com.pragpooling.gateway.IUserModelGateway;
import com.pragpooling.model.UserModel;
import com.pragpooling.usecase.util.ObjectMapperUtils;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class UserModelUseCase {

	private final IUserModelGateway iUserGateway;


	public UserRsDTO saveUserModel (UserRqDTO userRqDTO) {
		UserModel userModel = ObjectMapperUtils.map(userRqDTO, UserModel.class);
		UserModel user = iUserGateway.saveUserModel(userModel);
		return ObjectMapperUtils.map(user, UserRsDTO.class);
	}


	public List<UserRsDTO> getAllUserModel () {
		List<UserModel> listUsers = iUserGateway.findAllUserModel();
		return  ObjectMapperUtils.mapAll(listUsers, UserRsDTO.class);
	}


}
