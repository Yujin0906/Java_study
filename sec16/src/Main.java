import java.util.*;
import java.util.function.Consumer;

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

        // long address;
        // ...;
        // list.get(0); // 1

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

        System.out.println("==================================");
        System.out.println("==================================");

        //
        LinkedList<String> mylist = new LinkedList<>();
        mylist.add("자동차");
        mylist.add("비행기");
        mylist.add("기차");

        mylist.get(0); // 자동차
        mylist.get(1); // 비행기

        mylist.add(1,"지하철"); // 인덱스 1부분에 지하철 삽입

        mylist.addFirst("버스"); // 제일 앞 부분에 버스 삽입
        mylist.getFirst(); // 버스
        mylist.getLast();  // 기차

        // mylist에 있는 모든 아이템을 출력해보기
        for(String item : mylist)
            System.out.println(item);

        //
        System.out.println(mylist.peek()); // 가장 앞에있는 아이템 반환, 안 지움
        System.out.println(mylist.pop());  // 가장 앞에있는 아이템 반환, 링크드 리스트에서 지우면서 가져옴
        System.out.println(mylist.peek());  // 가장 앞에있는 아이템 반환, 안 지움
        mylist.peekFirst(); // 가장 앞에있는 아이템 반환, 안 지움
        mylist.peekLast(); // 가장 뒤에있는 아이템 반환, 안 지움

//        // poll 반환할게 없을 때 null값을 반환
//        System.out.println(mylist.poll()); // 가장 앞에있는 아이템 가져옴, 지움
//        System.out.println(mylist.pollFirst()); // poll()과 같음
//        System.out.println(mylist.pollLast());  // 가장 뒤에 있는 아이템 가져옴, 지움
//
//        // 반환할게 없을 때 Exception 발생시킴 (Runtime Error)
//        mylist.remove(); // 가장 앞에 있는거 반환하고 지움
//        mylist.remove("버스"); // 버스를 지움, Integer.valueOf(1)
//        mylist.remove(1); // 해당 인덱스의 아이템을 삭제함
//        mylist.removeFirst(); // remove()하고 같음
//        mylist.removeLast();  // 가장 뒤에있는 아이템 반환 후 지움

//        mylist.element(); // 가장 앞에있는 아이템 반환, 안 지움
//        mylist.get(0); // 해당 인덱스에 있는 아이테을 반환, 안 지움
//        mylist.getFirst(); // 가장 앞에있는 아이템 반환, 안 지움
//        mylist.getLast(); // 가장 뒤에있는 아이템 반환, 안 지움

        mylist.set(0, "배"); // 0번째 인덱스의 값을 '배'로 수정
        mylist.contains("배"); // 매개변수로 주어진 값이 리스트에 있다면 true, 없으면 false
        mylist.contains("택시"); // false
        mylist.addLast("기차"); // 기차가 2개가 됨

        // 중복 데이터를 허용함
        int index = mylist.indexOf("배"); // 리스트에 '배'가 있다면 해당 아이템의 인덱스 값을 반환
        index = mylist.lastIndexOf("기차");


        // mylist에 있는 모든 아이템을 출력해보기(1)
        for(String item : mylist)
            System.out.println(item);

        // mylist에 있는 모든 아이템을 출력(2) - (1)과 같음
        mylist.forEach((str)->System.out.println(str)); // 람다(Lambda) 표현식을 만든다

        // 탐색, 정렬
        Collections.sort(mylist); // 컬렉션의 정렬
        mylist.forEach(System.out::println); // soutc

        // 데이터를 반환하지 않고 일반적으로 데이터 소비(출력)에 주로 사용됨
        Consumer<String> AllData = (x)-> {
            System.out.println(x);
        };
        
        // 람다식으로 데이터 출력
        mylist.forEach(AllData);
        
        // set : 집합, 중복 데이터를 허용하지 않는다, 순서가 없다
        // HashSet(중복 안 됨), TreeSet : 순서가 있음, 데이터를 삽입하는 순간 정렬
        // LinkedHashSet(HashSet으로부터 상속받음) : 약간의 순서 개념을 구현

        System.out.println("HashSet 출력 부분");
        System.out.println("==================================");

        // 데이터를 반환하지 않고 일반적으로 데이터 소비(출력)에 주로 사용됨
        Consumer<Integer> Show = (x)-> {
            System.out.println(x);
        };
        
        // Person형 객체를 저장할 수 있는 set임
        HashSet<Person> personSet = new HashSet<>();

        personSet.add(new Person(20, "Kim"));
        personSet.add(new Person(21, "Lee"));
        personSet.add(new Person(22, "Park"));
        personSet.add(new Person(22, "Park")); // 삽입이 안됨

        // personSet의 모든 내용을 출력한다
        personSet.forEach(System.out::println);

        System.out.println("TreeSet 출력 부분");
        System.out.println("==================================");

        TreeSet<String > personTS = new TreeSet<>();
        personTS.add("ZZZ");
        personTS.add("Lee");
        personTS.add("ABC");
        personTS.add("ABC");

        // personTS 모든 내용을 출력한다
        personTS.forEach(System.out::println);

        // 처음부터 마지막 아이템까지 수나적으로 순회하면서... 출력
        for(String str : personTS)
            System.out.println(str);

        // Iterator
        Iterator iter = personTS.iterator();
        while(iter.hasNext()) { // 순회할 다음 아이템이 있는가? 있으면 true, 없으면 false
            System.out.println(iter.next());
        }

        // Map : Python의 dictionary <key, value>
        // HsahMap, TreeMap
        // LinkedHashMap

        LinkedHashMap<String, String> map1 = new LinkedHashMap<>();
        map1.put("apple", "사과");
        map1.put("banana", "바나나");
        map1.put("grape", "포도");
        map1.put("orange", "오렌지");
        map1.put("orange", "오렌지"); // key가 중복되면 안 됨
        map1.put("orange1", "오렌지"); // key가 다르면 value는 달라도 괜찮음

        String strFruit = map1.get("grape"); // grape의 value "포도"가 반환됨
        System.out.println(strFruit);

        map1.forEach((key, value) -> System.out.println(value+key));
        
        TreeMap<Integer, String> map2 = new TreeMap<>();
        map2.put(1, "기차");
        map2.put(1, "버스");
        
        String strObj = map2.get(Integer.valueOf(1));

        // Stack : LIFO, 후입선출,
        // Queue : FIFO, 선입선출
        // Deque : 둘 다 지원, 다 됨

        // mylist.clear(); 아이템들을 다 지움










//        HashSet<Integer> mySet = new HashSet<>();
//
//        for(Integer jungsu : mySet) {
//            System.out.println(jungsu.longValue());
//        }
//
//        HashSet<String> myString = new HashSet<>();
//        HashSet<Byte> myByte = new HashSet<>();
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