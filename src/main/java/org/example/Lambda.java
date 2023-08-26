package org.example;

import java.util.Arrays;
import java.util.List;

public class Lambda {
    public static void main(String[] args) {

//        (parametry) -> {ciało wyrażenia}
//        () -> System.out.println("Witaj świecie");
//        (s) -> System.out.println(s);
//        s -> System.out.println(s);
//        (x,y) -> x + y;

        List<String> list = Arrays.asList("Java","Python","Selenium");
        list.forEach(s -> System.out.println(s));

        try{
            int result = 10/0;
        } catch (ArithmeticException e){
            System.out.println("Wystąpił wyjątek: " + e);
        }

        try{
            int result = 10/0;
        } catch (Exception e){
            System.out.println("Wystąpił wyjątek: " + e);
        }

    }
}
