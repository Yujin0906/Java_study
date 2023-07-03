// extends : 부모 클래스로부터 상속을 받음을 의미한다
public class Student extends Person {
    protected int grade;

    public Student() {
        super(); // 부모 클래스의 디폴트 생성자를 호출함
        grade = 1;
    }

    public Student(int age, String name) {
        super(age, name); // 부모 클래스의 이 생성자를 호출한다.
        grade = 1;
    }

    public void Upgrade() {
        grade++;
    }

    // 메소드의 재정의 - Method Overriding
    @Override
    public void SayHello() {
        System.out.println(String.format("안녕하세요. 저는 %d학년입니다.",grade));
        super.SayHello();
    }

    public void setGrade(int grage) {
        this.grade = grage;
    }

    public int getGrade() {
        return grade;
    }

}