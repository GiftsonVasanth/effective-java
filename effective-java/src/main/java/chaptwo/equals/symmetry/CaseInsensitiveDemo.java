package chaptwo.equals.symmetry;

import java.util.ArrayList;
import java.util.List;

public class CaseInsensitiveDemo {
    public static void main(String[] args) {
        CaseInsensitiveString cis = new CaseInsensitiveString("Hello");

        String s = "hello";

        System.out.println(cis.equals(s));
        System.out.println(s.equals(cis));

        List<CaseInsensitiveString> cis2 = new ArrayList<>();
        cis2.add(cis);

        System.out.println(cis2.contains("hello"));
    }
}
