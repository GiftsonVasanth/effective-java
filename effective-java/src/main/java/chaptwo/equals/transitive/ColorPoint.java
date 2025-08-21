package chaptwo.equals.transitive;

import java.awt.*;

public class ColorPoint extends Point {

    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof Point)) {
            return false;
        }

        // The below broken symmetry can be fixed with an expense of Transitivity
//        if (!(o instanceof ColorPoint)) {
//            System.out.println("Not a ColorPoint instance");
//            return false;
//        }

        // calling point's equals method to check x and y values with color blindness. o is a point instance in this case
        if (!(o instanceof ColorPoint)) {
            return o.equals(this);
        }
        return super.equals(o) && ((ColorPoint) o).color == color;
    }
}
