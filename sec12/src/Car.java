public abstract class Car {
    protected String company;
    protected String name;

    public Car() {
        company = "";
        name = "";
    }

    public Car(String company, String name) {
        this.company = company;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s(%s)",company,name);
    }

    public void Run() {
        System.out.println("스피드 100이하로 달립니다.");
    }

    // 추상 메소드 : 해당 메소드를 파생된 클래스에서 반드시 재정의 해야 함
    public abstract void Repair();
}
