import java.io.*;

public class FileForObject {
    public static long SavePerson(String filePath, Person who) {
        try (FileOutputStream fos = new FileOutputStream(filePath);
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            // Person 클래스는 Serializable 인터페이스를 implement 하고 있어야 함
            oos.writeObject(who);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        File file = new File(filePath);
        return file.length();
    }

    public static Person LoadPerson(String filepath) {
        try (FileInputStream fis = new FileInputStream(filepath);
        ObjectInputStream ois = new ObjectInputStream(fis)) {
            Person who = (Person)ois.readObject();
            return who;
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static long SaveFamily(String filePath, Family family) {
        try (FileOutputStream fos = new FileOutputStream(filePath);
            ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(family);
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

        // 저장한 파일 크기를 반환
        File file = new File(filePath);
        return file.length();
    }

    public static Family LoadFamily(String filePath) {
        try (FileInputStream fis = new FileInputStream(filePath);
            ObjectInputStream ois = new ObjectInputStream(fis)) {
           Family family = (Family) ois.readObject();
           return family;
        }
        catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
        catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}