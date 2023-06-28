import java.util.Random;

public class Calculator {
    // 접근 제한자
    // 1. private: 클래스 외부에 노출 안 됨, 상속 불가
    // 2. protected: 클래스 외부에 노출 안 됨, 상속 가능
    // 3. public: 클래스 외부에 노출 됨, 상속 가능
    public int Add(int num1, int num2) {

        return num1 + num2; // 파라미터로 받은 num1과 num2를 더하여 결과를 반환한다.
    }
    
    // Calculator 클래스에서 Subtract라는 메소드를 구현하세요
    // Subtract 메소드는 정수형 파라미터 num1과 num2를 넘겨 받음
    // num1에서 num2를 뺀 결과를 반환하는 메소드를 구현하세요
    // Main 클래스의 main()메소드에서 Subtract 메소드를 호출하고 그 결과를 출력하세요
    public int Subtract(int num1, int num2) {
        return num1 - num2;
    }
    public int Gop(int num1, int num2) {
        return num1 * num2;
    }
    public int Divide(int num1, int num2) {
        if(num2==0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return num1 / num2;
    }
    public int Nam(int num1, int num2) {
        if(num2==0) {
            System.out.println("0으로 나눌 수 없습니다.");
            return 0;
        }
        return num1 % num2;
    }
    public int Sum(int until) {
        int sum = 0; // 누적 변수를 만들고 반복 루프에 들어가기 직전에 0으로 초기화 해야 함
        for(int i = 1; i<=until; i++)
        {
            sum += i;
        }
        return sum;
    }

    // SumOfEven(int until) until까지의 짝수들의 합만 계산
    public int SumOfEven(int until) {
        return SumOfAny(0,until);
    }

    public int SumOfOdd(int until) {
        return SumOfAny(1, until);
    }

    protected int SumOfAny(int i, int until) {
        int sum = 0;
        while (i <=until) {
            sum += i;
            i+=2;
        }
        return sum;
    }
    
    public int Rand(int until) {
        Random rnd = new Random(); // 난수를 생성해주는 클래스

//        int number1 = rnd.nextInt(); // number에 난수 값이 저장
        int number = rnd.nextInt(until); // 0 ~ until - 1


        return number;
    }
}
