public class Main {
    public static void main(String[] args) {
//        FileReadThread frt = new FileReadThread("C:\\Users\\Yujin\\Desktop\\Programming\\java\\sec02\\src\\Main.java",10);
//        Thread thread = new Thread(frt);
//        thread.start();

        FileCopyThread fct = new FileCopyThread("C:\\Users\\Yujin\\Downloads\\winpy-main.zip", "copyied.zip", 1);
        Thread thread2 = new Thread(fct);
        thread2.start();
    }
}