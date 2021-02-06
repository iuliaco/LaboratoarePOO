import java.util.ArrayList;
import java.util.List;

public class Director extends Repository {
    private List<Repository> children = new ArrayList<>();

    public List<Repository> getChildren() {
        return children;
    }

    public Director(String name, List<Repository> children) {
        super(name);
        this.children = children;
    }

    public void accept(Visitor f) {
        f.visit(this);
    }
    public void addChildren(Repository repo){
        children.add(repo);
    }
}