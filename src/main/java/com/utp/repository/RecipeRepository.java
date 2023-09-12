package com.utp.repository;

import org.springframework.data.repository.CrudRepository;

import com.utp.model.Recipe;

public interface RecipeRepository extends CrudRepository<Recipe, Long> {

}
