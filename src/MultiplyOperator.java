public class MultiplyOperator extends ArithmericCalculator{
        int number1 = Calculator.number1;
        int number2 = Calculator.number2;
        int result = Calculator.result;

    public int operate(int num1, int num2){
        this.number1 = num1;
        this.number2 = num2;
        return result=number1*number2;
    }
}
