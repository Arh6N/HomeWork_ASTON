public class Rectangle implements PerimeterAndArea {
    private double a;
    private double b;
    private String fillColor;
    private String borderColor;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.fillColor = "Белый";
        this.borderColor = "Чёрный";
    }


    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public double perimeter() {
        return 2 * (a + b);
    }

    public double area() {
        return a * b;
    }
}
