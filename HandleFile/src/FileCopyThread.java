import java.io.*;

public class FileCopyThread implements Runnable {
    private String srcFileName;
    private String destFileName;

    private long fileSize; // 원본 파일의 사이즈
    private int speed; // simulate

    final int BUF_SIZE = 1024;

    public FileCopyThread(String srcFile, String destFile, int speed) {
        srcFileName = srcFile;
        destFileName = destFile;
        this.speed = speed;
        fileSize = FileCopyThread.getFileSize(srcFileName);
    }

    public static long getFileSize(String fileName) {
        File file = new File(fileName);
        if(file.exists() && file.isFile()) {
            // 파일의 크기를 byte단위로 반환한다.
            long fileSizeInBytes = file.length();
            return fileSizeInBytes;
        }
        return 0;
    }

    @Override
    public void run() {
        if(srcFileName.isEmpty() || destFileName.isEmpty() || fileSize==0) {
            return; // throw Exception하는게 더 나음(권장됨)
        }
        double fileSizeDouble = (double)fileSize;
        long totalReads = 0;
        String progress;

        // try - with - resource

        try(FileInputStream fis = new FileInputStream(srcFileName);
            FileOutputStream fos = new FileOutputStream(destFileName)) {
            byte[] buffer = new byte[BUF_SIZE];
            int bytesRead;

            // fis.read(buffer)의 반환값 : 읽어들인 데이터의 바이트 수
            while((bytesRead = fis.read(buffer)) != -1) {
                fos.write(buffer, 0, bytesRead);
                totalReads += bytesRead;

                progress = String.format("%d%%복사중...", (long)(totalReads/fileSizeDouble*100.0));
                System.out.print("\r" + progress);

                Thread.sleep(speed);
            }
            System.out.print("\r100% 복사완료\n");
            System.out.println("복사가 완료되었습니다.");

        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
