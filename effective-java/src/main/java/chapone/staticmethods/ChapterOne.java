package chapone.staticmethods;

import java.util.Objects;

public class ChapterOne {

    public static void main(String[] args) {
        Student s1 = StudentUtil.buildStudent("1", "AAAA");
        Student s2 = StudentUtil.buildStudent("2", "BBBB");
        System.out.println(s1.getId() + " " +s1.getName());
        System.out.println(s2.getId() + " " + s2.getName());
        System.out.println(s1.getId() + " " +s1.getName());
        System.out.println(Objects.deepEquals(s1, s2));
        Student s3 = new Student()
                .setId("3")
                .setName("CCCC");
        Student s4 = new Student()
                .setId("3")
                .setName("CCCC");
    }
}
