import java.io.Serializable;
import java.util.Iterator;
import java.util.LinkedList;

public class Family implements Serializable {
    protected LinkedList<Person> list;

    public Family() {
        list = new LinkedList<>();
    }

    public void Add(Person who) {
        list.addLast(who);
    }

    public Person get(int index) {
        return list.get(index);
    }

    public Iterator<Person> personIterator() {
        return list.iterator();
    }

    public void showAll() {
        for(Person who : list) {
            System.out.println(who);
        }
    }
}
