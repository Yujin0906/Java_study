import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 배열 : 같은 데이터 타입의 변수들이 메모리상에 나란히 열거되어 있는 형태
        int [] arrayNumbers = new int[10];

        arrayNumbers[0] = 100;
        arrayNumbers[1] = 100;
        arrayNumbers[2] = 100;
        arrayNumbers[3] = 100;
        arrayNumbers[4] = 100;
        arrayNumbers[5] = 100;
        arrayNumbers[6] = 100;
        arrayNumbers[7] = 100;
        arrayNumbers[8] = 100;
        arrayNumbers[9] = 100;

        // n개의 배열 요소에 접근하기 위한 인덱스의 값은 0 ~ n-1까지 인덱싱 가능
        
        for(int i = 0; i < 10; i++)
            arrayNumbers[i] = 100;

        // 배열의 선언
        float [] arrayRealNumbers = new float[5];
        
        // 배열의 선언과 초기화를 동시에 함
        String [] arrayString = new String[] {"apple", "banana", "grape"}; // 숫자 쓰지 않기!

        for(String strFruit : arrayString)
            System.out.println(strFruit);

        // 2차원 배열
        int [][] matrix = new int[/*row*/][/*column*/]{{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}}; // int[3][5]
        for (int i = 0; i < 3; i++)
        {
            for(int j = 0; j < 5; j++)
            {
                System.out.print(matrix[i][j] + ",");
            }
            System.out.println();
        }

        double [][] dists = new double[2][3];
        for (int i = 0; i < 2; i++)
        {
            for(int j = 0; j < 3; j++)
            {
                dists[i][j] = 1.1d; // 1.1로 모두 초기화
            }
        }

        // 1차원 배열 응용 문제
        for(int i = 0; i < arrayRealNumbers.length; i++) // arrayRealNumbers.length -> 배열 전체의 길이를 의미
        {
            
        }

        // String 배열 5칸짜리를 만들어, 사용자로부터 입력을 받아 각각의 요소에 대입
        // String 배열의 모든 요소를 출력 ==> for( : )을 이용
        String [] arrayInput = new String[5];
        for(int i = 0; i < arrayInput.length; i++)
        {
            Scanner scanner = new Scanner(System.in);
            arrayInput[i] = scanner.nextLine();
        }
        for(String str : arrayInput)
        {
            System.out.print(str + " ");
        }
    }
}