public class DataList<T> {
    protected Object[] data; // 배열 선언
    protected int size;
    protected int index;

    public DataList(int size) {
        data = new Object[size];
        this.size = size;
        index = 0;
    }

    public void Add(T obj) {
        data[index] = obj;
    }

    public T get(int index) {
        // T type : Any Type
        return (T)data[index]; // Object Type을 T type으로 변환해서 반환함
    }
}
