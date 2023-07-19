public class MyRunnable implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("MyRunnableThread의 for loop : " + i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
