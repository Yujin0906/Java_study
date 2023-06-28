// class의 정의
/*public class Myclass {
    // 데이터
    int n;
    long distance;

    // 행위
    // int MyMethod(파라미터);
    // {
    //      coding ...
    // }

}*/

import PersonPack.MyFirstClass;

public class Main {
    // Method ===> 객체의 행위
    public static void main(String[] args) { // psvm
        // Object Oriented Programming Language

        // Scanner : Class 명
        // sc : Object 명
        // new : 메모리에 Object 생성하여 로드(load)
        // ( 파라미터 ) : 변수, 설계한 상태에 따라 다름
        /*Scanner sc = new Scanner(System.in);
        sc.close(); // sc(object)의 메소드

        Scanner sc2 = new Scanner(System.in);
        sc2.close(); // sc(object)의 메소드*/

        // String은 class
        // Object는 str
        /*String str = "abcdefg";
        String str1 = "hijklmnop";
        String str2 = "qrstuvwxyz";*/

        // Primitive Type
        // class는 데이터와 행위로 구성이 되어 있다.

        MyFirstClass myObj = new MyFirstClass();
        myObj.number = 10;
        myObj.myString = "이것은 첫 번째 클래스로 만든 객체입니다.";

        System.out.println(myObj.number);
        System.out.println(myObj.myString);

        MyFirstClass myObj2 = new MyFirstClass();
        myObj2.number = 20;
        myObj2.myString = "이것은 두 번째 클래스로 만든 객체입니다.";

        System.out.println(myObj2.number);
        System.out.println(myObj2.myString);

        // 클래스의 이름 : Person
        // 클래스의 속성 : age(정수)와 name(String) 이라는 필드 필요
        // 클래스는 기본 생성자 필요

        Person hwang = new Person(30,"황성훈");
        // hwang.ShowName(); // private method
        // hwang.name = "황성훈"; // protected : package내부에서는 접근 가능
        // hwang.age = 10;    // private
        hwang.ShowInformation();
        // Person.StaticMethod();


        Person kim = new Person(25,"김영주");
        kim.ShowInformation();

        Person lee = new Person(25,"이해준");
        lee.ShowInformation();
    }
}