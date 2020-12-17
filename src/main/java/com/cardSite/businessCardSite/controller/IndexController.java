package com.cardSite.businessCardSite.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cardSite.businessCardSite.entity.NewsVariant;
import com.cardSite.businessCardSite.entity.TrendVariant;
import com.cardSite.businessCardSite.entity.UserReg;
import com.cardSite.businessCardSite.service.NewsVariantService;
import com.cardSite.businessCardSite.service.TrendVariantService;
import com.cardSite.businessCardSite.service.UserRegService;

@Controller
@RequestMapping(path = { "/", "/index" })
public class IndexController {


	@Autowired
	NewsVariantService serviceNewsVariant;

	@Autowired
	TrendVariantService serviceTrendVariant;
	
	
	@GetMapping
	String getIndex(Model model) {
		List<NewsVariant> listNews = serviceNewsVariant.repository.findAll();
		List<TrendVariant> listTrend = serviceTrendVariant.repository.findAll();
		model.addAttribute("listNews", listNews);
		model.addAttribute("listTrend", listTrend);
		
		return "index";
	}
	
	
	
}
