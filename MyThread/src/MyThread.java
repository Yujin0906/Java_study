public class MyThread extends Thread{

    @Override
    public void run() {
        for(int i = 0; i < 10; i++) {
            System.out.println("MyThread의 for loop : " + i);

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
