import java.util.LinkedList;

// Stack : Last In First Out, 자료구조
// Queue : First In First Out, 자료구조

public class MyStack<T> { // <> - 제네릭 표현
    protected LinkedList<T> mylist;

    public MyStack() {
        mylist = new LinkedList<>(); // mylist 객체를 생성
    }

    public synchronized int add(T data) {
        mylist.addLast(data);
        notify();
        return mylist.size();
    }

    public synchronized T pop() throws InterruptedException{
        wait();
        return mylist.removeLast();
    }
}