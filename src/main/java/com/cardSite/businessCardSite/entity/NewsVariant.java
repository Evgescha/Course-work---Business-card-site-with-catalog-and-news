package com.cardSite.businessCardSite.entity;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Data;

@Entity
@Data
@Table
public class NewsVariant {
	@Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
	Long id;

	String urlToImage;
	
	Date dates;
	
	String title;
	
	@Column(length = 400)
	String text;
	
	
}
