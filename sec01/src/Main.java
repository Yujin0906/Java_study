import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
/*        System.out.print("Hello"); 문자열(string), 괄호 안에 있는 내용을 출력함
        System.out.print("Hello");
        System.out.print("Hello");*/
        System.out.println("Hello Java!!"); // sout(자동완성), println(print line) 줄 단위 출력
        System.out.println(); // 줄 바꿈
        System.out.println("Hello Java!!");
        System.out.println();
        System.out.println("Hello Java!!");
//        System.out.println(3*4);

        // System.out.printf(""); // souf(자동완성)

        // 변수 (Variable)

        int number = 0;
        int numberRandom = 0;
        int number_random = 0;
        int int_number = 0;

        // 정수형 데이터 타입의 변수
        byte a = 1;   // 1byte(-128 ~ +127)
        // char b = 2;   // 2byte
        short c = 3;  // 2byte
        int d = 5;    // 4byte
        long e = 10;  // 8byte

        // 실수형 데이터 타입의 변수
        float f = 0.1f;    // 4byte
        double g = 0.001d; // 8byte

        // 논리형 데이터 타입의 변수
        boolean h = true;

        // 문자열(형) 데이터 타입의 변수
        String i = "Hello Java";

        char ch = 'A';
        char A = 66;

        String str = "Hello Java";

        System.out.printf("number = %d\n", c);
        System.out.printf("Real Number = %f\n",123.45f);
        System.out.printf("문자 = %c",ch);

        System.out.println();
        System.out.println();
        
        // 형 변환
        // c = a 가능 / a = c 불가능 -> a = (byte)c; 이렇게 형 변환 해야 함

        c = a;
        a = (byte)128; // (byte)c;
        System.out.println(a);

        d = (int)g;
        g = d;

        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println("a" + "b" + "c\n");

        System.out.printf("당신의 점수는 %d점입니다.\n", 10);
        System.out.printf("당신의 시력은 %f입니다.\n", 0.1f);
        System.out.printf("당신의 학점은 %c입니다.\n", 'a');
        System.out.printf("이것은 문자열과 문자열의 조합입니다. : %s\n", "string");

        System.out.printf("당신의 시력은 왼쪽 %6.4f 오른쪽 %3.1f입니다.\n", 0.1f, 0.2f); // 소수점 포함해서 3, 소수점 기준 뒤로 1 => 3.1f
        System.out.printf("당신의 학점은 %c%c입니다.\n\n", 'A', '+');


        System.out.printf("당신의 학점은 %5d입니다\n",1);
        System.out.printf("당신의 학점은 %5d입니다\n",10);
        System.out.printf("당신의 학점은 %5d입니다\n",100);
        System.out.printf("당신의 학점은 %5d입니다\n",1000);
        System.out.printf("당신의 학점은 %5d입니다\n\n",10000);

        // 문제 1
        // 3.141592768.....을 System.out.printf()문을 사용하여 3.14까지만 표현
        double pi = 3.141592768d;
        System.out.printf("%4.2f\n",pi);

        // 문제 2
        // 숫자 1, 2, 3을 각각 변수에 저장하고 1, 2, 3처럼 출력
        String str1 = "1, ";
        String str2 = "2, ";
        char ch1 = '3';

        System.out.printf("%s%s%c\n",str1,str2,ch1);

        // 문제 3
        // String형 변수 1개에 "안녕하세요", "저는 자바를 공부하고 있습니다"를 저장하고 하나의 출력문을 사용하여 각각 한 줄씩 출력
        String str3 = "안녕하세요\n저는 자바를 공부하고 있습니다";
        System.out.printf("%s\n\n",str3);

        // Scanner라는 클래스를 사용하여 scanner라는 객체를 생성함
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int number1 = scanner.nextInt();

        System.out.print("두 번째 숫자를 입력하세요 : ");
        int number2 = scanner.nextInt();
        scanner.close(); // 사용했으면 무조건 닫아야 함

        System.out.printf("첫 번째 숫자 : %d\n두 번째 숫자 : %d\n",number1, number2);

        // number1 = xxx, number2 = xxx
    }
}
