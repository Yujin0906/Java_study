import org.w3c.dom.css.Rect;

import javax.swing.*;
import java.awt.*;

public class AttackLabel extends JLabel implements Runnable{
    private int y_pos;
    private Rectangle rect;

    private boolean isDead;

    public AttackLabel() {
        super();

        isDead = false;
        rect = getBounds();
        y_pos = rect.y;
    }

    public void stopThread() {
        isDead = true;
    }

    @Override
    public void run() {
        while(!isDead) {
            rect = getBounds();
            y_pos = rect.y + 10;
            setBounds(rect.x, y_pos, rect.width, rect.height);

            // 부모 윈도우의 크기를 얻어옴
            Rectangle rect = getParent().getBounds();
            if(y_pos > rect.height) {
                getParent().remove(this);
                isDead = true;
            }

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("AttackLabel의 while loop를 벗어남!!!");
    }
}
