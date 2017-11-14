package com.prashant.shoppingbackend.dao;

import java.util.List;

import com.prashant.shoppingbackend.dto.Category;

public interface CategoryDao {
     List<Category> list();

	Category get(int id);
}
