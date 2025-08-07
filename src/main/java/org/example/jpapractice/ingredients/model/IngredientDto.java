package org.example.jpapractice.ingredients.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

public class IngredientDto {
    @Getter
    @NoArgsConstructor
    @Setter
    public static class Register {
        private String name;
        private Integer gram;

        public Ingredient toEntity(Drink drink){
            Ingredient entity = Ingredient.builder()
                    .name(name)
                    .gram(gram)
                    .drink(drink)
                    .build();

            return entity;
        }
    }

    @Getter
    @Builder
    public static class IngredientRes {
        private Integer idx;
        private String name;
        private Integer gram;

        public static IngredientDto.IngredientRes from(Ingredient entity){
            IngredientDto.IngredientRes dto = IngredientDto.IngredientRes.builder()
                    .idx(entity.getIdx())
                    .name(entity.getName())
                    .gram(entity.getGram())
                    .build();

            return dto;
        }
    }
}
