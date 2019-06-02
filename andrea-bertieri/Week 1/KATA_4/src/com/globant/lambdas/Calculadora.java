package com.globant.lambdas;
import java.lang.Integer;
import java.util.function.BinaryOperator;

public class Calculadora {

	public static void main(String[] args) {
		BinaryOperator<Integer> sum=(a,b)->a+b;
		BinaryOperator<Integer> subtract=(a,b)->a-b;
		BinaryOperator<Integer> multiply=(a,b)->a*b;
		
		System.out.println(BasicOperations.execute(sum,4,7));
		System.out.println(BasicOperations.execute(subtract,4,7));
		System.out.println(BasicOperations.execute(multiply,4,7));
	}

}
