public class Main {
    public static void main(String[] args) {
        // 문제) Shape 클래스로부터 상속받는 Triangle, Rectangle, Circle 클래스를 구현하라
        // Draw() 메소드를 오버라이드하여,
        // Triangle : "트라이앵글의 Draw() 메소드입니다." 를 출력
        // Rectangle : "랙탱글의 Draw() 메소드입니다." 를 출력
        // Circle : "써클의 Draw() 메소드입니다." 를 출력

        // Shape 클래스에서 Object클래스의 toString 메소드를 재정의
        // toString 메소드는 단순하게 name필드의 값만 반환함

        // Shape 클래스의 Draw() 메소드를 오버로딩하고
        // Draw() 메소드에서 매개변수로 Pannel 객체를 전달받도록 하기
        // 오버로딩된 Draw() 메소드에서는 "Draw() 메소드의 오버로딩입니다." 출력

        Triangle tri = new Triangle("삼각형");
        Rectangle rect = new Rectangle("사각형");
        Circle circle = new Circle("원");

        // 위 객체 3개를 담을 수 있는 배열 이름 arrShapes를 생성
        // 위 객체들을 arrShapes에 모두 저장한다

        // 배열에 담긴 shape들 중에 사각형이면 "저는 사각형입니다"를 출력
        // if (instanceof 사각형 )
        //     System.out.println("저는 사각형입니다");

        // 배열의 모든 아이템들을 순회하면서 이름을 출력

        Shape[] arrShapes = new Shape[3];
        arrShapes[0] = tri;
        arrShapes[1] = rect;
        arrShapes[2] = circle;

        for(Shape obj : arrShapes) {
            if(obj instanceof Rectangle) {
                System.out.println("저는 사각형입니다.");

                // 배열의 모든 아이템들을 순회하면서 이름을 출력
                System.out.println(obj);

                obj.Draw();
            }
        }

        // Car 클래스를 만들어라
        // 필드 : company, name : 둘 다 String
        // 기본 생성자와 company, name 매개변수를 갖는 생성자를 만들기
        
        // toString 메소드를 오버라이딩
        // Car Class Run() 메소드를 만들고, "스피드 100이하로 달립니다." 출력
        
        // Sedan, SportsCar 클래스를 Car 클래스로부터 상속받아 만들기
        // Sedan 클래스의 Run() 메소드에서는 "안전하게 달립니다." 출력
        // SportsCar 클래스의 Run() 메소드에서는 "스피드 180으로 달립니다." 출력

    }
}