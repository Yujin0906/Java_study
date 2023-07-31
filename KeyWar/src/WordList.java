import java.util.Random;

public class WordList {
    private String words;
    private String[] wordList;

    public WordList() {
        words = "24명의 사상자가 발생한 충북 오송 궁평2지하차도 침수 사고에 대한 국무조정실의 감찰 결과를 두고 꼬리 자르기라는 비판이 높다 국무조정실은 지난 17 26일 충북도 청주시 행정중심 복합도시건설청 충북경찰청 충북소방본부 등을 대상으로 감찰 조사를 실시했고 28일까지 36명에 대한 수사의뢰를 단행했다 국무조정실은 또 충북도 행정부시장 등 5명에 대한 해임 요구를 비롯해 공직자 63명에 대한 징계 조치 요구를 소속 기관에 통보했다고 밝혔다\n" +
                "\n" +
                "서울신문은 정부는 선출직 공무원에 대한 인사 조치는 불가능하다며 자치단체장 등에 대한 수사의뢰는 하지 않았다 다만 이들은 중대재해처벌법에 따라 별도 형사상 책임을 질 수 있다 국무조정실의 감찰 결과에 대해 피해자들은 불만을 드러냈다며 피해자들이 처벌 대상 선정에 의구심을 표한다면 감찰에 반발하며 1인시위를 벌이기도 했던 공무원 사회에서는 반발 기류가 퍼졌다 기피 부서인 재난안전 업무를 담당한 공무원들이 재난 발생의 형사적 책임을 떠맡는 일이 재현됐다는 정서에서 비롯된 반발이라고 전했\n";
        wordList = words.split(" ");
    }

    public String getRandomWord() {
        Random rnd = new Random();
        int index = Math.abs(rnd.nextInt()) % wordList.length;
        index = Math.min(index, wordList.length-1);

        return wordList[index];
    }
}
