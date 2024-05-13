import java.util.ArrayList;
import java.util.List;

public class ArithmericCalculator extends Calculator{

    private List<Integer> resultList = new ArrayList<>();

    public void  ArithmericCalculator(char operation, int number1, int number2) {
        this.operation = operation;
        this.number1 = number1;
        this.number2 = number2;
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
    }
    //삭제하는 기능 구현
    public void removeResult(){
        resultList.clear();
    }
}
