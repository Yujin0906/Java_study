public class Person {
    // static int staticMember = 0; // static 필드의 초기화
    private int age; // 비공개, 상속 금지
    protected String name; // Package가 다를 때 비공개, 상속 가능
    
    // public ---> 완전 공개, 상속 가능

    public Person() { // 디폴트 생성자
        age = 0;
        name = "";
    }

    public Person(int num1, String str) { // 추가 생성자(옵션 사항임)
        age = num1; // age 필드에 파라미터 num1을 대입
        name = str; // name 필드에 파라미터 str을 대입
    }

    // Person 클래스의 행위 : 메소드(Method)
    // 반환값 없음 : 파라미터 없음
    public void ShowInformation() { // 인스턴스 메소드(Instance Method)
        // name과 age 필드 값을 이용하여 정보를 출력한다.
        System.out.printf("%s 님의 나이는 %d 입니다.\n", name, age);
    }

    private void ShowName() {
        System.out.println(name);
    }

    // 반환값 없음 : 파라미터 있음
    public void ShowInformationWithFriend(String friend){
        System.out.printf("%s와 %s는 친구입니다.",name,friend);
    }

    // 반환값 없음 : 파라미터 있음
    // 접근 제한자 : 완전 공개, 함수명(메소드명) : SetInformation
    // 파라미터 : 나이(int)와 이름(String)을 받아서 필드 age와 name의 값을 새로 설정
    public void SetInformation(int age, String name) {
        // this : 나 자신을 가리키는 객체의 참조
        this.age = age;
        this.name = name;
    }

    // 반환값이 있는 메소드
    public int GetAge() {
        return this.age;
    }

    // 반환값이 있는 메소드
    public String GetName() {
        return this.name;
    }

    public String MakeNewName(String firstName, String lastName) {
        String tempName = String.format("%s %s",firstName, lastName);
        this.name= tempName;

        return tempName;
    }

    // 문제 1)
    // 세월이 n년 지나서 나이를 먹는 것을 표현해봅시다
    // AddAge 메소드를 만들고 파라미터로 지난 세월을 년도로 입력하여 기본(인스턴스) 필드 age에 더하여 저장하고
    // 새로 계산된 age값을 반환하세요
    public int AddAge(int age) {
        this.age += age; // this.age = this.age + age;
        return age;
    }

    /*public static void StaticMethod() { // static은 클래스의 소유임
        staticMember = 10;
    }*/
}
