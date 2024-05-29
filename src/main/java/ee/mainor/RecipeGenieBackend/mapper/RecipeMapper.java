package ee.mainor.RecipeGenieBackend.mapper;

import ee.mainor.RecipeGenieBackend.dto.AddRecipeRequest;
import ee.mainor.RecipeGenieBackend.dto.RecipeDto;
import ee.mainor.RecipeGenieBackend.model.Recipe;

public class RecipeMapper {

    public static RecipeDto toDto(Recipe recipe){
        RecipeDto recipeDto = new RecipeDto();
        recipeDto.setId(recipe.getId());
        recipeDto.setName(recipe.getName());
        recipeDto.setDescription(recipe.getDescription());
        return recipeDto;
    }

    public static Recipe toEntity(AddRecipeRequest request){
        Recipe recipe = new Recipe();
        recipe.setName(request.getName());
        recipe.setDescription(request.getDescription());
        return recipe;
    }

    public static Recipe updateEntity(RecipeDto source, Recipe target){
        target.setName(source.getName());
        target.setDescription(source.getDescription());
        return target;
    }
}
