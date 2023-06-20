public class Main {
    public static void main(String[] args) {
        // 반복문

        // 문제 1)
        // 1 ~ n 까지의 모든 정수를 더하여 출력해주세요
        // 1 + 2 + 3 + 4 + ... + 10 = ?
        int i = 1;
        int sum = 0;
        while(i < 11)
        {
            sum += i;
            i++;
        }
        System.out.printf("%d\n", sum);
// ------------------------------------------
        i = 1;
        sum = 0;
        do{
            sum += i;
            i++;
        } while(i < 11);
        System.out.printf("%d\n", sum);
// ------------------------------------------
        sum = 0;
        for(i = 1; i < 11; i++)
        {
            sum += i;
        }
        System.out.printf("%d\n", sum);
// ------------------------------------------
        // 문제 2)
        // 1 ~ 10까지 짝수의 합을 구하세요
        i = 2;
        sum = 0;
        while(i<11)
        {
            sum += i;
            i += 2;
        }
        System.out.printf("%d\n", sum);
// ------------------------------------------
        sum = 0;
        for(i=1;i<11;i++)
        {
            if(i%2==0)
                sum += i;
        }
        System.out.printf("%d\n", sum);
// ------------------------------------------
        // 문제 3)
        // 1 ~ 10 까지 3의 배수에 해당되는 모든 정수들을 출력
        for(i = 1; i <11; i++)
        {
            if(i%3==0)
            {
                System.out.printf("%d ",i);
            }
        }
        System.out.println();
// ------------------------------------------
        i = 1;
        while(i<11)
        {
            if(i%3==0)
            {
                System.out.printf("%d ",i);
            }
            i++;
        }
        System.out.println();
// ------------------------------------------
        i = 1;
        do{
            if(i%3==0)
            {
                System.out.printf("%d ",i);
            } i++;
        }while(i<11);
        System.out.println();
// ------------------------------------------
        String str = "abcdefg";
        System.out.println(str.charAt(0));

        for(char ch : str.toCharArray()) // 문자열을 마치 배열처럼 만들어줌
        {
            System.out.print(ch);
        }
        System.out.println();

        for(i = 0; i< str.length(); i++) // .length()는 문자열의 길이를 구하는 메소드임
        {
            System.out.print(str.charAt(i));
        }


    }
}