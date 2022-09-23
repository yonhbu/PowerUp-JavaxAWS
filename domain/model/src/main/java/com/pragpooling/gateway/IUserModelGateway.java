package com.pragpooling.gateway;

import java.util.List;
import com.pragpooling.model.UserModel;


public interface IUserModelGateway {

	public UserModel saveUserModel (UserModel userModel);
	
	public List<UserModel> findAllUserModel();


}
