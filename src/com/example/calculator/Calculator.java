package com.example.calculator;

public class Calculator {
    double num1, num2, current;
    char operator;


    //3. 기능 정의
    public double add(double num1, double num2){
        current = num1 + num2;
        return current;
    }
    public double minus(double num1, double num2){
        current = num1 - num2;
        return current;
    }
    public double multiply(double num1, double num2){
        current = num1 * num2;
        return current;
    }
    public double divide(double num1, double num2){
        current = num1 / num2;
        return current;
    }
    public double mod(double num1, double num2){
        current = num1 % num2;
        return current;
    }
    public double square(double num1, double num2){
        current = Math.pow(num1, num2);
        return current;
    }
}
