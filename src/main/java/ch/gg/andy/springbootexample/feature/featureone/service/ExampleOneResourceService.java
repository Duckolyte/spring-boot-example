package ch.gg.andy.springbootexample.feature.featureone.service;

import ch.gg.andy.springbootexample.feature.core.exception.ResourceNotFound;
import ch.gg.andy.springbootexample.feature.featureone.model.ExampleOneResource;
import ch.gg.andy.springbootexample.feature.featureone.repository.ExampleOneResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.List;
import java.util.Optional;

@Service
public class ExampleOneResourceService {

    @Autowired
    private ExampleOneResourceRepository exampleOneResourceRepository;

    public List<ExampleOneResource> readAllExampleOneResources() {
        return (List<ExampleOneResource>) exampleOneResourceRepository.findAll();
    }


    public ExampleOneResource readExampleOneResource(String id) throws ResourceNotFound {
        Optional<ExampleOneResource> resource = exampleOneResourceRepository.findById(id);
        if (resource.isPresent()) {
            return resource.get();
        }
        throw new ResourceNotFound(MessageFormat.format("No resource found with id {0}.", id));
    }

    public ExampleOneResource createExampleOneResource(ExampleOneResource exampleOneResource) {
        exampleOneResourceRepository.save(exampleOneResource);
        return exampleOneResource;
    }

    public ExampleOneResource update(ExampleOneResource exampleOneResource) {
        exampleOneResourceRepository.save(exampleOneResource);
        return exampleOneResource;
    }

    public String delete(String id) {
        try {
            exampleOneResourceRepository.deleteById(id);
        } catch (EmptyResultDataAccessException exception) {
            throw new ResourceNotFound(MessageFormat.format("No resource found with id {0}.", id));
        }
        return id;
    }
}
