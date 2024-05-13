import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        int[]results = new int[10];
        int index = 0;
        //스캐너 생성
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int number1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int number2 = sc.nextInt();
            System.out.print("사칙 연산 기호를 입력해주세요 : ");
            int result = 0;

            //배열 생성, 선언 및 배열안의 선언할 인덱스 증가 생성


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
                    if(number2 != 0){
                        result= number1 / number2;
                        return;
                    }else{
                        System.out.println("두번째 숫자는 0이 입력될 수 없습니다.");
                        return;
                    }
                default :
                    System.out.println("사칙연산기호가 잘못 입력되었습니다.");
                    break;
            }
            System.out.println("결과 : " + result);
            if(index==10){
                //배열의 크기가 10이다. 또한 10이상은 저장될 수 없기에 앞으로 한칸씩 당기면서 저장되게한다.
                for (int i = 0; i < results.length -1 ; i++) {
                    results[i] =results[i+1];
                }
                index--;
            }
            results[index] = result;
            index++;


            System.out.println("저장 :" + Arrays.toString(results));
            System.out.println("인덱스 : "+index);
            //저장 및 인덱스증가

            System.out.println("더 계산하겠습니까 ? (exit 입력시 종료)");
        }while(!sc.next().equals("exit"));
    }

}
