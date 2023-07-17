public class Car {
    protected int wheels;

    public Car(int wheels) {
        this.wheels = wheels;
    }

    public void run() {
        // 만약 wheels가 4가 아니면 예외 사항을 발생시키세요
        // 예외 사항은 CarException ===> RuntimeException
        if (wheels != 4) {
            throw new CarException("wheels가 4가 아님");
        }

        System.out.println("자동차가 잘 굴러갑니다.");

    }

}
