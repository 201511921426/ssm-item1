package com.vip.items.mapper;

import com.vip.items.domain.entity.Category;

import java.util.List;

public interface CategoryMapper {
		List<Category> findAll();

		List<Category> findProjevt();
}