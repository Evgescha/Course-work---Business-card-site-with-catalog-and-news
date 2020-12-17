package com.cardSite.businessCardSite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cardSite.businessCardSite.entity.TrendVariant;

@Repository
public interface TrendVariantRepository extends  JpaRepository<TrendVariant, Long>{
	
}
