import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Hashtable;
import java.util.Map;
import java.util.Random;

public class MainWindow extends JFrame implements Runnable, ActionListener {
    // private JLabel label;
    private JPanel panel;
    private JTextField textField;

    private Map<String, AttackLabel> mapLabel = new Hashtable<>();

    private WordList wl;
    private int score;
    public MainWindow() {
        score = 0;
    }

    public void CreateWindow(String title, int width, int height) {
        wl = new WordList();

        setTitle(title);
        setSize(width, height);

        setLayout(new BorderLayout());

        panel = new JPanel();
        add(panel, BorderLayout.CENTER);
        panel.setLayout(null); // panel이 레이아웃을 안 먹게 처리함

        textField = new JTextField();
        add(textField, BorderLayout.SOUTH);

        // textField에서 키를 입력하다가... 엔터키를 눌렀을 때
        // 이벤트를 발생시키고 같은 텍스트를 갖고 있는 라벨을 삭제시켜준다!!!
        textField.addActionListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void run() {
        while( true ) {


            AttackLabel label = new AttackLabel();
            panel.add(label);      // 라벨 추가
            label.setText(wl.getRandomWord());

            // 라벨이 갖고 있는 문자열(키) : 라벨 오브젝트(벨류)
            mapLabel.put(label.getText(), label);

            Random rnd = new Random();
            int x = (Math.abs(rnd.nextInt()) % 600) - 50;
            if(x<0) {
                x = 0;
            }

            label.setBounds(x, 0, 300, 30);
            Thread thread = new Thread(label);
            thread.start();

//            Rectangle rect = label.getBounds();
//            label.setBounds(x, y + rect.height, rect.width, rect.height);

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String str = textField.getText();

        try {
            // label 삭제
            AttackLabel label = mapLabel.remove(str);

            // Thread도 중단시켜야 됨
            label.stopThread();

            // panel에서 삭제도 시켜야 됨
            panel.remove(label);
            panel.validate();
            panel.repaint();

            label = null;
            score += 10;
        }
        catch (UnsupportedOperationException exception) {
            System.out.println(exception.getMessage());
            score -= 10;
        }
        catch (RuntimeException exception) {
            System.out.println(exception.getMessage());
            score -= 10;
        }
        finally {
            textField.setText("");
            String newTitle = String.format("키보드 워리어 - %d", score);
            setTitle(newTitle);
        }
    }
}
