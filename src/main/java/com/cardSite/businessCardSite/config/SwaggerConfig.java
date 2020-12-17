package com.cardSite.businessCardSite.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class SwaggerConfig extends WebMvcConfigurationSupport {


    @Override
    protected void addResourceHandlers(ResourceHandlerRegistry registry) {
    	  registry.addResourceHandler("/css/**").addResourceLocations("classpath:/static/css/");
    	  registry.addResourceHandler("/js/**").addResourceLocations("classpath:/static/js/");
    	  registry.addResourceHandler("/img/**").addResourceLocations("classpath:/static/img/");
    	  registry.addResourceHandler("/fonts/**").addResourceLocations("classpath:/static/fonts/");
    	  registry.addResourceHandler("/scss/**").addResourceLocations("classpath:/static/scss/");
    	  registry.addResourceHandler("/vendors/**").addResourceLocations("classpath:/static/vendors/");
    	  
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/login").setViewName("login");
    }
}