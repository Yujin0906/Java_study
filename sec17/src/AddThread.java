public class AddThread implements Runnable{

    private Bank bank;
    private String name;
    public AddThread(String name, Bank b) {
        this.name = name;
        this.bank =b ;
    }

    @Override
    public void run() {
        try {
            for(int i = 0; i < 10; i++) {
                Thread.sleep(1000);
                bank.addMoney(1000);
                System.out.println(this.name + " 현재 잔고 : " + bank.getMoney());
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        // Terminated
    }
}
