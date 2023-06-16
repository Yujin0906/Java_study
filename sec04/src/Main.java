import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // System.out.println("반복문");

        /*
         * while() {}
         *
         * do {} while();
         *
         * for(;;) {}
         * for(:) {}
         *
        */

        /*int count = 0;
        while (count < 10)
        {
            // 소괄호 안에 있는 조건이 참인 동안 수행됨!!!
            System.out.println("count = " + count);
            ++count;
        }*/

        // while()문은 조건에 따라 반복문 안의 내용이 한 번도 수행되지 않을 수 있고,
        // do ~ while()문은 적어도 한 번은 수행해야 할 때 사용함.

        /*count = 0;
        // do ~ while()
        do {
            System.out.println("count = " + count);
            ++count;

        }while(count<10); // count가 10보다 작은동안 반복 수행

        count = 0;
        while(true) // 무한루프
        {
            System.out.println("조건이 참인 동안 반복 수행됩니다.");
            if ( count % 2 == 0 )
                System.out.println( count );
            else
            {
                ++count;
                continue; // 더 이상 이 아래 문장들을 수행하지 않고 바로 위로 돌아감
            }
            
            if (++count > 10)
                break; // 현재의 루프를 바로 빠져나감
        }*/
        /*
        while (true)
        {
            while(true)
            {
                while(true)
                {
                    do {
                        break;
                    }while(true);
                }
            }
        }
        */

        // for(;;)
        /*int total=0;
        for(int i = 0; i < 10; i++) // 1 = 0부터 i < 10동안 i를 1씩 증가시키면서 {}내용을 반복 수행함
        {
            total += i; // total = total + i;
            System.out.println("total = " + total);
        }

        String strABC = "abcdefg";
        for(char ch : strABC.toCharArray())
        {
            System.out.println(ch);
        }*/

        // 문제 1)
        // 사용자로부터 특정 수를 입력받고 1 ~ 입력받은 수까지의 합을 구하여 출력하시오 (while, do~while, for사용)
        // 사용자로부터 입력받은 값은 양의 정수 : countOfUser >= 1

        /*
        // ★while 사용★
        Scanner scanner = new Scanner(System.in);
        int countOfUser = scanner.nextInt(); // 사용자로부터 정수값을 입력 받을 수 있음
        int sum = 0;
        int i = 0;
        while(i <= countOfUser)
        {
            sum += i;
            ++i;
        }
        System.out.printf("%d",sum);
        scanner.close();
        */

        /*
        // ★do~while 사용★
        Scanner scanner = new Scanner(System.in);
        int countOfUser = scanner.nextInt(); // 사용자로부터 정수값을 입력 받을 수 있음
        int sum = 0;
        int i = 0;
        do {
                sum += i;
                ++i;
        }while(i <= countOfUser);
        System.out.printf("%d",sum);
        scanner.close();
        */

        /*
        // ★for 사용★
        Scanner scanner = new Scanner(System.in);
        int countOfUser = scanner.nextInt(); // 사용자로부터 정수값을 입력 받을 수 있음
        int sum = 0;
        for(int i=1;i<=countOfUser;i++)
        {
            sum += i;
        }
        System.out.printf("%d",sum);
        scanner.close();
        */

        // 문제 2)
        // 1 ~ 100까지 3의 배수들만 화면에 출력하기(while문 사용)
        int i = 1;
        while(i<=100)
        {
            i++;
            if(i%3==0)
                System.out.printf("%d ",i);
        }
        System.out.println();

        // 문제 3)
        // for문을 이용하여 1 ~ 55사이 홀수의 개수와 짝수의 개수를 구하시오
        int count_j = 0;
        int count_h = 0;
        for ( int j = 1; j < 56; j++ )
        {
            if ( j % 2 == 1 )
                count_h++;
            else
                count_j++;
        }
        System.out.printf("홀수 : %d개, 짝수 : %d개", count_h, count_j);
        System.out.println();
        
        // 문제 4)
        // strInput 변수에 있는 문자열의 개수 구하여 출력
//        Scanner scanner = new Scanner(System.in);
//        String strInput = scanner.nextLine(); // 문자열을 입력받음
//        int count = 0;
//        for(char ch : strInput.toCharArray())
//        {
//            count++;
//        }
//        System.out.printf("문자열의 개수 : %d",count);
//        scanner.close();

        // 문제 5)
        // 사용자로부터 문자열을 입력받아 화면에 그대로 출력
        // 단, 사용자의 입력이 bye이면 반복 루프 탈출 do ~ while()을 사용
        // 문자열의 비교 - 대소문자를 같게 볼지 다르게 볼지 결정
        Scanner scanner2 = new Scanner(System.in);
        String str;
        do {
            str = scanner2.nextLine();
            str = str.toUpperCase(); // 대문자로 변환
            str = str.toLowerCase(); // 소문자로 변환
            if(str.equals("BYE"))
                break;
            if(str.equals("bye"))
                break;

            System.out.printf("%s\n",str);
        }while(true);

        scanner2.close();
    }
}