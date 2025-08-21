package lambda.start.template;

public class HelloSum extends TimeTemplate {

	@Override
	protected void execute() {
		for (int i = 1; i <= 3; i++) {
			System.out.println("i = " + i);
		}
	}
}
