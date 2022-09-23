package com.pragpooling.jpa.entity.usermodel;


import java.util.List;

import com.pragpooling.gateway.IUserModelGateway;
import com.pragpooling.helpers.mapper.ObjectMapperUtils;
import com.pragpooling.model.UserModel;
import org.springframework.stereotype.Component;
import lombok.RequiredArgsConstructor;


@Component
@RequiredArgsConstructor
public class UserModelOperationJPA implements IUserModelGateway {

	private final IUserModelRepositoryJPA iUserModelRepositoryJPA;


	@Override
	public UserModel saveUserModel(UserModel userModel) {

		UserModelEntityJPA userModelRequestJPA =  ObjectMapperUtils.map(userModel, UserModelEntityJPA.class);
		UserModelEntityJPA userModelEntityJPA = iUserModelRepositoryJPA.save(userModelRequestJPA);
		return ObjectMapperUtils.map(userModelEntityJPA, UserModel.class);

	}

	@Override
	public List<UserModel> findAllUserModel() {
		List<UserModelEntityJPA> listUserModelDataJPA = (List<UserModelEntityJPA>) iUserModelRepositoryJPA.findAll();
		return ObjectMapperUtils.mapAll(listUserModelDataJPA, UserModel.class);
	}
}
