import java.util.Calendar;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 싱글톤?
        Calendar cal = Calendar.getInstance();

        System.out.printf("%d년\n", cal.get(Calendar.YEAR));



        // 입력을 받기위한 Scanner 객체 생성
        Scanner sc = new Scanner(System.in);

        System.out.print("연도를 입력하세요 : ");
        int year = sc.nextInt(); // year를 입력받음

        System.out.print("월을 입력하세요 : ");
        int month = sc.nextInt(); // month를 입력받음

        // calendar의 연도와 월을 설정
        cal.set(year,month-1,1); // month : 0 ~ 11월

        System.out.printf("일\t월\t화\t수\t목\t금\t토\n");

        // 달의 마지막 날짜를 구함
        int lastOfDate = cal.getActualMaximum(Calendar.DATE);

        // 달의 시작 요일을 구함
        int week = cal.get(Calendar.DAY_OF_WEEK);

        // 처음 시작 요일까지 tab문자를 출력함
        for (int i = 1; i < week; i++) {
            System.out.print("\t");
        }

        // 달력을 출력
        for (int i = 1; i <= lastOfDate; i++) {
            System.out.printf("%d\t", i); // 날을 출력

            // weekend(주말)에 왔는지 체크
            if(week % 7 == 0) {
                System.out.println(); // 줄바꿈
            }
            
            // 요일의 가중치 값 증가
            week++;
        }








        // 생성한 Scanner 객체를 해제함(Release)
        sc.close();
    }
}