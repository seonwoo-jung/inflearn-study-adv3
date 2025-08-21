package lambda.start.template;

import java.util.Random;

public class HelloDice extends TimeTemplate {

	@Override
	protected void execute() {
		int randomValue = new Random().nextInt(6) + 1;
		System.out.println("주사위 = " + randomValue);
	}
}
