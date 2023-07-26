import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainWindow extends JFrame implements ActionListener, WindowListener {
    private JTextArea textArea;
    public void Create(String title, int width, int height) {
        setTitle(title);
        setSize(width, height);

        // 가장 기본적인 레이아웃
        setLayout(new BorderLayout());

        // 메뉴 만들기
        CreateMenu();

        // 메모장(텍스트)
        textArea = new JTextArea();

        // textArea.setLineWrap(true) : 텍스트가 윈도우 끝을 만나면 자동으로 아래로 떨어지게 됨
        // textArea.setLineWrap(false) : 옆으로 계속 이동
        textArea.setLineWrap(false);

        // 스크롤바
        JScrollPane scrollPane = new JScrollPane(textArea);
        
        // 수평스크롤바는 필요하면 보이게 함
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);

        // 수직스크롤바는 필요하면 보이게 함
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED);

        add(scrollPane, BorderLayout.CENTER);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void CreateMenu() {
        JMenuBar menuBar = new JMenuBar();

        // File Menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem exitMenuItem = new JMenuItem("Exit");
        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.addSeparator(); // 수평선
        fileMenu.add(exitMenuItem);
        newMenuItem.addActionListener(this);
        openMenuItem.addActionListener(this);
        exitMenuItem.addActionListener(this);

        JMenu editMenu = new JMenu("Edit");
        JMenuItem copyMenuItem = new JMenuItem("Copy");
        JMenuItem cutMenuItem = new JMenuItem("Cut");
        JMenuItem pasteMenuItem = new JMenuItem("Paste");
        editMenu.add(copyMenuItem);
        editMenu.add(cutMenuItem);
        editMenu.add(pasteMenuItem);
        // 메뉴 이벤트를 처리해줄 주체를 지정함
        copyMenuItem.addActionListener(this);
        cutMenuItem.addActionListener(this);
        pasteMenuItem.addActionListener(this);

        // 메뉴바에 두 개의 메뉴 항목을 각각 추가함
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        
        // 윈도우의 메인 메뉴바 설정
        setJMenuBar(menuBar);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println(e);
        switch (e.getActionCommand()) { // cmd에 따라서 분기함
            case "New" -> onNewFile();
            case "Open" -> onOpenFile();
            case "Exit" -> onExitFile();
        }
    }

    private void onNewFile() {

    }
    private void onOpenFile() {

    }
    private void onExitFile() {
        // 프로그램 종료, status = 0이면 정상 종료, 1이면 비정상 종료
        // System.exit(0);

        int choice = JOptionPane.showConfirmDialog(this,
                                                    "저장되지 않은 내용이 있음...",
                                                    "주의", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_NO_OPTION) {
            System.out.println("저장을 실행합니다");
            dispose();
        }

    }
    @Override
    public void windowOpened(WindowEvent e) {    }
    @Override
    public void windowClosing(WindowEvent e) {    }
    @Override
    public void windowClosed(WindowEvent e) {    }
    @Override
    public void windowIconified(WindowEvent e) {    }
    @Override
    public void windowDeiconified(WindowEvent e) {    }
    @Override
    public void windowActivated(WindowEvent e) {    }
    @Override
    public void windowDeactivated(WindowEvent e) {    }
}
