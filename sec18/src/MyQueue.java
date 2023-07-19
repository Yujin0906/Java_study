import java.util.LinkedList;

public class MyQueue<T> {
    protected LinkedList<T> mylist;

    public MyQueue() {
        mylist = new LinkedList<>(); // mylist 객체를 생성
    }

    public int add(T data) {
        mylist.addLast(data);
        return mylist.size();
    }

    public T pop() {
        return mylist.removeFirst();
    }
}