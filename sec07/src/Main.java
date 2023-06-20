public class Main {
    public static void main(String[] args) {
        String str1 = "abcdefg";
        char[] str = new char[]{'a','b','c','d','e','f','g'};

        // str1.toCharArray();
        // str1.length();
        // str1.charAt(0);

        for(char a: str)
        {
            System.out.print(a);
        }
        System.out.println();
// --------------------------
        for(int i=0;i<str1.length();i++)
        {
            System.out.printf("%s",str1.charAt(i));
        }
        System.out.println();
// --------------------------
        for(int j = 6;j>=0;j--)
        {
            System.out.print(str[j]);
        }
        System.out.println();
// --------------------------
        char[] greet = new char[]{'h','e','l','l','o','w','o','r','l','d'};
        int count = 0;
        for(int i = 0; i < greet.length; i++)
        {
            if(greet[i] == 'l')
                count++;
        }
        System.out.printf("%d\n", count);
// --------------------------
        final int GAP = 32; // 상수, constant
        char A = 'A';
        System.out.printf("%d ", (int)A);
        System.out.printf("%d ", (int)'a'-GAP);
        System.out.printf("%c\n", 'a'-GAP);

        for(int i = 0; i < greet.length; i++)
        {
            System.out.printf("%c",(int)greet[i]-GAP);
            /*
             greet[i] -= GAP;
             System.out.printf(greet[i]); -> 이렇게 해도 됨
             */
        }
        System.out.println();
// --------------------------
        int[] arrNumbers = new int[10]; // 정수형 배열 10칸짜리 생성
        for(int i = 0; i < arrNumbers.length; i++)
        {
            arrNumbers[i] = i+1;
            System.out.printf("%d,",arrNumbers[i]);
        }
        System.out.println();
// --------------------------

    }
}