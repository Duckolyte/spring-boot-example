package ch.gg.andy.springbootexample.feature.featureone.service;

import ch.gg.andy.springbootexample.feature.featureone.model.ExampleOneResource;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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


    public ExampleOneResource readExampleOneResource(String id) {
        return exampleOnes.stream().filter(exampleOneResource -> exampleOneResource.getId().equals(id)).findFirst().get();
    }


    public ExampleOneResource createExampleOneResource(ExampleOneResource exampleOneResource) {
        exampleOnes.add(exampleOneResource);
        return exampleOneResource;
    }
}
