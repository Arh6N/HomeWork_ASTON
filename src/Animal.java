public abstract class Animal {
    private String name;
    protected static int count;

    public Animal(){
        count += 1;
    }

    public abstract void countOfAnimals();
    public void run(int distance) {}
    public void swim(int distance) {}
}
