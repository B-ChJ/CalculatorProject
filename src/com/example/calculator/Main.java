package com.example.calculator;

import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;


public class Main {
    public static void main(String[] args) {
        double current = 0;
        Scanner scanner = new Scanner(System.in);
        String arrBefore = scanner.nextLine();
        //입력받은 문자열 나누기 → ArrayFormula.java
        ArrayFormula arr = new ArrayFormula();
        ArrayList<String> arrAfter = arr.makeArray(arrBefore);
        //예외 처리 (0으로 나누기)
        int i;
        for (i = 0; i < arrAfter.size() - 1; i++) {
            if (arrAfter.get(i) == "/" && arrAfter.get(i + 1) == "0") {
                System.out.println("ERROR");
            }
        }
        boolean power = true;
        while (power) {
            //arrAfter 배열을 Calculator로 보내 연산 작업을 하고 결과값 current를 받는다.
            while (arrAfter.size() > 1) {
                Calculation calc = new Calculation();
                int n = 0;
                char operator;
                //연산자 우선순위(^*/% → +-) 순서대로 연산
                //연산이 끝나면 사용했던 index를 삭제하고 결과값 current를 추가
                if (arrAfter.contains("^")) {
                    operator = '^';
                    n = arrAfter.indexOf("^");
                    double num1 = Double.parseDouble(arrAfter.get(n - 1));
                    double num2 = Double.parseDouble(arrAfter.get(n + 1));
                    current = calc.CalculatePackage(num1, num2, operator);
                    arrAfter.set(n, String.valueOf(current));
                    arrAfter.remove(n - 1);
                    arrAfter.remove(n);
                } else if (arrAfter.contains("*")) {
                    operator = '*';
                    n = arrAfter.indexOf("*");
                    double num1 = Double.parseDouble(arrAfter.get(n - 1));
                    double num2 = Double.parseDouble(arrAfter.get(n + 1));
                    current = calc.CalculatePackage(num1, num2, operator);
                    arrAfter.set(n, String.valueOf(current));
                    arrAfter.remove(n - 1);
                    arrAfter.remove(n);
                } else if (arrAfter.contains("/")) {
                    operator = '/';
                    n = arrAfter.indexOf("/");
                    double num1 = Double.parseDouble(arrAfter.get(n - 1));
                    double num2 = Double.parseDouble(arrAfter.get(n + 1));
                    current = calc.CalculatePackage(num1, num2, operator);
                    arrAfter.set(n, String.valueOf(current));
                    arrAfter.remove(n - 1);
                    arrAfter.remove(n);
                } else if (arrAfter.contains("%")) {
                    operator = '%';
                    n = arrAfter.indexOf("%");
                    double num1 = Double.parseDouble(arrAfter.get(n - 1));
                    double num2 = Double.parseDouble(arrAfter.get(n + 1));
                    current = calc.CalculatePackage(num1, num2, operator);
                    arrAfter.set(n, String.valueOf(current));
                    arrAfter.remove(n - 1);
                    arrAfter.remove(n);
                } else {
                    if (arrAfter.contains("+")) {
                        operator = '+';
                        n = arrAfter.indexOf("+");
                        double num1 = Double.parseDouble(arrAfter.get(n - 1));
                        double num2 = Double.parseDouble(arrAfter.get(n + 1));
                        current = calc.CalculatePackage(num1, num2, operator);
                        arrAfter.set(n, String.valueOf(current));
                        arrAfter.remove(n - 1);
                        arrAfter.remove(n);
                    } else if (arrAfter.contains("-")) {
                        operator = '-';
                        n = arrAfter.indexOf("-");
                        double num1 = Double.parseDouble(arrAfter.get(n - 1));
                        double num2 = Double.parseDouble(arrAfter.get(n + 1));
                        current = calc.CalculatePackage(num1, num2, operator);
                        arrAfter.set(n, String.valueOf(current));
                        arrAfter.remove(n - 1);
                        arrAfter.remove(n);
                    }
                }
                //연산 과정 확인용 출력
                //System.out.println(arrAfter);
                //System.out.println(calc.current);
            }
            System.out.println("결과 : " + current);
            System.out.print("더 계산하시겠습니까? (exit 입력 시 종료)\n" + current);
            Scanner scanner2 = new Scanner(System.in);
            String answer = scanner2.nextLine();
            if (answer.equals("exit")) {
                power = false;
            }
            else {
                ArrayFormula arr2 = new ArrayFormula();
                ArrayList<String> arrAfter2 = arr2.makeArray(answer);
                arrAfter.addAll(arrAfter2);
            }
        }
    }
}

