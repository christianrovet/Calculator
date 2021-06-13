package models;

public class CalculatorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calc = new Calculator();
		calc.setNum1(10.5);
		calc.setNum2(5.2);
		calc.setOperationSymbol('+');
		calc.performOperation();
		calc.getAnswer();
		calc.setNum1(100);
		calc.setNum2(33);
		calc.setOperationSymbol('-');
		calc.performOperation();
		calc.getAnswer();
		calc.setNum1(22);
		calc.setNum2(-2);
		calc.setOperationSymbol('*');
		calc.performOperation();
		calc.getAnswer();
		calc.setNum1(10);
		calc.setNum2(5);
		calc.setOperationSymbol('/');
		calc.performOperation();
		calc.getAnswer();
	}

}
