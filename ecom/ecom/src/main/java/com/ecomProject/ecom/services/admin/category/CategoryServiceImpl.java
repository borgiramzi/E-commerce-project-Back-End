package com.ecomProject.ecom.services.admin.category;

import org.springframework.stereotype.Service;

import com.ecomProject.ecom.dto.CategoryDto;
import com.ecomProject.ecom.entity.Category;
import com.ecomProject.ecom.repository.CategoryRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService  {

    private final CategoryRepository categoryRepository;

    public Category createcategory(CategoryDto categoryDto){
        Category category = new Category();
        category.setName(categoryDto.getName());
        category.setDescription(categoryDto.getDescription());

        return categoryRepository.save(category);
    }
}
