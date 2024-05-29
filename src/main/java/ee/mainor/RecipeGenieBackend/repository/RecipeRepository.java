package ee.mainor.RecipeGenieBackend.repository;

import ee.mainor.RecipeGenieBackend.model.Recipe;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

    List<Recipe> findAll();
}