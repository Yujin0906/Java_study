public class PopThread extends Thread {

    protected String name;
    protected MyStack myStack;

    public PopThread(String name, MyStack stack) {
        this.name = name;
        this.myStack = stack;
    }

    @Override
    public void run() {

        Integer result = 0;
        for(int i = 0; i < 20; i++) {
            try {
                Thread.sleep(1);
                result = (Integer) myStack.pop();
                System.out.println(name + "이 " + result + "를 빼냄");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
