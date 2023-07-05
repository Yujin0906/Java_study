public class Rectangle extends Shape {
    public Rectangle() {
        super();
    }

    public Rectangle(String name) {
        super(name);
    }

    @Override
    public void Draw() {
        System.out.println("랙탱글의 Draw() 메소드입니다.");
    }
}
