package com.faiz.spring.shoppingbackends.dao;

import java.util.List;

import com.faiz.spring.shoppingbackends.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	
	Category get(int id);
	}

