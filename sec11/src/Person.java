public class Person { // object로부터 파생된 클래스
    // private - 파생된 클래스에서 접근 불가, 노출 안 됨 ==> 클래스 내부에서만 사용 가능
    // protected - 상속 가능, 노출 일부 가능(패키지가 같은 클래스에서)
    // public - 상속 가능, 노출 무한정 가능

    // 필드
    protected int age;
    protected String name;

    // 메소드
    // 생성자를 만듦          * 생성자도 하나의 메소드임
    public Person() { // default(기본) 생성자
        // 생성자에서 할 일을 정의함
        age = 0;
        name ="";
    }

    // 추가 생성자
    public Person(int age, String name) {
        // this - 나 자신을 참조하는 객체
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Person) {
            // obj가 Person의 인스턴스이면
            Person another = (Person)obj; // obj를 Person타입으로 형변환

            // Person 클래스에서는 나이와 이름이 같으면 동일한 객체로 간주함
            if(another.name == this.name && another.age == this.age)
                return true;
        }
        return false;
    }

    // 메소드(Method)
    public void SayHello() {
        System.out.println(String.format("안녕하세요, 내 이름은 %s이고 %d살입니다.",name, age));
    }

    // 메소드의 오버로딩 (Method Overloading) - 메소드의 이름은 같은데 메소드를 다양한 형태로 바꾼(?)
    public void SayHello(String greet) {
        System.out.println(String.format("%s, 내 이름은 %s이고 %d살입니다.",greet ,name, age));
    }

    // getter : 클래스의 필드를 외부에 노출시켜주는 메소드
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    // setter : 클래스의 필드를 외부로부터 받아서 설정해주는 메소드
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}
