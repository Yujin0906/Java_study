import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Totaler라는 클래스를 만들기
        // protected int total;
        // total은 생성자에서 0으로 초기화됨
        // add(int i) ===> total에 i만큼 누적을 시킴(total += i)
        
        // 두 개의 스레드를 실행시켜서 결과가 1부터 10까지 더한 합이 나오게 출력
        // 55 + 55 = 110 즉, Totaler의 total 값이 110이 나오면 됨

//        Totaler totaler = new Totaler();
//
//        Thread th1 = new Thread(new AddThread(totaler));
//        Thread th2 = new Thread(new AddThread(totaler));
//
//        th1.start();
//        th2.start();

        // String 문자열
        String str = "aBcDeFg";
        String strResult = "";

        // System.out.println(str.toUpperCase()); // ABCDEFG

        // Character : char의 Wrapper 클래스
        for(Character ch : str.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                strResult += ch;
            }
            else {
                strResult += Character.toUpperCase(ch);
            }
        }
        System.out.println(strResult); // ABCDEFG

        // 1478 ===> ONEFOURSEVENEIGHT
        // 23456 ===> TWOTHREEFOURFIVESIX



    }
}
