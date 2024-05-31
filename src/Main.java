public class Main {
    public static void main(String[] args) {
        Employee[] employee = new Employee[5];
        employee[0] = new Employee("Иванов Иван Иванович", "Engineer", "ivanov@yandex.ru", "89217715246", 60000, 37);
        employee[1] = new Employee("Семёнов Семён Семёноович", "AQA", "semenov@yandex.ru", "89218993214", 90000, 25);
        employee[2] = new Employee("Артемьев Артём Артёмович", "Developer", "artemov@yandex.ru", "89215549860", 100000, 28);
        employee[3] = new Employee("Дмитриев Дмитрий Дмитриевич", "Manager", "dmitriev@yandex.ru", "89212137890", 70000, 30);
        employee[4] = new Employee("Матвеев Матвей Матвеевич", "Director", "matveev@yandex.ru", "89216778090", 150000, 50);
        for (int i = 0; i < employee.length; i++) {
            employee[i].info();
        }
        Park park1 = new Park(5);
        Park.Attraction[] attractions1 = new Park.Attraction[park1.getSize()];
        attractions1[0] = park1.new Attraction("Колесо обозрения", "10 - 18", 600);
        attractions1[1] = park1.new Attraction("Горка", "10 - 18", 500);
        attractions1[2] = park1.new Attraction("Карусель", "10 - 20", 700);
        attractions1[3] = park1.new Attraction("Автодром", "10 - 19", 800);
        attractions1[4] = park1.new Attraction("Свободное падение", "10 - 18", 900);
        for (int i = 0; i < attractions1.length; i++) {
            attractions1[i].info();
        }
    }
}

