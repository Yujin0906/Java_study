
public class Person implements Comparable{
    protected String name;
    protected int age;

    public Person(int age, String name) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object obj) {
        // obj가 Person클래스의 파생 클래스인지 확인
        if (obj instanceof Person) {
            Person other = (Person)obj; // 형 변환
            if(other.age == this.age && other.name == this.name)
                return true;
        }
        
        return false;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Person) {
            Person other = (Person)o;
            if(age > other.age)
                return 1;
            else if(age == other.age)
                return 0;
            else
                return -1;
        }
        return 0;
    }
}
