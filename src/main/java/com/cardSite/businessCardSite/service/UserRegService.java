package com.cardSite.businessCardSite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardSite.businessCardSite.entity.UserReg;
import com.cardSite.businessCardSite.repository.UserRegRepository;

@Service
public class UserRegService extends CrudImpl<UserReg> {
	public UserRegRepository repository;

	@Autowired
	public UserRegService(UserRegRepository repository) {
		super(repository);
		this.repository = repository;
	}
}
