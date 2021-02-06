public class Student extends User{
    private Parent father;
    private Parent mother;
    public Student(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public Parent getFather() {
        return father;
    }

    public void setFather(Parent father) {
        this.father = father;
    }

    public Parent getMother() {
        return mother;
    }

    public void setMother(Parent mother) {
        this.mother = mother;
    }
}
