package Calc;

import java.util.Scanner;

import static Calc.ArabNumber.*;
import static Calc.CalcOfRome.*;

public class Calc {
    public static void main(String[] args) throws Exception {

        System.out.println("¬ведите данные через пробел:");
        Scanner scr = new Scanner(System.in);
        String userInput = scr.nextLine();
        calc(userInput);


    }

    public static String calc(String userInput) throws Exception {
        if (checkRome(userInput)) {
            calcRome(userInput);
        } else if (checkArab(userInput)) {
            calcArab(userInput);
        } else {
            throw new Exception("¬ведите корректные данные!");
        }

        return userInput;
    }

}




