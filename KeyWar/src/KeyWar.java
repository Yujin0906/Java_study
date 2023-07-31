public class KeyWar {
    public static void main(String[] args) {
        // 키보드 워리어 - XXX

        MainWindow win = new MainWindow();
        win.CreateWindow("키보드 워리어", 600, 600);
        Thread thread = new Thread(win);
        thread.start();
    }
}
