public class Triangle implements PerimeterAndArea {
    private double a;
    private double b;
    private double c;
    private String fillColor;
    private String borderColor;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        fillColor = "Зелёный";
        borderColor = "Жёлтый";
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public double perimeter() {
        return a + b + c;
    }

    public double area() {
        return Math.sqrt(perimeter() * 0.5 * (perimeter() * 0.5 - a) * (perimeter() * 0.5 - b) * (perimeter() * 0.5 - c));
    }
}
