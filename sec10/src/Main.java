import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) { // args : 프로그램(Main)을 실행할 때 옵션 사항으로 전달하는 문자열 배열 파라미터
//        // 정적인 배열의 선언과 할당
//        int[] arrNumbers = {1, 2, 3, 4, 5}; // 배열의 선언과 동시에 초기화
//        String[] arrStrings = {"apple", "banana", "tomato", "kiwi"};
//
//        Scanner sc = new Scanner(System.in);
//        int size = sc.nextInt();
//
//        // 동적인 배열의 선언
//        int[] arrNumbers2 = new int[5]; //  5칸 짜리 정수형 배열을 선언한다.
//        String[] arrStrings2 = new String[10];

        // 5칸짜리 정수형 배열을 만들어 각각의 요소에 1~n까지의 난수를 입력하고
        // 정렬없이, 중복체크 없이 출력하는 메소드 만들기
        // 호출도 하기
        int[] numbers = new int[5];
        InsertDataToArray(numbers, 44); // 호출(call method)
        System.out.println();

        int target = 3;
        int index = Find(numbers, target); // numbers배열에서 target값을 찾는 메소드 호출
        if(index>=0){ // index 값이 0이상이면 찾음
            System.out.printf("%d번째 인덱스에서 값 %d를 찾음\n",index,target);
        }
        else{
            System.out.println("못찾음\n");
        }

        // ArraySort를 호출 전과 후로 나누어 출력해라
        System.out.print("ArraySort 호출 전 : ");
        for(int num : numbers)
            System.out.printf("%d ",num);
        System.out.println();
        
        //Arrays.sort(numbers); // java.utils.Arrays에 있는 기능 사용
        ArraySort(numbers);

        System.out.print("ArraySort 호출 후 : ");
        for(int num : numbers)
            System.out.printf("%d ",num);
        System.out.println();
        // 한 줄은 홀수만 출력 :
        // 한 줄은 짝수만 출력 :
        System.out.print("짝수만 출력 : ");
        for(int num : numbers) {
            if(num % 2 ==0)
                System.out.printf("%d ", num);
        }
        System.out.println();
        System.out.print("홀수만 출력 : ");
        for(int num : numbers) {
            if(num % 2 ==1)
                System.out.printf("%d ",num);
        }

        // 두 개의 임의의 정수형 배열이 있음
        // 두 배열의 크기를 정하여 결과를 반환하는 메소드를 만듦
        // 두 배열의 길이가 다르면 배열의 길이가 큰 쪽이 크다 : (int[] arr1, int[] arr2)
        //       ===> arr1 > arr2 : return 1 / arr1 == arr2 : return 0 / arr1 < arr2 : return -1
        // 두 배열의 길이가 같으면 배열의 모든 수를 더하여 크기를 결정
        //       ===> arr1 > arr2 : return 1, return 0 / arr1 < arr2 : return -1

        int[] arr1 = new int[3];
        int[] arr2 = new int[4];

        public static int CompareTwoArray(int[] arr1, int[] arr2) {
            int len1 = arr1.length;
            int len2 = arr2.length;
            if(len1 > len2)
                return 1;
            else if (len1 < len2)
                return -1;
            else {
                int total1 = 0;
                int total2 = 0;
                for(int num : arr1)
                    total1 += num;

                for(int num : arr2)
                    total2 += num;

                if(total1 > total2)
                    return 1;
                else if(total1 < total2)
                    return -1;

                return 0;
            }
        }







//        Scanner scanner = new Scanner(System.in);
//
//        Score[] scores = new Score[2];
//        for(int i = 0; i<scores.length; i++) {
//            scores[i] = new Score();
//            scores[i].no = i;
//
//            System.out.print("학생의 이름을 입력하세요 : ");
//            scores[i].name = scanner.next();
//
//            System.out.print("학생의 국어 점수를 입력하세요 : ");
//            scores[i].kor = scanner.nextInt();
//
//            System.out.print("학생의 영어 점수를 입력하세요 : ");
//            scores[i].eng = scanner.nextInt();
//
//            System.out.print("학생의 수학 점수를 입력하세요 : ");
//            scores[i].math = scanner.nextInt();
//
//            scores[i].MakeTotal();
//        }
//        scanner.close();


        // numbers 배열의 출력
        //for(int num:numbers)
            //System.out.printf("%d ",num);

//        int k = 10;
//        SetNumber(k);
        //System.out.println(k);

        // 배열을 매개변수로 입력받아서 특정 값을 찾아, 그 배열의 인덱스값을 반환하는 메소드를 만드세요
        // 메소드의 이름은 Find(), 파라미터1은 대상 배열, 파라미터2는 찾을 값
        // 반환 값은 값을 찾으면 해당 배열의 인덱스 못 찾으면 -1을 반환
    }

//    public static void SetNumber(int n){
//        int myNum = n;
//        n=5;
//        System.out.println(n);
//    }

    // 배열로 매개변수 전달하기
    public static void InsertDataToArray(int[] numbers, int range) {
        Random random = new Random();

        // int[] numbers = new int[5];
        for (int i = 0; i< numbers.length; i++)  {
            numbers[i] = random.nextInt(range)+1;
            System.out.printf("%d ",numbers[i]);
        }
    }
    public static void ArraySort(int[] numbers)
    {
        // numbers 배열에 있는 원소의 값들을 오름차순으로 정렬
        for(int i =0; i<numbers.length - 1; i++)
        {
            for(int j = i+1; j<numbers.length; j++)
            {
                if(numbers[i] > numbers[j])
                {
                    int temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
    }

    // 배열을 매개변수로 입력받아서 특정 값을 찾아, 그 배열의 인덱스값을 반환하는 메소드를 만드세요
    // 메소드의 이름은 Find(), 파라미터1은 대상 배열, 파라미터2는 찾을 값
    // 반환 값은 값을 찾으면 해당 배열의 인덱스 못 찾으면 -1을 반환
    public static int Find(int[] numbers, int target){
        for(int i = 0; i<numbers.length;i++)
        {
            if(numbers[i] == target)
                return i;
        }
        return -1;
    }
}