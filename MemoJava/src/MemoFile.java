import java.io.*;

public class MemoFile {

    public static boolean saveFile(String filePath, String contents) {
        // try - with - resource
        try (FileWriter fw = new FileWriter(filePath);) {
            fw.write(contents);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static String openFile(String filePath) {
        StringBuilder sb = new StringBuilder();

        try(FileReader fr = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fr)) {
            String line;
            // 파일을 전부 읽는 동안 한 줄씩 읽어서 line에 저장함
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n");
            }
            return sb.toString();
        }
        catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
