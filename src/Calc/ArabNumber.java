package Calc;


public class ArabNumber {

    public static boolean checkArab(String userInput) {
        boolean a = false;
        for (String key : arr) {
            if (userInput.startsWith(key) || userInput.startsWith(key, 5)) {
                a = true;
            }
        }

        return a;
    }

    public static String[] arr = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};

    public static void calcArab(String userInput) throws Exception {


        String[] arr = userInput.split(" ", 3);
        int numOne = Integer.parseInt(arr[0]);
        int numTwo = Integer.parseInt(arr[2]);

        if ((numOne | numTwo) == 0 || (numOne | numTwo) < 0) {
            throw new Exception("Нельзя вводить числа, которые равны/меньше 0!");
        }
        if (numOne > 10 || numTwo > 10) {
            throw new Exception("Нельзя вводить числа, которые больше 10!");
        }


        int result;
        if (arr[1].equals("+")) {
            result = numOne + numTwo;
            System.out.println(result);
        } else if (arr[1].equals("*")) {
            result = numOne * numTwo;
            System.out.println(result);
        } else if (arr[1].equals("-")) {
            result = numOne - numTwo;
            System.out.println(result);
        } else if (arr[1].equals("/")) {
            result = numOne / numTwo;
            System.out.println(result);
        } else {
            throw new Exception("Введите коректные данные");
        }
        System.exit(0);
    }
}
