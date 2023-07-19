public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        Thread th1 = new Thread(new AddThread("1번", bank));
        Thread th2 = new Thread(new AddThread("2번", bank));
        Thread th3 = new Thread(new AddThread("3번", bank)); // new(생성)

        // wait(대기) <-> Run(실행)
        th1.start();
        th2.start();
        th3.start();
    }
}
