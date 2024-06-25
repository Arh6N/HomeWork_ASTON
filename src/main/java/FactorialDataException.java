public class FactorialDataException extends NumberFormatException {
    FactorialDataException(long number) {
        super("Факториала от " + number + " не существует");
    }
}
