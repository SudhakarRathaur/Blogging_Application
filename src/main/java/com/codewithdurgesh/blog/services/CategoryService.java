package com.codewithdurgesh.blog.services;

import java.util.List;

import com.codewithdurgesh.blog.payloads.CategoryDto;

public interface CategoryService {
	
	//Create
	public CategoryDto createCategory(CategoryDto categorydto);
	
	//Update
	public CategoryDto updateCategory(CategoryDto categorydto, Integer CategoryId);
	
	//Delete
	public void deleteCategory(Integer CategoryId);
	
	//Get
	public CategoryDto getCategory(Integer CategoryId);
	
	//Get All
	public List<CategoryDto> getCategories();
	
}
