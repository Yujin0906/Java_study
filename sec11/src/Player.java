import javax.security.auth.Subject;

public class Player extends Person {
    protected String subject;

    public Player() {
        super();
        subject = "";
    }

    public Player(int age, String name, String subject) {
        super(age, name);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return String.format("%s(%s선수)",name,subject);
    }

    @Override
    public void SayHello(String greet) {
        System.out.println(String.format("%s, 내 이름은 %s이고 %d살이며 %s선수입니다.", greet,name, age, subject));
        super.SayHello();
    }

}
