package ch.gg.andy.springbootexample.feature.featureone.service;

import ch.gg.andy.springbootexample.feature.featureone.model.ExampleOneResource;
import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class ExampleOneResourceService {

    private ArrayList<ExampleOneResource> exampleOnes = new ArrayList<>(Arrays.asList(
            new ExampleOneResource("1", "resource one"),
            new ExampleOneResource("2", "resource two"),
            new ExampleOneResource("3", "resource three")
    ));

    public List<ExampleOneResource> readAllExampleOneResources() {
        return exampleOnes;
    }


    public ExampleOneResource readExampleOneResource(String id) throws IllegalArgumentException {
        Optional<ExampleOneResource> resource =  exampleOnes.stream().filter(
                exampleOneResource -> exampleOneResource.getId().equals(id)).findFirst();
        if (resource.isEmpty()) {
            throw new IllegalArgumentException(MessageFormat.format("No resource has been found with id {}.", id));
        }
        return resource.get();
    }


    public ExampleOneResource createExampleOneResource(ExampleOneResource exampleOneResource) {
        exampleOnes.add(exampleOneResource);
        return exampleOneResource;
    }

    public ExampleOneResource update(ExampleOneResource exampleOneResource, String id) {
        exampleOnes.forEach(
                resource -> {
                    if(resource.getId().equals(id)) {
                        resource.setExampleProp(exampleOneResource.getExampleProp());
                    }
                });
        return exampleOneResource;
    }

    public String delete(String id) {
        exampleOnes.removeIf(exampleOneResource -> exampleOneResource.getId().equals(id));
        return id;
    }
}
