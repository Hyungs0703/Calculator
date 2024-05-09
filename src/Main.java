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
        List<Integer> resultList = new ArrayList<>();
        //생성
        int index = 0;
        int result = 0;
        String input="";
        boolean flag=true;
        //Caulculator 인스턴스
        Calculator calculator = new Calculator();
        //반복문을 사용하여 연산을 반복
        while(flag){
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
              return;
            }
        }
            if(calculator.operation == '+'){
                result = calculator.number1+calculator.number2;
            }else if(calculator.operation == '-'){
                result = calculator.number1-calculator.number2;
            }else if(calculator.operation == '*'){
                result = calculator.number1*calculator.number2;
            }else if(calculator.operation == '/') {
                if (calculator.number2 == 0) {
                    System.out.println("나눗셈에 0은 들어갈 수 없습니다.");
                    return;
                } else {
                    result = calculator.number1 / calculator.number2;
                }
            }



            System.out.println("결과 :" +result);
            //연산의 결과를 배열에 저장합니다.
//            for(int i = 0; i <resultList.length-1; i++){
//                resultList[i]= resultList[i+1];
//            }
            //마지막 10번쨰 배열에 저장
//            resultList[9]= result;
            //배열에서 컬렉션으로 변경됨으로써 변경해야하는 부분 구현
            calculator.setResultList(result);
            //인덱스는 증가합니다.
            index++;

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove입력)");
            input = sc.nextLine();
            //remove 입력받으면 결과삭제
            if(input.equals("remove")){
                calculator.getResultList().remove(index);
            }
            System.out.println("저장된 연산 결과를 조회하시겠습니까? (inquiry 입력시 조회)");
            input = sc.nextLine();
            if(input.equals("inquiry")){
                //저장된 연산 결과 출력
                for(int num : calculator.getResultList()){
                    System.out.println("연산결과 : "+num );
                }
            }
            System.out.println("저장된 연산 결과를 모두 삭제하시겠습니까?(clear 입력시 삭제)");
            input = sc.nextLine();
            //삭제 기능 구현
            if(input.equals("clear")){
                calculator.removeResult();
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
