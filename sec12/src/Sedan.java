public class Sedan extends Car implements IRunnable {
    public Sedan() {
        super();
    }

    public Sedan(String company, String name) {
        super(company, name);
    }

    @Override
    public void Run() {
        System.out.println("안전하게 달립니다.");
    }

    @Override
    public void Repair() {}

    @Override
    public void speed100() {}

    @Override
    public void speed200() {}
}
