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
        this.fillColor = "Зелёный";
        this.borderColor = "Жёлтый";
    }

    public double Perimeter() {
        return a + b + c;
    }

    public double Area() {
        return Math.sqrt(Perimeter() * 0.5 * (Perimeter() * 0.5 - a) * (Perimeter() * 0.5 - b) * (Perimeter() * 0.5 - c));
    }

    public void Parameters() {
        System.out.println("Периметр: " + Perimeter() + ", Площадь: " + Area() + ", цвет фона: " + fillColor + ", цвет границ: " + borderColor);
    }
}
