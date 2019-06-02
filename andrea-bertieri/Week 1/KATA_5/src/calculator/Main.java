package calculator;

public class Main {

	public static void main(String[] args) {
		//Code without Lambdas
		/*Calculator.use(new UseCalculator() {
			@Override
			public void execute(Calculator calculator) {
				calculator.fn1();
				calculator.fn2();
			}
		});*/
		
		//Code With Lambdas
		Calculator.use((Calculator calculator)->{calculator.fn1(); calculator.fn2();});
		
		

	}

}
