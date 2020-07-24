package ch.gg.andy.springbootexample.feature.featureone.controller;

import ch.gg.andy.springbootexample.feature.featureone.model.ExampleOneResource;
import ch.gg.andy.springbootexample.feature.featureone.service.ExampleOneResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ExampleOneResourceController {

    @Autowired
    ExampleOneResourceService exampleOneResourceService;

    @RequestMapping("/example-ones")
    public List<ExampleOneResource> getExamples() {
        return exampleOneResourceService.readAllExampleOneResources();
    }

    @RequestMapping("/example-ones/{id}")
    public ExampleOneResource getExamples(@PathVariable String id) {
        return exampleOneResourceService.readExampleOneResource(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/example-ones")
    public ExampleOneResource getExamples(@RequestBody ExampleOneResource exampleOneResource) {
        return exampleOneResourceService.createExampleOneResource(exampleOneResource);
    }

}
