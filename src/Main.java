import java.sql.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {

        CircleCalculator circle = new CircleCalculator();
        ArithmeticCalculator arithmetic = new ArithmeticCalculator();

        //스캐너 생성
        Scanner sc = new Scanner(System.in);
        System.out.println("사칙연산을 수행하려면 1, 원의 넓이를 구하려면 2를 눌러주세요");
        int select = sc.nextInt();
        do {
            if (select == 1) {
                System.out.print("첫 번째 숫자를 입력하세요 : ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요 : ");
                int num2 = sc.nextInt();
                System.out.print("사칙 연산 기호를 입력해주세요 : ");
                char operator = sc.next().charAt(0);
                double result = 0;
                try {
                    result = arithmetic.calculate(num1, num2, operator);
                } catch (Exception e) {
                    System.out.println("e.getMessage() = " + e.getMessage());
                }
                arithmetic.getResults().add(result);
                System.out.println("결과 : " + result);


                //가장 먼저 저장된 결과 삭제
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove)입력");
                if (Objects.equals(sc.next(), "remove")) {
                    arithmetic.removeResult(0);
                    System.out.println("결과 : " + arithmetic.getResults());
                }
                //저장된 연산결과 조회
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                    if (Objects.equals(sc.next(), "inquiry")) {
                        arithmetic.inquiryResults();
                    }
                } else if (select == 2) {
                    System.out.println("반지름을 입력해주세요 : ");
                    int radius = sc.nextInt();
                    //반환타입
                    double area = circle.calculateCircleArea(radius);
                    //상속받았기 때문에 연결되어 사용이가능하다.
                    circle.getResults().add(area);
                    System.out.println("반지름이  " + radius + " 인 원의 넓이 : " + area);
                    System.out.println("저장된 원의 넓이 전체 조회 : ");
                    circle.inquiryCircleResults();
                }
            System.out.println("더 계산하겠습니까 ? (exit 입력시 종료)");
        } while (!sc.next().equals("exit"));
    }


}