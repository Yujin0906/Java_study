public class Circle extends Shape {
    public Circle() {
        super(); // parent의 생성자를 호출
    }

    public Circle(String name) {
        super(name); // parent의 추가 생성자를 호출
    }

    @Override
    public void Draw() {
        System.out.println("써클의 Draw() 메소드입니다.");
    }
}
