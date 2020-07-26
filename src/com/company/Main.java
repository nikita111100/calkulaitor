package com.company;
import java.util.Scanner;
import Exception.divideByZero;

public class Main {

    public static void main(String[] args) throws divideByZero {
        Scanner scan = new Scanner(System.in);
        try {
        String expression = scan.nextLine();
        System.out.println( new calculator().decide(expression));}
        catch (NumberFormatException e){
            throw new NumberFormatException("Допускаются только цифры и знаки '-' '+' '*' '/' без дробных значений ");
        }

    }
}
