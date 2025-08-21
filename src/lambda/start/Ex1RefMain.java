package lambda.start;

import lambda.start.template.HelloDice;
import lambda.start.template.HelloSum;
import lambda.start.template.TimeTemplate;

public class Ex1RefMain {
	public static void main(String[] args) {
		TimeTemplate helloDice = new HelloDice();
		TimeTemplate helloSum = new HelloSum();
		helloDice.start();
		helloSum.start();
	}
}
