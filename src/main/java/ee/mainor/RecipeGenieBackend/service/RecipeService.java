package ee.mainor.RecipeGenieBackend.service;

import ee.mainor.RecipeGenieBackend.dto.AddRecipeRequest;
import ee.mainor.RecipeGenieBackend.dto.RecipeDto;
import ee.mainor.RecipeGenieBackend.mapper.RecipeMapper;
import ee.mainor.RecipeGenieBackend.model.Recipe;
import ee.mainor.RecipeGenieBackend.repository.RecipeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeService {
    private final RecipeRepository recipeRepository;

    public RecipeDto addRecipe(AddRecipeRequest addRecipeRequest){
        Recipe recipe = RecipeMapper.toEntity(addRecipeRequest);
        return RecipeMapper.toDto(recipeRepository.save(recipe));
    }

    public List<RecipeDto> getAll(){
        return recipeRepository.findAll()
                .stream()
                .map(RecipeMapper::toDto)
                .toList();
    }

    public RecipeDto updateRecipe(Long id, RecipeDto recipeDto){
        Recipe recipe = RecipeMapper.updateEntity(recipeDto, requireRecipe(id));
        return RecipeMapper.toDto(recipeRepository.save(recipe));
    }

    private Recipe requireRecipe(Long id) {
        return recipeRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("recipe not found"));
    }
}
