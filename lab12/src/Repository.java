public abstract class Repository {
    private String name;
    // numele unui fisier sau folder (de fapt, calea acestuia)
    public String getName() {
        return name;
    }

    public Repository(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void accept (Visitor f);
}
