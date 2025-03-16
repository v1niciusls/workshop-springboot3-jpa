package com.viniciusls.course.services;


import com.viniciusls.course.entities.Category;
import com.viniciusls.course.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
public class CategoryService {


    @Autowired
    private CategoryRepository categoryRepository;


    public List<Category> findall(){
        return categoryRepository.findAll();
    }

    public Category findById(Long id){
        Optional<Category> obj = categoryRepository.findById(id);
        return obj.get();
    }

}
