public class Bowl {
    private int food;
    public Bowl(int food){
        this.food = food;
    }
    public boolean reduceFood(int n) {
        if (food - n >= 0) {
            food = food - n;
            return true;
        }
            return false;
    }
    public void addFood(int food) {
        this.food = this.food + food;
        System.out.println("В миску добавили: " + food + " еды, В миске стало: " + this.food + " еды");
    }
}
