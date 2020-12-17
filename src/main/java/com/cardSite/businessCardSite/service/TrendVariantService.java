package com.cardSite.businessCardSite.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardSite.businessCardSite.entity.TrendVariant;
import com.cardSite.businessCardSite.repository.TrendVariantRepository;
//сервис для работы со страницами
@Service
public class TrendVariantService extends CrudImpl<TrendVariant> {
	public TrendVariantRepository repository;

	@Autowired
	public TrendVariantService(TrendVariantRepository repository) {
		super(repository);
		this.repository = repository;
	}
}
