public class Main {
    public static void main(String[] args) {
        String[][] myArr = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };
        String[][] myArrErrorSize = {
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };
        String[][] myArrErrorSize2 = {
                {"1", "1", "1"},
                {"1", "1", "1"},
                {"1", "1", "1"},
                {"1", "1", "1"}
        };
        String[][] myArrErrorData = {
                {"1", "1", "1", "1"},
                {"1", "1", "?", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}
        };
        try {
            sumOfElements(myArr);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        try {
            sumOfElements(myArrErrorSize);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        try {
            sumOfElements(myArrErrorSize2);

        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
        try {
            sumOfElements(myArrErrorData);
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        }
    }

    public static void sumOfElements(String[][] arr) throws MyArraySizeException, MyArrayDataException {
        int sum = 0;
        if (arr.length != 4) throw new MyArraySizeException("Неверное количество строк");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length != 4) throw new MyArraySizeException("Неверное количество столбцов");
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum += Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException(i, j);
                }
            }
        }
        System.out.println(sum);
    }
}

