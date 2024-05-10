import java.util.ArrayList;
import java.util.List;

public class CircleCalculator extends Calculator {

    private List<Double> circleList = new ArrayList<>();

    public void CircleCalculator(char operation,int number1, int number2){
        this.operation = operation;
        this.number1 = number1;
        this.number2 = number2;
        List<Double> circleList = new ArrayList<>();
    }
    //getter
    public List<Double> getCircleResultList(){
        return circleList;
    }
    //setter
    public List<Double> setCircleResultList(double circleresults){
        circleList.add(circleresults);
        return circleList;
    }
    //저장된 연산 결과 조회 기능
    public void inquiryCircleResults(){
        System.out.println("원의 넓이 결과값 조회" + circleList.toString());
    }
}
