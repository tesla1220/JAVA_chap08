package com.ohgiraffers.section02.overriding;

public class SuperClass {

    /* 수업목표 : 오버라이딩(overriding) */
    /* 필기
    *   오버라이딩(Overriding) : 부모클래스에서 상속받은 메소드를 자식 클래스에서 재정의해 사용하는 것
    *   < 오버라이딩 성립 가능 조건 >
        1. 메소드 이름, 리턴타입이 동일
        2. 매개변수의 타입, 개수, 순서 동일
        3. private 메소드 오버라이딩 불가 => 접근 불가하기 때문
        4. final 키워드가 포함된 메소드 오버라이딩 불가 => 값 변경 불가하기 때문
        5. 접근제한자는 부모 메소드와 같거나 더 넓은 범위여야 함
       */

    /* 오버라이딩 테스트를 위한 기준 메소드 */

    public void method(int num) {}

    private void privateMethod() {}

    public final void finalMethod() {}

    protected void protectedMethod() {}



}
