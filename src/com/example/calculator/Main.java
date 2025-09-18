package com.example.calculator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
import java.util.StringTokenizer;

//import static sun.jvm.hotspot.utilities.CStringUtilities.getString;

public class Main {
    public static void main(String[] args) {
        String current = "";
        Scanner scanner = new Scanner(System.in);
        String arrBefore = scanner.nextLine();
        //입력받은 문자열 나누기 → ArrayFormula.java
        ArrayFormula arr =  new ArrayFormula();
        ArrayList<String> arrAfter = arr.makeArray(arrBefore);
        System.out.println(arrAfter);
        //예외 처리
            int i;
            for (i = 0; i < arrAfter.size() - 1; i++) {
                if (arrAfter.get(i).toString() == "/" && arrAfter.get(i + 1).toString() == "0") {
                    System.out.println("ERROR");
                }
            }

        //arrAfter 배열을 Calculator로 보내 연산 작업을 하고 결과값 current를 받는다.
        //Calculator calc = new Calculator();

        }
    }

