import java.util.ArrayList;
import java.util.List;

public class Calculator {

    //연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성
    char operation;
    int number1;
    int number2;
    //연산 결과를 저잦ㅇ하는 컬렉션타입 필드가 생성자를 통해 초기화 되도록 변경
    private List<Integer> resultList = new ArrayList<>();


    public void  Calculator(char operation, int number1, int number2){
         this.operation = operation;
         this.number1 = number1;
         this.number2 = number2;
         List<Integer> resultList = new ArrayList<>();
    }
    //getter
    public List<Integer> getResultList() {
        return resultList;
    }
    //setter
    public List<Integer> setResultList(int results){
        resultList.add(results);
        return resultList;
    }
    //저장된 연산 결과조회 기능
    public void inquiryResults(){
        System.out.println("연산 결과 모두 조회 : "+ resultList.toString());
        return;
    }
    //삭제하는 기능 구현
    public void removeResult(){
        resultList.clear();
    }
}
