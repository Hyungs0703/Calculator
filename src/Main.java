import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        //스캐너 생성
        Scanner sc = new Scanner(System.in);

        //양의 정수 2개 전달
        System.out.print("첫 번째 숫자를 입력하세요 : ");
        int number1 = sc.nextInt();
        System.out.print("두 번째 숫자를 입력하세요 : ");
        int number2 = sc.nextInt();


        //사칙연산 기호 전달
        System.out.print("사칙 연산 기호를 입력해주세요 : ");
        char operator = sc.next().charAt(0);

    }
}
