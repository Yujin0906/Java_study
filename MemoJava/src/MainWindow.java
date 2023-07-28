import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.util.Locale;

public class MainWindow extends JFrame implements ActionListener, WindowListener {
    private JTextArea textArea;
    private JPanel toolbar;
    private JComboBox<String> fontBox;
    private JComboBox<String> fontStyleBox;
    private JComboBox<String> fontSizeBox;

    private String memoFilePath;

    public void Create(String title, int width, int height) {
        memoFilePath = "";
        setTitle(title); // 윈도우 타이틀 설정
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

        // JTextArea 객체에 폰트 설정
        createToolBar();
        setFont();

        // Window Event Listener
        addWindowListener(this);

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void createToolBar() {
        toolbar = new JPanel();

        fontBox = new JComboBox<>();
        fontStyleBox = new JComboBox<>();
        fontSizeBox = new JComboBox<>();

        toolbar.add(fontBox);
        toolbar.add(fontStyleBox);
        toolbar.add(fontSizeBox);

        fontBox.addActionListener(this);
        fontStyleBox.addActionListener(this);
        fontSizeBox.addActionListener(this);

        toolbar.setLayout(new FlowLayout(FlowLayout.LEFT));

        add(toolbar, BorderLayout.NORTH);
    }

    private void setFont() {
        if (fontBox == null || fontStyleBox == null || fontSizeBox == null) {
            return;
        }

        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String fonts[] = ge.getAvailableFontFamilyNames(new Locale("ko","KR"));

        for (String ft : fonts) {
            // Font 콤보박스에 모든 시스템 폰트를 저장함
            fontBox.addItem(ft);
        }

        // 기본 폰트를 '맑은 고딕'으로 하기 위해 Family Name이 '맑은 고딕'인 문자열을 검색함
        for (int i = 0; i < fontBox.getItemCount(); i++) {
            String familyName = fontBox.getItemAt(i);
            if (familyName.equals("맑은 고딕")) {
                fontBox.setSelectedIndex(i);
                break;
            }
        }

        //
        fontStyleBox.addItem("Normal");
        fontStyleBox.addItem("Bold");
        fontStyleBox.addItem("Italic");

        // size : 8 ~ 72 , 기본값은 14
        for(int i = 8; i <= 72; i+=2) { // 2씩 증가
            fontSizeBox.addItem(String.format("%d", i));
        }

        fontSizeBox.setSelectedIndex(3); // 초기값 설정

        setTextAreaFont();
    }

    public void setTextAreaFont() {

        //
        if (fontBox == null || fontStyleBox == null || fontSizeBox == null || textArea == null) {
            return;
        }


        String fontFamily = (String)fontBox.getSelectedItem();
        if (fontFamily == null) {
            return;
        }

        int style = fontStyleBox.getSelectedIndex();

        String sizeString = (String)fontSizeBox.getSelectedItem();
        int size = Integer.parseInt(sizeString);

        Font font = new Font(fontFamily, style, size);
        textArea.setFont(font);
    }


    public void CreateMenu() {
        JMenuBar menuBar = new JMenuBar();

        // File Menu
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        JMenuItem openMenuItem = new JMenuItem("Open");
        JMenuItem saveMenuItem = new JMenuItem("Save");
        JMenuItem saveAsMenuItem = new JMenuItem("Save As...");
        JMenuItem exitMenuItem = new JMenuItem("Exit");

        fileMenu.add(newMenuItem);
        fileMenu.add(openMenuItem);
        fileMenu.add(saveMenuItem);
        fileMenu.add(saveAsMenuItem);
        fileMenu.addSeparator(); // 수평선
        fileMenu.add(exitMenuItem);

        newMenuItem.addActionListener(this);
        openMenuItem.addActionListener(this);
        saveMenuItem.addActionListener(this);
        saveAsMenuItem.addActionListener(this);
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
            case "Save" -> onSaveFile();
            case "Save As..." -> onSavaAsFile();
            case "Exit" -> onExitFile();
            case "comboBoxChanged" -> onFontComboBoxChanged();
        }
    }

    private void onFontComboBoxChanged() {
        setTextAreaFont();
    }

    private void onNewFile() {
        if (!textArea.getText().isEmpty()) {
            onSavaAsFile();
        }

        textArea.setText("");
        setTitle("메모장");
        memoFilePath = "";
    }
    private void onOpenFile() {
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showOpenDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            String fileName;
            // 오픈 다이얼로그에서 확인을 눌러 진행된 상태
            File selectedFile = fileChooser.getSelectedFile();
            memoFilePath =  selectedFile.getAbsolutePath(); // 절대 path
            fileName = selectedFile.getName();
            textArea.setText(MemoFile.openFile(memoFilePath));

            String title = String.format("메모장 - %s", fileName);
            setTitle(title);
        }
    }

    private void onSavaAsFile() {
        // 공통 저장, 열기 대화 상자
        JFileChooser fileChooser = new JFileChooser();
        int option = fileChooser.showSaveDialog(this);
        if (option == JFileChooser.APPROVE_OPTION) {
            // 공통 대화 상자에서 '확인'을 눌러서 정상적으로 진행하였을 때..
            // selectedFile에 공통 대화 상자에서 선택한 파일명이 지정됨
            File selectedFile = fileChooser.getSelectedFile();
            memoFilePath = selectedFile.getAbsolutePath(); // 절대 path
            String fileName = selectedFile.getName();
            MemoFile.saveFile(memoFilePath, textArea.getText()); // 파일명, 내용

            String title = String.format("메모장 - %s", fileName);
            setTitle(title);
        }
    }

     private void onSaveFile() {
         // 상황을 판단해서 전역 파일명이 없을 때는 onSaveAsFile()을 실행
         // 전역 파일명이 있을 때는
         if (memoFilePath.isEmpty()) {
             onSavaAsFile();
         }
         else {
             MemoFile.saveFile(memoFilePath, textArea.getText());
         }
     }

    private void onExitFile() {
        // 프로그램 종료, status = 0이면 정상 종료, 1이면 비정상 종료
        // System.exit(0);

        int choice = JOptionPane.showConfirmDialog(this,
                                                    "저장되지 않은 내용이 있음...",
                                                    "주의", JOptionPane.YES_NO_OPTION);

        if (choice == JOptionPane.YES_NO_OPTION) {
            System.out.println("저장을 실행합니다");
        }
        dispose();
    }
    @Override
    public void windowOpened(WindowEvent e) {    }
    @Override
    public void windowClosing(WindowEvent e) {
        onExitFile();
    }
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
