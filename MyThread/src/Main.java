public class Main {
    public static void main(String[] args) throws InterruptedException {

        // top ---> down
        // 순차적으로 코드가 진해오디는 순서대로 실행이 된다
        // Thread 생성
        // 이 지점부터 독립적으로 실행되는 2개의 Thread가 각각 진행됨

        MyThread thread = new MyThread();
        thread.start(); // thread를 시작시키고 자동으로 run()메소드가 실행됨

        for(int i = 0; i < 10; i++) {
            System.out.println("메인 스레드의 loop : " + i);
            Thread.sleep(10);
        }
    }
}