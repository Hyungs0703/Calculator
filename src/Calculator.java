import java.util.ArrayList;
import java.util.List;

public class Calculator {

    private List<Integer> results = new ArrayList<>();

    public int calculate(int num1, int num2, char opearator){
        int result = 0;

        switch(opearator){
            case '+' :
                result = num1 + num2;
                   break;
                case '-' :
                result = num1 - num2;
                    break;
                case '*' :
                    result = num1 * num2;
                    break;
                case '/':
                    if(num2 != 0){
                        result= num1 / num2;
                 }else{
                    throw new ArithmeticException("두번째 숫자는 0이 입력될 수 없습니다.");
                    }
                default :
                    throw new UnsupportedOperationException("사칙연산기호가 잘못 입력되었습니다.");
                 }
                 return result;
         }

    public List<Integer> getResults() {
        return results;
    }
    public List<Integer> setResults(List<Integer> results) {
        this.results = results;
        return results;
    }
    //results 리스트의 0번째 인덱스 삭제 기능 구현
    public void removeResult(){
        results.remove(0);
    }
}

