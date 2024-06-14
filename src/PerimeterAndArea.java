public interface PerimeterAndArea {
    double area();

    double perimeter();

    String getFillColor();

    String getBorderColor();

    default void parameters() {
        System.out.println("Периметр: " + perimeter() + ", Площадь: " + area() + ", цвет фона: " + getFillColor() + ", цвет границ: " + getBorderColor());
    }
}
