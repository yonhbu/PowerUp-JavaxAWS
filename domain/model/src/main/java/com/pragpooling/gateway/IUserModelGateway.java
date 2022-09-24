package com.pragpooling.gateway;

import java.util.List;
import com.pragpooling.model.UserModel;


public interface IUserModelGateway {

	UserModel saveUserModel (UserModel userModel);
	
	List<UserModel> findAllUserModel();


}
