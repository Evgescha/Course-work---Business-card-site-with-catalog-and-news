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
import com.cardSite.businessCardSite.service.NewsVariantService;
import com.cardSite.businessCardSite.service.TrendVariantService;

@Controller
@RequestMapping("/admin")

public class AdminController {

	@Autowired
	NewsVariantService serviceNewsVariant;

	@Autowired
	TrendVariantService serviceTrendVariant;

	@GetMapping
	String getAdminList(Model model) {
		List<NewsVariant> listNews = serviceNewsVariant.repository.findAll();
		List<TrendVariant> listTrend = serviceTrendVariant.repository.findAll();
		model.addAttribute("listNews", listNews);
		model.addAttribute("listTrend", listTrend);
		return "admin";
	}

	@GetMapping
	@RequestMapping(path = { "/trend/edit", "/trend/edit/{id}" })
	public String getAllTrendById(Model model, @PathVariable(name = "id", required = false) Long id) {
		if (id != null) {
			TrendVariant read = serviceTrendVariant.read(id);
			model.addAttribute("id", read.getId());
			model.addAttribute("entity", read);
		} else {
			TrendVariant entity = new TrendVariant();
			model.addAttribute("id", -1);
			model.addAttribute("entity", entity);
		}
		return "trend-add-edit";
	}

	@GetMapping
	@RequestMapping(path = { "/news/edit", "/news/edit/{id}" })
	public String getAllNewsById(Model model, @PathVariable(name = "id", required = false) Long id) {
		if (id != null) {
			NewsVariant read = serviceNewsVariant.read(id);
			model.addAttribute("id", read.getId());
			model.addAttribute("entity", read);
		} else {
			NewsVariant entity = new NewsVariant();
			model.addAttribute("id", -1);
			model.addAttribute("entity", entity);
		}
		return "news-add-edit";
	}

	@PostMapping
	@RequestMapping("/trend/create")
	public String saveTrend(Model model, TrendVariant entity) throws Exception {
		serviceTrendVariant.create(entity);
		return "redirect:/admin";
	}

	
	@PostMapping
	@RequestMapping("/news/create")
	public String saveNews(Model model, NewsVariant entity) throws Exception {
		serviceNewsVariant.create(entity);
		return "redirect:/admin";
	}

	@PostMapping
	@RequestMapping(path = "/trend/delete/{id}")
	public String deleteTrend(Model model, @PathVariable("id") Long id) throws Exception {
		serviceTrendVariant.delete(id);
		return "redirect:/admin";
	}
	
	@PostMapping
	@RequestMapping(path = "/news/delete/{id}")
	public String deleteNews(Model model, @PathVariable("id") Long id) throws Exception {
		serviceNewsVariant.delete(id);
		return "redirect:/admin";
	}

	
}
