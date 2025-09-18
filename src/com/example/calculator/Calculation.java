package com.example.calculator;

public class Calculation extends Calculator {
    //중간 계산 결과 current 객체 생성
    public double current;

    public void CalculatePackage(double num1, double num2, char operator) {
        switch (operator) {
            case '+':
                current = super.add(num1, num2);
                break;
            case '-':
                current = super.minus(num1, num2);
                break;
            case '*':
                current = super.multiply(num1, num2);
                break;
            case '/':
                current = super.divide(num1, num2);
                break;
            case '%':
                current = super.mod(num1, num2);
                break;
            case '^':
                current = super.square(num1, num2);
                break;
            //예외 처리
            default:
                System.out.println(operator + "은(는) 계산할 수 없는 연산자입니다.");
                break;
    }
}
}
