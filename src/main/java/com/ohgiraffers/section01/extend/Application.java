package com.ohgiraffers.section01.extend;

public class Application {

    public static void main(String[] args) {

        /* 수업목표 : 상속에 대해 이해할 수 있다. */
        /* 필기
        *   상속(inheritance)은 현실 세계의 상속과 비슷한 개념이다.
        *   부모가 가지고 있는 재산(자바에서는 클래스가 가지는 멤버)을 자식이 물려받는 의미이다.
        *   클래스 또한 부모 클래스와 자식 클래스로 역할을 나누어서
        *   부모가 가지는 멤버를 자식이 물려받아 자기의 멤버인 것처럼 사용할 수 있도록 만든 기술이다.
        *
        *   필기
        *    하지만 단순 물려받는 개념보다 조금 더 나아간다면
        *    자바에서의 상속은 부모클래스의 확장(extend)의 개념을 가진다.
        *    물려받아서 자신의 것처럼 사용하는 것 뿐 아니라 추가적인 멤버도 작성이 가능하다.
        *    특히 메소드 재정의(overriding)이라는 기술을 이용해서 부모가 가진 메소드를 재정의하는 것도 가능하다.
        *
        *   필기
        *    메소드 재정의(overriding)이란, 부모가 가지는 메소드 선언부를 그대로 사용하면서
        *    자식 클래스가 정의한 메소드대로 동작하도록 구현 몸체 {} 부분을 새롭게 다시 작성하는 것이다.
        *    메소드 재정의를 하면 메소드를 호출할 시 재정의한 메소드가 우선적으로 동작하게 된다.
        *
        *   필기
        *    상속 - 장점
        *     1. 새로운 클래스를 작성할 시 기존에 작성한 클래스를 재사용할 수 있다.
        *       1-1. 재사용 시 생산성을 크게 향상시킬 수 있다. (새로 작성하는 것보다 빠르다.)
        *       1-2 공통적으로 사용하는 코드가 부모클래스에 존재하면 수정사항이 생길 시 부모클래스만 수정해도 전체적으로 적용된다. (유지보수성 증가)
        *     2. 클래스간의 계층 관계까 형성되며 다형성의 문법적인 토대가 된다.
        *
        *    필기
        *     상속 - 단점
        *      1. 부모클래스 기능 추가/변경 시 자식클래스가 정상 작동하는 지 예측 불가
        *         상속 구조가 복잡해질수록 예측이 어렵기 때문에 오히려 유지보수에 악영향 미칠 수도 있음
        *      2. 자식 클래스 내 주요 사용 기능인 경우, 부모클래스 변경 시 자식 클래스 모두에 영향 -> 유지보수 악영향
        *      3. 부모 클래스에서 의미있는 기능이 자식 클래스에서는 의미없을 수 있음 (불필요 기능까지 전가)
        *
        *    필기
        *     상속의 장점인 재사용만으로 사용하기엔 오용의 가능성 높아 유지보수에 좋지 않은 코드를 작성할 확률 높음
        *     상속은 IS-A 관계로 구분되는 경우에만 사용
        *     e.g) fireCar is a car(o) / car is a fireCar(x)
        *
        *     필기
        *      객체지향 설계 관점에서 바라보는 상속
        *      모든 객체는 자신이 수신한 메세지에 대해 응답해야하는 책임이 있으며, 그 책임의 규모는 적절해야 한다.
        *      적절한 책임을 가진 객체들이 서로 협력(메세지 수신과 응답)을 통해 프로그램이 동작하는 것이 객체지향 프로그램이다.
        *   */

        /* 목차 1. Car 인스턴스 생성 후 메소드 호출 */
        Car car = new Car();

        car.soundHorn();
        car.run();
        car.soundHorn();
        car.stop();

        System.out.println();


        /* 목차 2. FireCar 인스턴스 생성 후 Car 클래스에 작성한 메소드 사용 가능 확인*/

        FireCar fireCar = new FireCar();

        /* 필기 - 우리는 분명 아무것도 작성하지 않았는데 Car(부모)클래스가 가진 메소드를 사용했다. */
        fireCar.soundHorn();
        fireCar.run();
        fireCar.soundHorn();
        fireCar.stop();
        fireCar.soundHorn();

        /* 목차 3. 상속은 확장의 의미이므로 추가적인 기능도 작성할 수 있다. */
        fireCar.sprayWater();

        System.out.println();

        /* 목차 4. RacingCar 인스턴스 생성 후 메소드 호출 테스트 */

        RacingCar racingCar = new RacingCar();


        racingCar.soundHorn();
        racingCar.run();
        racingCar.soundHorn();
        racingCar.stop();
        racingCar.soundHorn();


    }
}
