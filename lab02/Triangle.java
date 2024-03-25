public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        if (!isValidTriangle(point1, point2, point3)) {
            throw new IllegalArgumentException("Invalid triangle: points are collinear or coincident");
        }
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    private boolean isValidTriangle(Point point1, Point point2, Point point3) {
        // Перевірка на колінеарність точок (вони не повинні лежати на одній прямій)
        double area = 0.5 * ((point2.getX() - point1.getX()) * (point3.getY() - point1.getY()) -
                (point3.getX() - point1.getX()) * (point2.getY() - point1.getY()));
        return area != 0; // Якщо площа не дорівнює нулю, то трикутник існує
    }

    public double area() {
        return 0.5 * Math.abs((point1.getX() - point3.getX()) * (point2.getY() - point3.getY()) -
                (point2.getX() - point3.getX()) * (point1.getY() - point3.getY()));
    }

    public Point centroid() {
        double centroidX = (point1.getX() + point2.getX() + point3.getX()) / 3;
        double centroidY = (point1.getY() + point2.getY() + point3.getY()) / 3;
        return new Point(centroidX, centroidY);
    }

    public static void main(String[] args) {
        Point point1 = new Point(0, 0);
        Point point2 = new Point(9, 0);
        Point point3 = new Point(0, 8);

        Triangle triangle = new Triangle(point1, point2, point3);

        System.out.println("Area of the triangle: " + triangle.area());
        System.out.println("Centroid of the triangle: " + triangle.centroid());
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
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}