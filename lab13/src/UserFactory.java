public class UserFactory {
    public static User createUser(String type, String firstName, String lastName) {
        if(type == null || type.isEmpty())
            return null;
        else if("Student".equals(type)) {
            return new Student(firstName, lastName);
        } else if("Parent".equals(type)) {
            return new Parent(firstName, lastName);
        } else if("Assistant".equals(type)) {
            return new Assistant(firstName, lastName);
        } else if("Teacher".equals(type)) {
            return new Teacher(firstName, lastName);
        }
        return null;
    }

}