public class Main {
    public static void main(String[] args) {
        // Person 클래스로부터 객체를 만듦
        Person yoo = new Person(); // default 생성자를 이용하여 yoo 객체를 만듦
        yoo.setAge(20);
        yoo.setName("유재석");
        yoo.SayHello();

        Person kang = new Person(25,"강호동");
        kang.SayHello();

        yoo.SayHello("반갑습니다");
        kang.SayHello("Hello");

        // yoo.Upgrade(); ==> error

        // Student 클래스로부터 객체를 만듦
        Student lee = new Student();
        lee.setAge(15);
        lee.setName("이동국");
        lee.SayHello();

        Student hwang = new Student(16, "황성훈");
        hwang.Upgrade();
        hwang.SayHello();

        // Player 클래스를 만들고 Person으로부터 상속을 받음
        // Player는 Subject라는 String 타입의 필드를 가짐
        // Subject는 종목을 의미하고 종목을 설정할 수 있는 추가 생성자와
        // getter, setter를 추가하세요
        Player kim = new Player(16,"김영주","야구");
        kim.SayHello("반가워요");

        // 객체 instanceof 클래스 ==> 반환값 : true or false
        boolean isPerson = kim instanceof Person;
        System.out.println(isPerson); // true

        boolean isPlayer = yoo instanceof Player;
        System.out.println(isPlayer); // false

        isPerson = yoo instanceof Person;
        System.out.println(isPerson); // true

        // Object 클래스의 기능?
        System.out.println( yoo.toString() );
        System.out.println( yoo );

        String str = yoo.toString();

        Person yoo1 = new Person(20, "유재석");
        if( yoo.equals(yoo1) == true )
            System.out.println("yoo와 yoo1은 같습니다.");
        else 
            System.out.println("yoo와 yoo1은 다릅니다.");

        // primitive type
        int[] arr = new int[5];

        // 객체들의 배열도 생성이 가능함
        Person[] arrObj = new Person[6];
        arrObj[0] = yoo;   // Person
        arrObj[1] = kang;  // Person
        arrObj[2] = lee;   // Student
        arrObj[3] = hwang; // Student
        arrObj[4] = kim;   // Player
        arrObj[5] = yoo1;  // Person

        // 다형성

        for(int i = 0; i< arrObj.length; i++) {
//            isPlayer = arrObj[i] instanceof Player;
//            if (isPlayer==true)
//                System.out.printf("arrObj[%d] is instane of Player\n",i);
//            else
//                System.out.printf("arrObj[%d] is not instane of Player\n",i);

            if(arrObj[i] instanceof Student) {
                Student stu = (Student)arrObj[i]; // float b = 10f; int a = (int)b; 이것과 같음
                stu.Upgrade();
            }
            arrObj[i].SayHello();
        }

        

        Person choi = new Player(20, "최동원", "야구");
        ((Player)choi).setSubject("야구"); // 원래 Player로 생성되었기 때문에 형변환하여 사용

        ((Player)choi).SayHello();

        // Person 타입이지만 Player의 SayHello(매개변수)를 호출함
        choi.SayHello("나는 롯데자이언츠의 야구선수");

        // 코드상에서는 가능(컴파일은 됨), 런타임시 에러 발생
        Person jung = new Person(10,"정형돈");
        ((Player)jung).setSubject("야구"); // Runtime Error

//        yoo1.age = 21;
//        if( yoo.equals(yoo1) == true )
//            System.out.println("yoo와 yoo1은 같습니다.");
//        else
//            System.out.println("yoo와 yoo1은 다릅니다.");

//        Person yoo2 = yoo;
//        if( yoo.equals(yoo2) == true )
//            System.out.println("yoo와 yoo2는 같습니다.");
//        else
//            System.out.println("yoo와 yoo2는 다릅니다.");

//        yoo2.age = 30;
//        System.out.println(yoo.age);
//
//        yoo1.age = 35;
//        System.out.println(yoo.age);

        // System.out.println( kim.toString() ); // 김영주(야구선수)


    }
}