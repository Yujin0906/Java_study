public class Person {
    protected int age;
    protected String name;

    public Person(int age, String name) {
        // 자바에서는 unsigned 개념이 없음
        // age는 나이를 표현하는 변수이기 때문에 음수 값을 가질 수 없다고 가정
        this.age = age;
        
        // name은 값이 없음을 가질 수 없다고 가정
        this.name = name;
    }
    
    public void ShowInformation() {
        try {
            // age와 name 관련된 작업 중에 예외 발생
            if (age < 0)
                throw new InfoErrorException("age값은 0보다 작을 수 없습니다.");

            // name 관련된 예외 발생
            if (name.length() == 0)
                throw new InfoErrorException("name 속성은 값을 무조건 가져야 합니다.");

            String strInfo = String.format("%s : %d",name,age);
            System.out.println(strInfo);
        }
        catch (InfoErrorException exc) {
            System.out.println(exc.getMessage());
        }

    }
    
    
    
}
