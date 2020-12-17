package com.cardSite.businessCardSite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardSite.businessCardSite.entity.NewsVariant;
import com.cardSite.businessCardSite.repository.NewsVariantRepository;
//сервис для работы со страницами
@Service
public class NewsVariantService extends CrudImpl<NewsVariant> {
	public NewsVariantRepository repository;

	@Autowired
	public NewsVariantService(NewsVariantRepository repository) {
		super(repository);
		this.repository = repository;
	}
}
