package ch.gg.andy.springbootexample.feature.featureone.model;

public class ExampleOneResource {

    private String id;
    private String exampleProp;

    public ExampleOneResource(String id, String exampleProp) {
        this.id = id;
        this.exampleProp = exampleProp;
    }

    public String getId() {
        return id;
    }


    public String getExampleProp() {
        return exampleProp;
    }

    public ExampleOneResource setExampleProp(String exampleProp) {
        this.exampleProp = exampleProp;
        return this;
    }

}
