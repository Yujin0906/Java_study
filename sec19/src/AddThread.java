public class AddThread implements Runnable{

    protected Totaler totaler;

    public AddThread(Totaler totaler) {
        this.totaler = totaler;
    }

    @Override
    public void run() {
        for(int i = 0; i <= 10; i++) {
            try {
                Thread.sleep(1);
                totaler.add(i);

                System.out.printf("Totaler의 값은 %d입니다.\n", totaler.getTotal());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
    }
}
