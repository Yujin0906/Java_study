public class Score {
    protected int no;
    protected String name;
    protected int kor;
    protected int eng;
    protected int math;

    protected int total;
    protected float avgs;

    // 기본 생성자
    public Score() {
        no = 0;
        name = "";
        kor = 0;
        eng = 0;
        math = 0;
        total = 0;
        avgs = 0f;
    }

    // 추가 생성자
    public Score(int no, String name, int[] jumsu) {
        this.no = no;
        this.name = name;
        this.kor = jumsu[0];
        this.eng = jumsu[1];
        this.math = jumsu[2];
        this.total = this.kor + this.eng + this.math;
        this.avgs = this.total / 3f;
    }

    public void MakeTotal() {
        this.total = this.kor + this.eng + this.math;
        this.avgs = this.total / 3f;
    }

    public int GetTotal() {
        return total;
    }

    public float GetAverage() {
        return avgs;
    }
}
