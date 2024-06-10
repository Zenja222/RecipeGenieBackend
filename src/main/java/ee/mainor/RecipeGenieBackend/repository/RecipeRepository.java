package ee.mainor.RecipeGenieBackend.repository;

import ee.mainor.RecipeGenieBackend.model.Recipe;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface RecipeRepository extends CrudRepository<Recipe, Long>{

    List<Recipe> findAll();
    List<Recipe> findByLvl(int lvl);
}