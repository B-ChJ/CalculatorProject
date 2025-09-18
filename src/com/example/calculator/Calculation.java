package com.example.calculator;

public class Calculation extends Calculator {

public void Calculation(double num1, double num2, char operator) {
    switch (super.operator) {
        case '+':
            super.add(num1, num2);
            break;
        case '-':
            super.minus(num1, num2);
            break;
        case '*':
            super.multiply(num1, num2);
            break;
        case '/':
            super.divide(num1, num2);
            break;
        case '%':
            super.mod(num1, num2);
            break;
        case '^':
            super.square(num1, num2);
            break;
        default:
            System.out.println(operator + "은(는) 계산할 수 없는 연산자입니다.");
            break;
    }
}
}
