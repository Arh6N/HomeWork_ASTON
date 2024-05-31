public class Park {
    private int size;

    public Park(int size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public class Attraction {
        public String nameOfAttraction;
        public String timeOfWork;
        public int price;

        public Attraction(String nameOfAttraction, String timeOfWork, int price) {
            this.nameOfAttraction = nameOfAttraction;
            this.timeOfWork = timeOfWork;
            this.price = price;
        }

        public void info() {
            System.out.println("Название аттракциона:" + nameOfAttraction + " Время работы:" + timeOfWork + " цена:" + price);
        }

    }
}
