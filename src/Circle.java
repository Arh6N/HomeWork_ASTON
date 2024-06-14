public class Circle implements PerimeterAndArea {
    private double pi;
    private double r;
    private String fillColor;
    private String borderColor;

    public Circle(double r) {
        this.r = r;
        this.pi = 3.14;
        this.fillColor = "Красный";
        this.borderColor = "Синий";
    }

    public String getFillColor() {
        return fillColor;
    }

    public String getBorderColor() {
        return borderColor;
    }

    public double area() {
        return r * r * pi;
    }

    public double perimeter() {
        return 2 * r * pi;
    }
}
