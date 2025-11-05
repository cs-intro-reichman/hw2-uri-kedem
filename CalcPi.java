// Computes an approximation of PI.
public class CalcPi {
	public static void main(String[] args) {
		int numTerms = Integer.parseInt(args[0]);
		double piApprox = 0.0;
		double piJava = Math.PI;
		int counter = 1;
		for (int i = 0; i < numTerms; i++) {
			if (i % 2 == 0) {
				piApprox = piApprox + (1.0 / counter);
			} else {
				piApprox = piApprox - (1.0 / counter);
			}
			counter = counter + 2;
		}
		piApprox = piApprox * 4;
		System.out.println("pi according to Java: " + piJava);
		System.out.println("pi, approximated:     " + piApprox);
	}
}
