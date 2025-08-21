package chaptwo.equals.transitive;

import java.awt.*;

public class TransitiveDemo {

    public static void main(String[] args) {
        Point point = new Point(1, 2);
        ColorPoint colorPoint = new ColorPoint(1, 2, Color.RED);

        System.out.println(point.equals(colorPoint)); // true, because ColorPoint extends Point and has the same x and y values
        System.out.println(colorPoint.equals(point)); // false, because ColorPoint has an additional color field that Point does not have

    }
}
