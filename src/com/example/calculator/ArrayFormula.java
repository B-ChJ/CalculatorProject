package com.example.calculator;


public class ArrayFormula {
    //1. 속성 = 입력받은 값과 연산자
    //String arrBefore;
    //2. 생성자 = 배열 형태로 정렬
    public String[] makeArray(String arrBefore) {
        //문자열을 연산자 기준으로 나누기
        String[] arrAfter = arrBefore.split("[+\\-*/%^=]");
        //배열 잘 나눠지는지 확인용 출력
        for (String s : arrAfter) {
            System.out.println(s);
        }
        return arrAfter;
    }
}
