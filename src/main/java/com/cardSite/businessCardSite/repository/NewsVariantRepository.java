package com.cardSite.businessCardSite.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cardSite.businessCardSite.entity.NewsVariant;

@Repository
public interface NewsVariantRepository extends  JpaRepository<NewsVariant, Long>{
	
}
