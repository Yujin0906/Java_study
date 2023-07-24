import java.io.*;

public class FileReadThread implements Runnable {
    private String fileName;
    private int speed;

    public FileReadThread(String fileName, int speed) {
        this.fileName = fileName;
        this.speed = speed;
    }

    @Override
    public void run() {
        FileInputStream fis = null;
        InputStreamReader isr = null;

        try {
            // file open
            // read, write, append
            // close()

            // Stream : 데이터의 흐름
            // FileInputStream : 파일을 READ 모드로 열어서 메모리에 로드할 수 있는 오브젝트(클래스, 객체)
            fis = new FileInputStream(fileName);
            isr = new InputStreamReader(fis, "UTF-8");

            // fis.read() ===> 파일로부터 한 개의 데이터를 읽어옴
            int readByte;
            while ((readByte = isr.read()) != -1) {
                System.out.print((char)readByte);
                Thread.sleep(speed);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace(); // error message 출력
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        finally {
            try {
                fis.close();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
