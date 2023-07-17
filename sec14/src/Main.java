import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Person kim = new Person(-1,""); // 컴파일 에러가 발생하지 않음
        try {
            kim.ShowInformation(); // 예외 사항이 발생됨
        }
        catch (InfoErrorException exc) {
            System.out.println(exc.getMessage());
        }
        
        Car mycar = new Car(6);
        try {
            mycar.run();
        }
        catch (CarException exc) {
            System.out.println(exc.getMessage());
        }
        
        mycar.hashCode(); // Object 클래스의 메소드

        String str = "Hello World";
        int len = str.length(); // str 객체에 있는 문자열의 길이를 반환함
        System.out.println(len); // 11

        // java에서는 유니코드를 지원함
        str = "가나다";
        len = str.length();
        System.out.println(len); // 3

        char ch = str.charAt(1); // 문자열의 인덱스를 받아서 그 인덱스에 해당하는 문자를 반환함
        System.out.println(ch); // 나

        try {
            ch = str.charAt(5);
            System.out.println(ch); // StringIndexOutOfBoundsException
        }
        catch (StringIndexOutOfBoundsException exc) {
            System.out.println(exc.getMessage());
        }

        int index = str.indexOf("가"); // 문자열을 전달
        System.out.println(index); // 0

        index = str.indexOf('다'); // 문자를 전달
        System.out.println(index); // 2, 매개 변수로 전달된 문자(열)이 있는 3번째 인덱스를 반환

        index = str.indexOf('라');
        System.out.println(index); // 찾는 문자열이 없는 경우에는 -1울 반환함

        // replace()는 원본은 변경하지 않고 바뀐 복사본 문자열을 반환함
        String strNew = str.replace('다','라');
        System.out.println(strNew);

        strNew = str.replace("다", "마");
        System.out.println(strNew);
        System.out.println(str);

        // 주어진 인덱스에서부터 문자열을 잘라내어 반환함
        strNew = str.substring(1);
        System.out.println(strNew); // 나다

        // 시작 인덱스부터 잘라낼 인덱스-1 만큼 잘라내어 반환
        strNew = str.substring(0, 2);
        System.out.println(strNew); // 가나

        // 문자열을 사용할 때 메모리 측면에서 효율성이 안 좋음
        String str3 = "문자열";

        StringBuffer strBuff = new StringBuffer("문자열");
        StringBuilder strBuild = new StringBuilder("문자열2");

        strBuff.append("문자열 추가"); // 문자열 뒤에 추가
        strBuff.delete(2, 3);
        strBuff.insert(1, "문자열 인서트"); // 인덱스 1 위치에 문자열을 끼워 넣음
        strBuff.reverse(); // 문자열 뒤집기

        // Math :  수학 함수 모음, java.lang.Math
        Math.abs(-1);
        Math.max(10, 5);
        double res = Math.random();
        System.out.println(res);

        //
        float dist = 42.195f;
        System.out.println(dist);

        // 숫자(정수, 실수) ===> 문자열로 변환
        String strDist = String.format("%f", dist);
        String strOne = String.format("%d", 1);

        // 문자열 ===> 숫자(정수, 실수)로 변환
        int newNumber = Integer.parseInt("200");
        float newFloat = Float.parseFloat("42.195");

        System.out.println(strBuff); // 가추 열자문자트서인 열자문문
        System.out.println(strBuild); // 문자열2

        // API : Application Programming Interface(s)
        // ===> 아주 유용한 함수들의 모임

        // java.lang 패키지 : 자바에서 기본으로 제공하는 패키지
        
        int number; // int는 데이터 타입이고 number는 변수임!
        String str1; // 데이터 타입이 아니고 클래스임!
        String str2; // String은 클래스이고 str2는 객체임!

        // Wrapper Class
        byte a;    // Byte
        short b;   // Short
        int c;     // Integer
        long d;    // Long
        float f;   // Float
        double g;  // Double
        char e;    // Character
        boolean h; // Boolean
        
        Integer myNum = 1; // Integer는 int 타입의 기능을 확장해서 구현한 클래스

//        // file 오픈 하고
//        Scanner sc = new Scanner(System.in);
//
//        // 예외 처리
//        try {
//            // 배열 처리
//            // 사용자 입력 관련
//
//            // file 관련된 작업을 함
//            int number = sc.nextInt();
//        }
//        catch (ArrayIndexOutOfBoundsException exc) {
//            System.out.println(exc.getMessage());
//        }
//        catch (InputMismatchException exc) {
//            System.out.println(exc.getMessage());
//        }
//        catch (NullPointerException ex) {
//            System.out.println(ex.getMessage());
//        }
//        catch (ArithmeticException exc) {
//            System.out.println(exc.getMessage());
//        }
//        catch (Exception exc) {
//            // 런타임에러를 발생시키지 않고 싶을 때 사용
//        }
//        finally {
//            // 할당된 시스템 자원을 해제하는데 주로 사용됨
//            // 무조건 처리를 해야되는 코드
//
//            // file.close();
//            sc.close();
//        }
    }
}