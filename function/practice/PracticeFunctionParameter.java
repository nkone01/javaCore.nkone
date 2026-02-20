package javacore.chapter04.function.practice;

import java.sql.SQLOutput;

public class PracticeFunctionParameter {

    public static void main(String[] args){

        int number1 = 5;
        int number2 = 10;

        int result1 = sum(5,10);
        System.out.println("le resultat de " + number1 +"+" + number2 + "=" + result1);

        int result2 = sum(10,20);
        System.out.println("le resultat de " + number1 +"+" + number2 + "=" + result2);

        int result3 = sum(20,30);
        System.out.println("le resultat de " + number1 +"+" + number2 + "=" + result3);

    }
    public static int sum(int number1,int number2) {

        int result = number1 + number2;
        System.out.println(result);
        return(result);

    }






}
