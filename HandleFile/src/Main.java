import java.io.*;

public class Main {
    public static void main(String[] args) {
//        FileReadThread frt = new FileReadThread("C:\\Users\\Yujin\\Desktop\\Programming\\java\\sec02\\src\\Main.java",10);
//        Thread thread = new Thread(frt);
//        thread.start();

//        FileCopyThread fct = new FileCopyThread("C:\\Users\\Yujin\\Downloads\\winpy-main.zip", "copyied.zip", 1);
//        Thread thread2 = new Thread(fct);
//        thread2.start();

//        FileWrite();
//        FileRead();

        try {
//            Person yoo = new Person("유재석", 20);
//            Person shin = new Person("신동엽", 25);
//            Person kang = new Person("강호동", 22);
//            Person kim = new Person("김종국", 21);
//
//            Family family = new Family();
//            family.Add(yoo);
//            family.Add(shin);
//            family.Add(kang);
//            family.Add(kim);
//
//            FileForObject.SaveFamily("family.fam",family);

            Family loadedFamily = FileForObject.LoadFamily("family.fam");
            loadedFamily.showAll();


//            FileForObject.SavePerson("yoo.per", yoo);

//            Person yoo = FileForObject.LoadPerson("yoo.per");
//            System.out.println("파일로부터 얻은 객체");
//            System.out.println(yoo);
        }
        catch (RuntimeException e) {
            e.printStackTrace();
        }
    }
    public static void FileWrite() {
        // FileWriter
        // FileReader

        String content = "Hello, 반갑습니다, It's raining.";
        File file = new File("example.txt");

        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(content);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

public static void FileRead() {
        final int BUF_SIZE = 1024;

        File file = new File("example.txt");
        try (FileReader fileReader = new FileReader(file)) {
            char[] buffer = new char[BUF_SIZE];
            int readBytes = fileReader.read(buffer);

            if(readBytes > 0) {
                String content = new String(buffer, 0, readBytes);
                System.out.println(content);
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}