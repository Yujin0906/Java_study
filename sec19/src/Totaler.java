public class Totaler{
    protected int total;

    public Totaler() {
        total = 0;
    }

    public synchronized void add(int i) {
        total += i;
    }

    public synchronized int getTotal() {
    return total;
    }

}
