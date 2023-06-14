import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int num3;
        // 연산자(Operators)

        // 단항, 이항, 삼항
        // 단항으로 쓰일 때는 +, -는 부호로 사용
        num3 = -num1;
        System.out.printf("num3 = %d\n",num3);

        num3 = ++num1; // num1에 있는 값을 1 증가하여 num3에 대입
        num3 = --num1; // num1에 있는 값을 1 감소하여 num3에 대입
        // (++num1) == (num1 = num1 + 1) == (num += 1) 세 개는 다 같은 의미(뜻)

        num3 = num1++;

        // 이항으로 쓰일 때는 사칙연산(+, -, *, /, %(나머지))
        int sum = num1 + num2; // 연산식
        System.out.printf("sum = %d\n",sum);

        sum = num1 - num2; // 연산식
        System.out.printf("sum = %d\n",sum);

        sum = num1 * num2; // 연산식
        System.out.printf("sum = %d\n",sum);

        sum = num1 / num2; // 연산식
        System.out.printf("sum = %d\n",sum);

        sum = num1 % num2; // 나머지 연산식
        System.out.printf("sum = %d\n",sum);

        sum %= num2;
        
        
        // 관계 연산자, 비교 연산자 ===> 결과는 항상 boolean 값을 가짐
        boolean isOk = true; // or false
        isOk = num1 > num2;  // Greater Then
        isOk = num1 >= num2; // Greater or equal
        isOk = num1 <= num2; // Less Then
        isOk = num1 < num2;  // Less or equal
        isOk = num1 == num2; // 두 값이 같으면 true, 다르면 false
        isOk = num1 != num2; // 두 값이 같으면 false, 다르면 true


        // 논리 연산자 ===> 결과는 항상 boolean 값을 가짐
        // &&(AND), ||(OR), ^(XOR), !(NOT)
        boolean result = true && true; // result는 true, 두 항 모두 true여야 true
        result = true && false; // result는 false
        result = false && true; // result는 false
        result = false && false; // result는 fasle

        result = true || true; // result는 true, 두 항 중 하나라도 true면 true
        result = true || false; // result는 true
        result = false || true; // result는 true
        result = false || false; // result는 fasle

        result = true ^ true; // result는 false, 두 항이 서로 같으면 false, 서로 다르면 true
        result = true ^ false; // result는 true
        result = false ^ true; // result는 true
        result = false ^ false; // result는 false

        result = !true; // result는 false
        result = !false; // result는 true
        
        // 논리 연산자의 일반적인 사용 예
        result = (num1 > num2) && (num1 == num2);


        // 삼항 연산자
        // 결과 = 조건 ? 참 : 거짓;
        
        // num1이 num2보다 크면 num1을 대입, 작으면 num2를 대입
        num3 = (num1 > num2) ? num1 : num2;

        // 비트 연산자
        num3 = num1 << 2; // num1의 값을 왼쪽으로 2비트 이동시켜서 num3에 저장
        num3 = num1 >> 2; // num1의 값을 오른쪽으로 2비트 이동시켜서 num3에 저장

        // 0000 0001 -> 8421 코드
        // 0000 0001을 << 2한 결과는 0000 0100이다
        // 0000 0001을 >> 2한 결과는 0000 0000이다

        // 문제 1)
        // Scanner 클래스를 이용하여 2개의 수를 입력받고 각각 num1, num2라는 정수형 변수에 저장한다
        // num1, num2를 이용하여 사칙 연산과 나머지 연산을 수행하고 결과를 출력한다
        /*Scanner scanner = new Scanner(System.in);
        System.out.print("첫 번째 숫자를 입력하세요 :");
        num1 = scanner.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        num2 = scanner.nextInt();
        scanner.close();

        sum = num1 + num2;
        int minus = num1 - num2;
        int rhq = num1 * num2;
        int na = num1 / num2;
        int namugi = num1 % num2;

        System.out.printf("%d + %d = %d\n",num1,num2,sum);
        System.out.printf("%d - %d = %d\n",num1,num2,minus);
        System.out.printf("%d * %d = %d\n",num1,num2,rhq);
        System.out.printf("%d / %d = %d\n",num1,num2,na);
        System.out.printf("%d %% %d = %d\n",num1,num2,namugi);*/

        // 문제 2)
        // num1과 num2를 입력받고 삼항연산자를 이용하여 두 수중 큰 수를 변수 num3에 저장하여 num3를 출력
        /*Scanner scanner2 = new Scanner(System.in);
        num1 = scanner2.nextInt();
        num2 = scanner2.nextInt();
        scanner2.close();
        num3 = (num1 > num2) ? num1 : num2;
        System.out.printf("더 큰 수는 %d입니다.",num3);*/

        // 문제 3)
        Scanner scanner3 = new Scanner(System.in);
        int a = scanner3.nextInt();
        int b = scanner3.nextInt();
        scanner3.close();
        System.out.printf("%d%d\n",a,b);

        // 문제 4)
        // num1, num2를 입력받아, num1이 num2의 배수이면 true를 출력하고 아니면 false를 출력
        Scanner scanner4 = new Scanner(System.in);
        num1 = scanner4.nextInt();
        num2 = scanner4.nextInt();
        scanner4.close();
        String result5 = (num1 % num2) == 0 ? "true":"false";
        System.out.println(result5);












    }
}