import java.util.ArrayList;
import java.util.List;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

public class Coordinates {

    public static void main(String[] args) {
        List<Point> lineCoordinates = createCoordinateList();
        outputValues(lineCoordinates);
        Point p = new Point(12, 20);
        removeValue(lineCoordinates, p);
        System.out.println("-----------");
        outputValues(lineCoordinates);
    }


    private static void outputValues(List<Point> points) {
        System.out.println("Output values...");
        for (Point p : points) {
            System.out.println(p);
        }
    }

    private static List<Point> createCoordinateList() {
        List<Point> result = new ArrayList<>();
        result.add(new Point(1, 30));
        result.add(new Point(12, 20));
        result.add(new Point(10, 10));
        return result;
    }

    private static void removeValue(List<Point> points, Point p) {
        points.remove(p);
    }
}
