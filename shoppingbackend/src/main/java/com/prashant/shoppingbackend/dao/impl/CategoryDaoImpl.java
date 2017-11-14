package com.prashant.shoppingbackend.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.prashant.shoppingbackend.dao.CategoryDao;
import com.prashant.shoppingbackend.dto.Category;
@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao{
    private static List<Category> categories = new ArrayList<>();
    static {
    	Category category = new Category();
    	category.setId(1);
    	category.setName("Mobile");
    	category.setDescription("This is Mobile description");
    	category.setImageUrl("CAT_1.png");
    	categories.add(category);
    	category = new Category();
    	category.setId(2);
    	category.setName("Television");
    	category.setDescription("This is Television description");
    	category.setImageUrl("CAT_2.png");
    	categories.add(category);
    	category = new Category();
    	category.setId(3);
    	category.setName("Laptop");
    	category.setDescription("This is Laptop description");
    	category.setImageUrl("CAT_3.png");
    	categories.add(category);
    	category = new Category();
    	category.setId(4);
    	category.setName("Freez");
    	category.setDescription("This is Freez description");
    	category.setImageUrl("CAT_4.png");
    	categories.add(category);
    }
	@Override
	public List<Category> list() {
		
		return categories;
	}
	@Override
	public Category get(int id) {
		for (Category category : categories) {
			if (category.getId() == id) {
				return category;
			}
		}
		return null;
	}

}
