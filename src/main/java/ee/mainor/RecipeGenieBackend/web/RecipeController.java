package ee.mainor.RecipeGenieBackend.web;

import ee.mainor.RecipeGenieBackend.dto.AddRecipeRequest;
import ee.mainor.RecipeGenieBackend.dto.RecipeDto;
import ee.mainor.RecipeGenieBackend.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("recipe")
public class RecipeController {

    private final RecipeService recipeService;

    @PostMapping
    public RecipeDto create(@RequestBody AddRecipeRequest request) {
        return recipeService.addRecipe(request);
    }

    @GetMapping
    public List<RecipeDto> getAll() {
        return recipeService.getAll();
    }

    @PutMapping("/{id}")
    public RecipeDto update(@PathVariable Long id, @RequestBody RecipeDto request){
        return recipeService.updateRecipe(id, request);
    }
}
