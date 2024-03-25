public class Segment {
    private Point startPoint;
    private Point endPoint;

    public Segment(Point startPoint, Point endPoint) {
        if (startPoint.equals(endPoint)) {
            throw new IllegalArgumentException("Degenerate segment: start point equals end point");
        }
        this.startPoint = startPoint;
        this.endPoint = endPoint;
    }

    public double length() {
        double dx = endPoint.getX() - startPoint.getX();
        double dy = endPoint.getY() - startPoint.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point middle() {
        double mx = (startPoint.getX() + endPoint.getX()) / 2;
        double my = (startPoint.getY() + endPoint.getY()) / 2;
        return new Point(mx, my);
    }

    public Point intersection(Segment another) {
        double x1 = startPoint.getX(), y1 = startPoint.getY();
        double x2 = endPoint.getX(), y2 = endPoint.getY();
        double x3 = another.startPoint.getX(), y3 = another.startPoint.getY();
        double x4 = another.endPoint.getX(), y4 = another.endPoint.getY();

        double denominator = (x1 - x2) * (y3 - y4) - (y1 - y2) * (x3 - x4);

        if (denominator == 0)
            return null; // Lines are parallel

        double t = ((x1 - x3) * (y3 - y4) - (y1 - y3) * (x3 - x4)) / denominator;
        double u = -((x1 - x2) * (y1 - y3) - (y1 - y2) * (x1 - x3)) / denominator;

        if (t >= 0 && t <= 1 && u >= 0 && u <= 1) {
            double x = x1 + t * (x2 - x1);
            double y = y1 + t * (y2 - y1);
            return new Point(x, y);
        } else {
            return null; // Segments do not intersect
        }
    }

    public static void main(String[] args) {
        Point startPoint1 = new Point(1, 4);
        Point endPoint1 = new Point(4, 8);
        Segment segment1 = new Segment(startPoint1, endPoint1);

        Point startPoint2 = new Point(2, 2);
        Point endPoint2 = new Point(5, 4);
        Segment segment2 = new Segment(startPoint2, endPoint2);

        System.out.println("Length of segment 1: " + segment1.length());
        System.out.println("Middle point of segment 1: " + segment1.middle());
        System.out.println("Intersection point of segment 1 and segment 2: " + segment1.intersection(segment2));
    }
}

class Point {
    private double x;
    private double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Point point = (Point) obj;
        return Double.compare(point.x, x) == 0 &&
                Double.compare(point.y, y) == 0;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}