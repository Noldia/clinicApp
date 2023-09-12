package com.utp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.utp.model.Recipe;
import com.utp.repository.RecipeRepository;

@Service
public class RecipeService {

	private final RecipeRepository recipeRepository;

	@Autowired
	public RecipeService(RecipeRepository recipeRepository) {
		this.recipeRepository = recipeRepository;
	}
	
	@Transactional
	public Recipe saveRecipe(Recipe recipe) {
		return recipeRepository.save(recipe);
	}
	
}
