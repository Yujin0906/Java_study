import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // 프로그래밍 : 하드웨어(H/W)
        // 메모리 개념 : CPU <---> 메모리(명령어, 데이터)

        // 배열 : 메모리

        int a; // 메모리 어딘가(Address, 주소)에 a라는 이름으로 4바이트를 할당
        
        // 메모리 어딘가(Address, 주소)에 a라는 이름으로 12바이트를 할당
        // 4바이트씩 끊어서(x3) 사용
        int[] array = new int[3];

        // 객체(오브젝트, 인스턴스) : 클래스를 구현해서 메모리에 로딩한 상태
        Calendar cal = Calendar.getInstance();

        // 메모리를 구조화해서 다룸
        // 메모리에 있는 데이터들을 더 효과적으로 관리할 수 있는 개념 ===> 자료구조
        // Collection Framework
        // Collection(List, Set) + Map : Class의 형태로 구현이 되어 있음

        // List : 가변 배열, ArrayList, Vector, LinkedList
        // 선형(Linear) 자료 구조

        // list라는 자료구조 생성
        ArrayList<Integer> list = new ArrayList<Integer>();

        list.add(1); // 1이라는 숫자를 추가함
        list.add(1);
        list.add(100);
        list.add(200);
        list.add(500);

        // list.add(인덱스, 값);
        list.add(2, 5); // 중간 삽입, Insert

        list.set(1, 10); // 두번째 인덱스의 값을 10으로 변경함

        int val = list.get(1); // 두번째 인덱스의 값을 반환하여 val에 저장함

        list.remove(1); // 두번째 인덱스의 값을 삭제함
        list.remove(Integer.valueOf(100)); // list에 있는 값 100을 삭제

        list.clear(); // 모두 삭제
        list.size(); // 리스트에 저장된 아이템 개수를 반환
        list.contains(Integer.valueOf(100));   // true
        list.contains(Integer.valueOf(10000)); // false

        long address;
        // ...;
        list.get(0); // 1

        // int, short, boolean, byte, char, long

        // ArrayList에 비해 메모리 공간을 효율적으로 사용할 수 있는 장점
        // 링크를 위해서 오버헤드가 생김
        LinkedList<Integer> List2 = new LinkedList<>();
        List2.add(10);

        // Set : 집합, 중복 데이터를 허용하지 않음
        // HashSet, TreeSet

        // Map : 순서가 없다, 데이터를 쌍으로 관리함, [키 : 벨류]
        // [스트링 : 정수], [정수 : 스트링], [실수 : 정수]

        // Generic :
        DataList<Integer> dl = new DataList(10);
        dl.Add(1);

        DataList<String> ds = new DataList<>(15);
        ds.Add("문자열");

        MyData data = new MyData();
        data.val1 = 1;
        data.val2 = "가나다라마";

        DataList<MyData> md = new DataList<>(5);
        md.Add(data);




//        HashSet<Integer> mySet = new HashSet<>();
//
//        for(Integer jungsu : mySet) {
//            System.out.println(jungsu.longValue());
//        }
//
//        HashSet<String> myString = new HashSet<>();
//        HashSet<Byte> myByte = new HashSet<>();
//
//
//
//
//        HashSet mySet1 = new HashSet();
//        mySet1.add(1);
//
//        for(Object obj : mySet1) {
//            if (obj instanceof Integer) {
//                Integer jung = (Integer)obj;
//                jung.shortValue();
//            }
//        }

    }
}