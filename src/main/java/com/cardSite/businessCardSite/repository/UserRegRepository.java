package com.cardSite.businessCardSite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cardSite.businessCardSite.entity.UserReg;

@Repository
public interface UserRegRepository extends  JpaRepository<UserReg, Long>{
	
}
