package ch.gg.andy.springbootexample.feature.featureone.repository;


import ch.gg.andy.springbootexample.feature.featureone.model.ExampleOneResource;
import org.springframework.data.repository.CrudRepository;

public interface ExampleOneResourceRepository extends CrudRepository<ExampleOneResource, String> {

}
