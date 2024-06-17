public class MyArrayDataException extends NumberFormatException {
    MyArrayDataException(int row, int col) {
        super("Некорректное значение элемента в строке: " + row + " столбце: " + col);
    }
}
