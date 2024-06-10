public class Cat extends Animal {
    private String name;
    private Boolean satiety;
    private int appetite;
    private static int countOfCats;

    public Cat(){}

    public Cat(String name, int appetite){
        this.name = name;
        this.satiety = false;
        this.appetite = appetite;
        countOfCats += 1;
    }

    @Override
    public void run(int distance){
        if (distance > 200) {
            System.out.println(name + " столько не пробежит");
        } else {
            System.out.println(name + " пробежал " + distance + " м");
        }

    }
    @Override
    public void swim(int distance){
        System.out.println(name + " не умеет плавать");
    }
    public void eatFromBowl(Bowl bowl) {
        if (bowl.reduceFood(appetite)) {
            satiety = true;
        }
    }
    public void info() {
        System.out.println("имя: " + name + " сытость: " + satiety);
    }
    @Override
    public void countOfAnimals() {
        System.out.println("Количество котов: " + countOfCats);
    }
}
