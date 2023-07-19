public class AddThread extends Thread {

    protected String name;
    protected MyStack myStack;

    public AddThread(String name, MyStack stack) {
        this.name = name;
        this.myStack = stack;
    }

    @Override
    public void run() {
        for(int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1);
                myStack.add(i);
                System.out.println(name + "이 " + i + "를 추가함");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
