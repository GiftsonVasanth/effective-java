package chaptwo.equals.transitive;

import java.awt.*;

// Favor composition over inheritance
public class ColorPointComposition {

    private final Point point;
    private final Color color;

    public ColorPointComposition(int x, int y, Color color) {
        this.point = new Point(x, y);
        this.color = color;
    }

    // Point view
    public Point getPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {

        if (!(o instanceof ColorPointComposition)) {
            return false;
        }
        return ((ColorPointComposition) o).point.equals(point) &&
                ((ColorPointComposition) o).color.equals(color);
    }
}
