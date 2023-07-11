import javax.swing.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ExceptionTestMethod();
        ExceptionFinalize();

        // throw exception

        Scanner sc = new Scanner(System.in);

        Outer out = new Outer("Outer 객체");
        try {
            out.ShowSelection(sc);
        }
        catch ( InputMismatchException exc) {
            System.out.println(String.format("Outer 클래스의 ShowSelection 메소드에서 에러 발생 : %s",exc.getMessage())); // null
        }

        // 키보드로부터 정수값 2개를 입력받고, 나누기 연산을 하여 결과를 출력
        // 2가지 예외 처리를 해야 함 ( devide by zero, Input missmath 처리를 해야함)
        try {
            out.ShowDevide(sc);
        }
        catch (ArithmeticException exc) {
            System.out.println(exc.getMessage());
        }

        sc.close();
        // System.out.println(out);

        // Outer 클래스에서 생성한 Inner 클래스(객체)를 가져온다.
        // Outer.Inner inn = out.getInner();

        // Inner 클래스에 접근하기
//        Outer.Inner inn =  out.new Inner();
//        inn.setValue(100);
//        System.out.println( inn ); // 100

        // 메소드 클래스를 정의할 수 있음
//        class MethodClass { // 요즘 잘 쓰이지 않음, 알고만 있으면 됨
//
//        }
//
//        int value1 = 10;
//        int value2 = 0;
//        Scanner sc = new Scanner(System.in);
//        value2 = sc.nextInt(); // 키보드로부터 입력을 받아 value2에 대입
//
//        // 어떤 코드가 필요 ??
//        int value3 = 0;
//        if ( value2 != 0) { // 반드시 나누기 연산을 하기 전에 분모가 0인지 체크
//            value3 = value1 / value2; // Divide By Zero Error 발생
//        }
//        sc.close();
//
//        int len = 100;
//        int[] arr = new int[100];
//
//        // len = 200; // len 값을 변경할 수 있음
//        for(int i = 0; i<arr.length; i++) { // Array Index Out of Bounds Error 발생
//            arr[i] = 10; // arr[0], arr[1], arr[2], arr[3]
//        }
    }

    public static void ExceptionTestMethod() {
        int val3 = 0;
        // 예외 처리(Exception)
        // try { 코드(들) 작성 } catch( 처리 해야 될 예외 사항 ){ 예외가 발생 했을 때 코드 }
        try {
            int val1 = 10;
            int val2 = 0;
            val3 = val1 / val2;
        }
        catch ( ArithmeticException exc ) {
            val3 = 0;
            System.out.println( exc.getMessage() ); // 에러 메시지를 콘솔에 출력 or 로그 파일에 기록함
        }

        // NullPointerException : 생성하지 않은 객체를 사용하려고 할 때 발생!
        try {
            Outer out = null; // out = new Outer("kim");
            String strOut = out.toString();
        }
        catch (NullPointerException exc) {
            String strOut = "";
            System.out.println( exc.getMessage() );
        }

        // NumberFormatException
        String strNumber = "10.5"; // 문자열(실수, double type)
        int number = 0;
        try {
            number = Integer.parseInt(strNumber); // 정수로 표시된 문자열을 받아서 분석하여 정수값으로 변환하는 함수
        }
        catch (NumberFormatException exc) {
            number = 0;
            System.out.println( exc.getMessage() );
            System.out.println("문자열을 정수로 변환하는 과정에서 에러가 발생함");
        }

        // ArrayIndexOutOfBoundsException
        try {
            int a = 10;
            int b = 0;
            int c = a / b; // / by zero 에러 발생

            String strNum = "10.5";
            int myInt = Integer.parseInt(strNum); // For input string: "10.5" 에러 발생

            int[] arr = new int[3];
            for (int i = 0; i <= 3; i++) {
                arr[i] = i * 10; //
            }
        }
        catch (ArithmeticException exc) {
            System.out.println(exc.getMessage());
        }
        catch (NumberFormatException exc) {
            System.out.println(exc.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            System.out.println("배열의 첨자를 잘못 사용하였습니다.");
        }
        catch (Exception exc) {
            // 위에서 걸러지지 않은 에러 처리를 해줌
            System.out.println("알 수 없는 예외사황이 발생함");
        }
    }

    public static void ExceptionFinalize() {
        int val1 = 10;
        int val2 = 0;
        int val3 = 0;

        try {
            val3 = val1 / val2;
        }
        catch (ArithmeticException exc) {
            System.out.println(exc.getMessage());
        }
        finally { // 무조건 실행되는 블럭
            // try 실행 ==> error가 있으면 ==> error block 실행 ==> finally 실행
            // try 실행 ==> error가 없으면 ==> finally 실행

            System.out.println(val3); // 무조건 수행되는 코드
        }
    }
}