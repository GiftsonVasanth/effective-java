package chapone.item6.objectcreation;

import java.util.regex.Pattern;

public class Demo {

    public static final Pattern p = Pattern.compile("^?"); // store it in a cache

    public static void main(String[] args) {

        //1.
        //Not to do
        String s = new String("Hello, World!");
        //To do
        String s1 = "Hello, World!";

        // 2. sometimes object creation is extremely expensive.
        String s2 = "Hello, World!";
        s2.matches("^?");

        //Always Pattern is compiled, which is expensive.
        p.matcher(s2).matches(); // store it in a cache like p above static final Pattern p = Pattern.compile("^?");

        Long l = 0L;
        long l2 = 0l;

        //Prefer primitives over boxed types when they are functionally identical


    }
}
