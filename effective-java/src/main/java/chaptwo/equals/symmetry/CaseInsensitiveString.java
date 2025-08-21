package chaptwo.equals.symmetry;

import java.util.Objects;

public class CaseInsensitiveString {
    private final String value;

    public CaseInsensitiveString(String value) {
        this.value = Objects.requireNonNull(value);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (o instanceof CaseInsensitiveString) {
//            return value.equalsIgnoreCase(((CaseInsensitiveString) o).value);
//        }
//
//        if (o instanceof String) { // interoperability will cause issues.
//            return value.equalsIgnoreCase((String) o);
//        }
//
//        return false;
//    }

    @Override
    public boolean equals(Object o) {
       return o instanceof CaseInsensitiveString &&
               ((CaseInsensitiveString) o).value.equalsIgnoreCase(value);

    }


}
