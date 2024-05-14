public class CircleCalculator extends Calculator {

    private static final double FI = 3.14;

    //원의 반지름을 구하는 메서드
    public double calculateCircleArea(int radius){
        return FI * radius  * radius;
    }

    public void inquiryCircleResults(){
        for(Double circleresult : getResults()){
            System.out.println("저장된 원의 넓이 : "+ circleresult);
        }
    }
}

