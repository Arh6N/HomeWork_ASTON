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

    public double Perimeter() {
        return 2 * (a + b);
    }

    public double Area() {
        return a * b;
    }

    public void Parameters() {
        System.out.println("Периметр: " + Perimeter() + ", Площадь: " + Area() + ", цвет фона: " + fillColor + ", цвет границ: " + borderColor);
    }
}
