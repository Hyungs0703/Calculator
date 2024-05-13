import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        //스캐너 생성
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int number1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int number2 = sc.nextInt();
            //사칙연산 기호 전달
            System.out.print("사칙 연산 기호를 입력해주세요 : ");

            int result = 0;
            //반복문 사용하여 연산 진행
            char operator = sc.next().charAt(0);
            switch(operator){
                case '+' :
                    result = number1 + number2;
                    break;
                case '-' :
                    result = number1 - number2;
                    break;
                case '*' :
                    result = number1 * number2;
                    break;
                case '/':
                    if(number2 == 0){
                        System.out.println("두번째 숫자는 0이 입력될 수 없습니다.");
                        return;
                    }else{
                        result = number1 / number2;
                    }
                default :
                    System.out.println("사칙연산기호가 잘못 입력되었습니다.");
                    break;
            }
            System.out.println("결과 : " + result);
            System.out.println("더 계산하겠습니까 ? (exit 입력시 종료)");
        }while(!sc.next().equals("exit"));
    }

}
