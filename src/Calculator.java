import java.util.ArrayList;
import java.util.List;

public class Calculator {

    static final double FI = 3.14;

    private List<Integer> results = new ArrayList<>();
    private List<Double> circleresults = new ArrayList<>();

    //기본생성자


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

    //원의 반지름을 구하는 메서드
    public double calculateCircleArea(int radius){
         return FI * radius  * radius;
    }
    //getter
    public List<Integer> getResults() {
        return results;
    }
    public List<Double> getCircleresults() {
        return circleresults;
    }
    //setter
    public List<Integer> setResults(List<Integer> results) {
        this.results = results;
        return results;
    }
    public void setCircleresults(List<Double> circleresults) {
        this.circleresults = circleresults;
    }

    //results 리스트의 0번째 인덱스 삭제 기능 구현
    public void removeResult(int index){
        results.remove(index);
    }
    //저장된 연산결과 조회 기능
    public void inquiryResults(){
        for (Integer result : results) {
            System.out.println("연산결과 : "+ result);
        }
    }
    public void inquiryCircleResults(){
        for(Double circleresult : circleresults){
            System.out.println("저장된 원의 넓이 : "+ circleresult);
        }
    }
}

