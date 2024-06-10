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

    public double Area() {
        return r * r * pi;
    }

    public double Perimeter() {
        return 2 * r * pi;
    }

    public void Parameters() {
        System.out.println("Периметр: " + Perimeter() + ", Площадь: " + Area() + ", цвет фона: " + fillColor + ", цвет границ: " + borderColor);
    }
}
