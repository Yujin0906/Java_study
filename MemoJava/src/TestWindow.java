import javax.swing.*;
import java.awt.*;

public class TestWindow extends JFrame {
    public TestWindow(String title) {
        super(title); // super는 JFrame의 생성자를 호출
    }

    public void Create(String title, int width, int height) {
        setTitle(title);
        setSize(width, height);

        // 가장 기본적인 레이아웃
        setLayout(new BorderLayout());

        JButton button1 = new JButton("1");
        JButton button2 = new JButton("2");
        JButton button3 = new JButton("3");
        JButton button4 = new JButton("4");
        JButton button5 = new JButton("5");

        add(button1, BorderLayout.NORTH);
        add(button2, BorderLayout.SOUTH);
        add(button3, BorderLayout.EAST);
        add(button4, BorderLayout.WEST);
        add(button5, BorderLayout.CENTER);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
