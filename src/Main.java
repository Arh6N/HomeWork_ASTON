public class Main {
    public static void main(String[] args) {
        Cat[] cats = new Cat[5];
        cats[0] = new Cat("Барсик", 10);
        cats[1] = new Cat("Мурзик", 30);
        cats[2] = new Cat("Белок", 24);
        cats[3] = new Cat("Тузер", 17);
        cats[4] = new Cat("Марсик", 32);
        Bowl bowl = new Bowl(70);
        for (int i = 0; i < cats.length; i++) {
            cats[i].eatFromBowl(bowl);
            cats[i].info();
        }
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(5, 6, 6);
        Rectangle rectangle = new Rectangle(7, 8);
        circle.Parameters();
        triangle.Parameters();
        rectangle.Parameters();
    }
}


