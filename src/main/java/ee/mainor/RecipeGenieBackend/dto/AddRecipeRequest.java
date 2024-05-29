package ee.mainor.RecipeGenieBackend.dto;

import lombok.Data;
@Data
public class AddRecipeRequest {
    private String name;
    private String description;
}
