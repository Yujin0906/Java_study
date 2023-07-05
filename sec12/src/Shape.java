public class Shape {
    protected String name;

    public Shape() {
        name = "";
    }

    public Shape(String name) {
        this.name = name;
    }

    public void Draw() {
        System.out.println("Shape의 Draw메소드입니다.");
    }

    // Overloading
    public void Draw(Panel panel) {
        System.out.println("Draw() 메소드의 오버로딩입니다.");
    }

    @Override
    public String toString() {
        return this.name;
    }
}