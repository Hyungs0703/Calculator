import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {

        Calculator calculator = new Calculator();
        //스캐너 생성
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int num1 = sc.nextInt();
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int num2 = sc.nextInt();
            System.out.print("사칙 연산 기호를 입력해주세요 : ");


            //배열 생성, 선언 및 배열안의 선언할 인덱스 증가 생성
            char operator = sc.next().charAt(0);

            System.out.println("결과 : " + result);
            results.add(result);

            //가장 먼저 저장된 결과 삭제
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove)입력");
            if(Objects.equals(sc.next(),"remove")){
                results.remove(0);
            }
            //저장된 연산결과 조회
            System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
            if(Objects.equals(sc.next(), "inquiry")){
                for(Integer i : results){
                    System.out.println("연산결과 : "+i );
                }
            }
            System.out.println("더 계산하겠습니까 ? (exit 입력시 종료)");
        }while(!sc.next().equals("exit"));
    }

}
