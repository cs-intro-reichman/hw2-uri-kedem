//feedback

/*
Great work boaz!
*/

// Prints a crowd cheering output.
public class Cheers {
        public static void main(String[] args) {
                String cheers = args[0];
                String CHEERS = cheers.toUpperCase();
                int numCheers = Integer.parseInt(args[1]);
                for (int i = 0; i < cheers.length(); i++) {
                        String anLetters = "AaEeFfHhIiLlMmNnOoRrSsXx";
                        if (anLetters.indexOf(cheers.charAt(i)) == -1) {
                                System.out.println("Give me a" + CHEERS.charAt(i) + ": " + CHEERS.charAt(i) + "!");
                        } else {
                                System.out.println("Give me an" + CHEERS.charAt(i) + ": " + CHEERS.charAt(i) + "!");
                        }
                }
                System.out.println("What does that spell?");
                for (int j = 0; j < numCheers; j++) {
                        System.out.print(CHEERS + "!!!");
                        System.out.println();
                }

        }
}
