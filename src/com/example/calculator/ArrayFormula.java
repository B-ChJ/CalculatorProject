package com.example.calculator;

import java.lang.Exception;
import static java.lang.Double.parseDouble;

public class ArrayFormula {
    //1. 속성 = 입력받은 값과 연산자(생략)

    //2. 생성자 = Calculator에 보낼 배열
    ArrayFormula arrBefore =  new ArrayFormula();

    //3. 기능 = 문자열 to 배열로 변환
    public Object[] makeArray(String arrBefore) {
        //문자열을 연산자 기준으로 나누기
        String[] arrMiddle = arrBefore.split("[+\\-*/%^=]");

        //arrMiddle 중 실수를 의미하는 값을 문자열에서 실수형으로 바꾸기
        //실수형과 문자형이 같이 있는 배열 Object에 대입
        Object[] arrAfter = new Object[arrMiddle.length];
        for (int i = 0; i < arrMiddle.length; i++) {
            if((arrMiddle[i] == "+") || (arrMiddle[i] == "-") || (arrMiddle[i] == "*") || (arrMiddle[i] == "/") || (arrMiddle[i] == "%") || (arrMiddle[i] == "^")) {
                arrAfter[i] = arrMiddle[i];
            }
            //문자 "="는 배열에 포함❌(저장소 낭비)
            else if (arrMiddle[i] == "=") { }
            //실수는 형 변환해서 입력
            else {
                arrAfter[i] = Double.parseDouble(arrMiddle[i]); }
        }
        return arrAfter;
    }
}
