package chapone.singleton;

public enum Person {
    INSTANCE;

    private String name;
    private String id;

    public String getName() {
        return name;
    }

    public Person setName(String name) {
        this.name = name;
        return this;
    }

    public String getId() {
        return id;
    }

    public Person setId(String id) {
        this.id = id;
        return this;
    }
}
