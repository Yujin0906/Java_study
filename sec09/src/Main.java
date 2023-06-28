import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {
        Calculator calc = new Calculator(); // 객체의(calc) 생성
        int hap = calc.Add(1,2); // calc 객체의 Add메소드를 1,2 값을 전달하여 호출한 후 그 결과값은 hap 변수에 저장한다.
        int cha = calc.Subtract(1,2);
        int gop = calc.Gop(1,2);
        int divide = calc.Divide(4,3);
        int nam = calc.Nam(4,3);
        int sum = calc.Sum(5);
        int sumofeven = calc.SumOfEven(5);
        int sumofodd = calc.SumOfOdd(5);

        System.out.printf("hap = %d\n",hap);
        System.out.printf("cha = %d\n",cha);
        System.out.printf("gop = %d\n",gop);
        System.out.printf("divide = %d\n",divide);
        System.out.printf("nam = %d\n",nam);
        System.out.printf("sum = %d\n",sum);
        System.out.printf("sum = %d\n",sumofeven);
        System.out.printf("sum = %d\n",sumofodd);

        int num = calc.Rand(10);

        // arr에 난수를 5개 받아서 각각의 원소에 대입 후 각 원소를 출력
        int[] arr = new int[5]; // 5칸짜리 1차원 배열 생성

        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = calc.Rand(10);
            System.out.printf("arr[%d] = %d\n",i,arr[i]);
        }

        // 로또 번호 생성기를 만들어보세요
        int[] lotto = new int[6];
        int i = 0;
        while(i<lotto.length) {
        // for(int i = 0;i<lotto.length;i++) {
            int temp = calc.Rand(45)+1;
            int index = FindValue(lotto, temp);
            if(index < 0) {
                lotto[i] = temp; // 생성한 난수가 lotto 배열에 없으면 대입을 함
                System.out.printf("lotto[%d] = %d\n",i, lotto[i]);
                ++i;
            }
        }

        // lotto 배열 안에 모든 요소들의 값을 더하여 출력하세요
        int total = 0;
        for(int j = 0; j < lotto.length; j++)
        {
            total += lotto[j];
        }
        System.out.printf("total = %d\n",total);

        total = 0;
        for(int val : lotto) {
            total += val;
        }
        System.out.printf("total = %d",total);

    }
    public static int FindValue(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++) {
           if(arr[i] == value) {
               return i; // i는 결국 index값을 반환하겠다는 의미
           }
        }
        return -1; // value값을 arr에서 찾지 못했음
    }
}