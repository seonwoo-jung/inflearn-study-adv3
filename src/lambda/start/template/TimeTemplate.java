package lambda.start.template;

public abstract class TimeTemplate {
	public void start() {
		long startNs = System.nanoTime();
		execute();
		long endNs = System.nanoTime();
		System.out.println("실행 시간: " + (endNs - startNs) + "ns");
	}

	protected abstract void execute();
}
