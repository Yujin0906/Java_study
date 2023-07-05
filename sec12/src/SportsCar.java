public class SportsCar extends Car{
    public SportsCar() {
        super();
    }

    public SportsCar(String company, String name) {
        super(company, name);
    }

    @Override
    public void Run() {
        System.out.println("스피드 180으로 달립니다.");
    }

    @Override
    public void Repair() {}
}
