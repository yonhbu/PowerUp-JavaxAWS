package com.pragpooling.jpa.entity.usermodel;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IUserModelRepositoryJPA extends CrudRepository<UserModelEntityJPA, Long> {

		
}
