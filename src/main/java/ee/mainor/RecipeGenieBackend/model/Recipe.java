package ee.mainor.RecipeGenieBackend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@Table(name = "recipe")
public class Recipe {
    @Id
    private Long id;
    private String name;
    private String description;
}
