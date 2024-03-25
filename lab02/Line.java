public class Line {
    private double k; // Коефіцієнт k
    private double b; // Коефіцієнт b

    public Line(double k, double b) {
        this.k = k;
        this.b = b;
    }

    // Метод для знаходження точки перетину з іншою лінією
    public Point intersection(Line otherLine) {
        // Перевірка на збігаються або паралельність
        if (this.k == otherLine.k && this.b == otherLine.b) {
            return null; // Лінії збігаються
        } else if (this.k == otherLine.k) {
            return null; // Лінії паралельні
        }

        // Знаходження точки перетину за формулами
        double x = (otherLine.b - this.b) / (this.k - otherLine.k);
        double y = this.k * x + this.b;

        return new Point(x, y);
    }

    // Внутрішній клас, що представляє точку
    private class Point {
        private double x;
        private double y;

        public Point(double x, double y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "(" + x + ";" + y + ")";
        }
    }

    public static void main(String[] args) {
        Line line1 = new Line(1, 1);
        Line line2 = new Line(-1, 3);

        System.out.println(line1.intersection(line2)); // (1;2)
    }
}