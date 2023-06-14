import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 제어문50
        // if (조건)
        {
            // 참인경우 수행
        }

        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        scanner.close();

        if (age >= 18)
        {
            System.out.println("당신은 성인입니다.");
        }

        else
        {
            System.out.println("당신은 성인이 아닙니다.");
        }

        if (age > 18)
        {

        }
        else if (age == 18)
        {
            System.out.println("당신은 성인인지...??");
        }
        else
        {

        }


        scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.close();

        switch (count)
        {
            case 1:
                System.out.println("1을 입력");
                break;
            case 2:
                System.out.println("2를 입력");
                break;
            case 3:
                System.out.println("3을 입력");
                break;
            case 4:
                System.out.println("4를 입력");
                break;
            case 5:
                System.out.println("5를 입력");
                break;
            default:
                System.out.println("?");
                break;
        }




        scanner = new Scanner(System.in);
        //int count = scanner.nextInt();
        
        String strFruit = scanner.nextLine(); // 문자열을 입력받음
        scanner.close();

        switch (strFruit)
        {
            case "Banana":
                System.out.println("바나나");
                break;
            case "apple":
                System.out.println("사과");
                break;
            default:
                System.out.println("?");
                break;
        }


    }
}