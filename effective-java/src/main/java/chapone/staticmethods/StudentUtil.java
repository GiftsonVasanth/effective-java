package chapone.staticmethods;

public class StudentUtil {

    private static Student student = new Student();

    public static Student buildStudent(String id, String name) {
        return student.setId(id).setName(name);
    }
}
