import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        //스캐너
         Scanner sc = new Scanner(System.in);
         //연산의 결과를 저장할 수 잇는 배열생성
         // int [] resultList = new int[10];
//       List<Integer> resultList = new ArrayList<>();
//       List<Double> circleList = new ArrayList<>();
        //생성
        int index = 0;
        int result = 0;
        String input="";
        boolean flag=true;
        double circleResult= 0;

        //Caulculator 인스턴스
        Calculator calculator = new Calculator();
        ArithmericCalculator arithmericCalculator = new ArithmericCalculator();
        CircleCalculator circleCalculator = new CircleCalculator();

        AddOperator addOperator = new AddOperator();
        SubtractOperator subtractOperator = new SubtractOperator();
        MultiplyOperator multiplyOperator = new MultiplyOperator();
        DivideOperator divideOperator = new DivideOperator();
        //반복문 시작
        // 사칙연산을 진행 or 원의 넓이
        System.out.println("원의 넓이를 구하고싶다면 1을 눌러주세요 .");
        System.out.println("사칙연산을 하고싶으면 2를 눌러주세요 .");
        input = sc.nextLine();
        //원의넓이
        if(input.equals("1")){
            System.out.println("반지름을 입력해주세요.");
            calculator.number1 = sc.nextInt();
                circleResult = calculator.number1*calculator.number1*calculator.CIRCLE;
                System.out.println("결과 :" + circleResult);
                //결과값 저장
                circleCalculator.setCircleResultList(circleResult);
                //저장값 전체조회
                circleCalculator.inquiryCircleResults();
        //사칙연산
        }else if(input.equals("2")){
        System.out.println("첫번째 숫자를 입력해주세요.");
        calculator.number1 = sc.nextInt();
        System.out.println("사칙연산 기호를 입력해주세요.");
        calculator.operation= sc.next().charAt(0);
        System.out.println("두번째 숫자를 입력해주세요.");
        calculator.number2 = sc.nextInt();
        if(!((calculator.operation =='+')|| (calculator.operation =='-')|| (calculator.operation =='*') ||(calculator.operation =='/'))){
            try{
                error();
            }catch (Exception e){
                System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
              return;
            }
        }
        if(calculator.operation == '+'){
                result = addOperator.operate(calculator.number1, calculator.number2);
        }else if(calculator.operation == '-'){
                result = subtractOperator.operate(calculator.number1, calculator.number2);
        }else if(calculator.operation == '*'){
                result = multiplyOperator.operate(calculator.number1, calculator.number2);
        }else if(calculator.operation == '/') {
            if (calculator.number2 == 0) {
                    System.out.println("나눗셈에 0은 들어갈 수 없습니다.");
                    return;
            } else {
                result = divideOperator.operate(calculator.number1, calculator.number2);
                }
            }
            System.out.println("결과 :" +result);
            //연산의 결과를 배열에 저장합니다.
//            for(int i = 0; i <resultList.length-1; i++){
//                resultList[i]= resultList[i+1];
//            }
            //마지막 10번쨰 배열에 저장
//            resultList[9]= result;
            //저장하기
            arithmericCalculator.setResultList(result);
            //인덱스는 증가합니다.
            index++;

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove입력)");
            input = sc.nextLine();
            //remove 입력받으면 결과삭제
            if(input.equals("remove")){
                arithmericCalculator.getResultList().removeFirst();
            }
            System.out.println("저장된 연산 결과를 조회하시겠습니까? (inquiry 입력시 조회)");
            input = sc.nextLine();
            if(input.equals("inquiry")) {
                //저장된 연산 결과 출력
                arithmericCalculator.inquiryResults();
            }
            System.out.println("저장된 연산 결과를 모두 삭제하시겠습니까?(clear 입력시 삭제)");
            input = sc.nextLine();
            //삭제 기능 구현
            if(input.equals("clear")){
                arithmericCalculator.removeResult();
                System.out.println("연산 결과 조회:" + arithmericCalculator.getResultList());
            }
            System.out.println("더 계산하시겠습니까?(exit 입력시 종료)");
            input = sc.nextLine();
            if(input.equals("exit")){
                System.out.println("프로그램을 종료합니다");
                flag = false;
            }
        }
    }
    public static void error() {
        System.out.println("입력을 잘못하였습니다. 포르그램을 종료합니다.");
    }

}
