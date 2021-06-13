package models;

@SuppressWarnings("serial")
public class Calculator implements java.io.Serializable {
	private double num1 = 0;
	private double num2 = 0;
	private char operationSymbol;
	public void setOperationSymbol(char operationSymbol) {
		this.operationSymbol = operationSymbol;
	}
	private double answer = 0;
	public Calculator() {
	}
	public double getNum1() {
		return num1;
	}
	public void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	public void setNum2(double num2) {
		this.num2 = num2;
	}
	public void performOperation() {
		if(this.operationSymbol == ('+')) {
			this.answer = this.num1 + this.num2;
		}
		if(this.operationSymbol == ('-')) {
			this.answer = this.num1 - this.num2;
		}
		if(this.operationSymbol == ('*')) {
			this.answer = this.num1 * this.num2;
		}
		if(this.operationSymbol == ('/')) {
			this.answer = this.num1 / this.num2;
		}
	}
	public double getAnswer() {
		System.out.println(answer);
		return answer;
	}
	
}
