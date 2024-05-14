public class ArithmeticCalculator extends Calculator {

    public double calculate(int num1, int num2, char opearator) {
        double result = 0;

        switch (opearator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2!=0) {
                    result = num1 / num2;
                    break;
                } else{
                    throw new ArithmeticException("두번째 숫자는 0이 입력될 수 없습니다.");
                }
            default:
                throw new UnsupportedOperationException("사칙연산기호가 잘못 입력되었습니다.");
        }
        return result;
    }
    //저장된 연산결과 조회 기능
    public void inquiryResults(){
        for (Double result : getResults()) {
            System.out.println("연산결과 : "+ result);
        }
    }
}
