public class Dog extends Animal {
    private String name;
    private static int countOfDogs;
    public Dog(String name){
        this.name = name;
        countOfDogs += 1;
    }

    @Override
    public void run(int distance) {
        if (distance > 500) {
            System.out.println(name + "столько не пробежит");
        } else {
            System.out.println(name + "пробежал" + distance + "м");
        }
    }
    @Override
    public void swim(int distance) {
        if (distance > 10) {
            System.out.println(name + "столько не проплывёт");
        } else {
            System.out.println(name + "проплыл" + distance + "м");
        }
    }
    @Override
    public void countOfAnimals() {
        System.out.println("Количество собак: " + countOfDogs);
    }
}
