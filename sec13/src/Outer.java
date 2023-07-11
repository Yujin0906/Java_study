import java.util.InputMismatchException;
import java.util.Scanner;

public class Outer {
    protected String name;
    protected  Inner inn;

    public  Outer(String name) {
        this.name = name;
        inn = new Inner();
    }

    @Override
    public String toString() {
        return name;
    }

    public void ShowSelection(Scanner sc)
            throws InputMismatchException
    {
        System.out.print("1 또는 2를 선택하세요 : ");
        int select = sc.nextInt(); // 키보드로 숫자 값만 입력받아야 함
        if (select == 1) {
            System.out.println("당신은 1을 선택했습니다.");
        } else {
            System.out.println("당신은 1을 선택하지 않았습니다.");
        }
    }

    public void ShowDevide(Scanner sc)
            throws ArithmeticException
    {
        System.out.print("첫 번째 정수값을 입력 하세요 : ");
        int num1 = sc.nextInt();
        System.out.print("두 번째 정수값을 입력 하세요 : ");
        int num2 = sc.nextInt();
        int result = num1 / num2;
        System.out.printf("num1 / num2 = %d",result);
    }

    // 내부 클래스로 생성한 객체를 외부에 노출하기
    public Inner getInner() {
        return inn;
    }

    // Outer Class의 내부 클래스를 정의한다.
    private class Inner {
        protected int value;

        public Inner() {
            value = 0;
        }

        public void setValue(int value) {
            this.value = value;
        }

        @Override
        public String toString() {
            return String.format("%d", value);
        }
    }
}