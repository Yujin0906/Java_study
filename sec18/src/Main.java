public class Main {

    public static void main(String[] args) {
//        MyStack<Integer> intStack = new MyStack<>();
//        intStack.add(1);
//        intStack.add(2);
//
//        MyStack<String> strStack = new MyStack<>();
//        strStack.add("가나다라마");
//        strStack.add("바사아자");
//        strStack.add("차카");
//
//        System.out.println(strStack.pop()); // 차카
//        System.out.println(strStack.pop()); // 바사아자
//        System.out.println(strStack.pop()); // 가나다라마
//
//        System.out.println("============================");

//        MyQueue<Integer> intQueue = new MyQueue<>();
//        intQueue.add(1);
//        intQueue.add(2);
//
//        MyQueue<String> strQueue = new MyQueue<>();
//        strQueue.add("가나다라마");
//        strQueue.add("바사아자");
//        strQueue.add("차카");
//
//        System.out.println(strQueue.pop()); // 가나다라마
//        System.out.println(strQueue.pop()); // 바사아자
//        System.out.println(strQueue.pop()); // 차카

//        System.out.println("============================");

        MyStack<Integer> intStack = new MyStack<>();

        AddThread thAdd = new AddThread("Add스레드", intStack);
        PopThread thPop = new PopThread("Pop스레드", intStack);

        thAdd.start();
        thPop.start();
    }
}
