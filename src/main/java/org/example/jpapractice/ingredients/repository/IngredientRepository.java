package org.example.jpapractice.ingredients.repository;

import org.example.jpapractice.ingredients.model.Ingredient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientRepository extends JpaRepository<Ingredient,Integer> {
}
