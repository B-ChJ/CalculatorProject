package com.example.calculator;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class ArrayFormula {
    //1. 속성 = 입력받은 값과 연산자(생략)

    //2. 생성자 = Calculator에 보낼 배열
    //ArrayFormula arrBefore =  new ArrayFormula();

    //3. 기능 = 문자열 to 배열로 변환
    public ArrayList<String> makeArray(String arrBefore) {
        //문자열을 연산자 기준으로 나누기 + 연산자도 포함시키기
        StringTokenizer arrMiddle =  new StringTokenizer(arrBefore, "+-*/%^=", true);
        //배열 리스트 생성 + 연산자로 구분된 인덱스 집어넣기
        ArrayList<String> arrAfter = new ArrayList<>(arrMiddle.countTokens());
        int i = 0;
        while (arrMiddle.hasMoreTokens()) {
            String token = arrMiddle.nextToken();
            if(token.equals("=")) {
                break;
            }
            else {
                arrAfter.add(i, token);}
            i++;
        }
        return arrAfter;
    }
}
