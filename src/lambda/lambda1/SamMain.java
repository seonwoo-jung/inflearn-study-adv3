package lambda.lambda1;

public class SamMain {

	public static void main(String[] args) {
		SamInterface sameInterface = () -> {
			System.out.println("sam");
		};
		sameInterface.run();

//		NotSamInterface notSamInterface = () -> {
//			System.out.println("not sam");
//		};

//		notSamInterface.go();
//		notSamInterface.run();
	}
}
