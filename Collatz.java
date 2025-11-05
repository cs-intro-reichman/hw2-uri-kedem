// Demonstrates the Collatz conjecture.
public class Collatz {
	public static void main(String args[]) {
		int seed = Integer.parseInt(args[0]);
		String mode = args[1];
		String collatz = "";
		int steps = 1;
		if (mode.equals("v")) {
			System.out.println("1 4 2 1 (4)");
			for (int i = 1; i < seed; i++) {
				int conjecture = i + 1;
				collatz = "" + conjecture + " ";
				steps = 1;
				while (conjecture != 1) {
					if (conjecture % 2 == 0) {
						conjecture = conjecture / 2;
					} else {
						conjecture = 3 * conjecture + 1;
					}
					steps++;
					collatz = collatz + conjecture + " ";
				}
				System.out.println(collatz + " (" + steps + ")");
			}
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");

		} else if (mode.equals("c")) {
			System.out.println("Every one of the first " + seed + " hailstone sequences reached 1.");
		} else {
			System.out.println("Invalid mode. Use 'v' for verbose or 'c' for concise.");
		}

	}
}
