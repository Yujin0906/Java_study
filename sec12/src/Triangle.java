public class Triangle extends Shape {
    public Triangle() {
        super();
    }

    public Triangle(String name) {
        super(name);
    }

    @Override
    public void Draw() {
        System.out.println("트라이앵글의 Draw() 메소드입니다.");
    }
}