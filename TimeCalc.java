public class TimeCalc {
    public static void main(String[] args) {
        int givenHours = Integer.parseInt("" + args[0].charAt(0) + args[0].charAt(1));
        int givenMinutes = Integer.parseInt("" + args[0].charAt(3) + args[0].charAt(4));
        int minutesToAdd = Integer.parseInt(args[1]);
        int hoursToAdd = (givenMinutes + minutesToAdd) / 60;
        int finalMinutes = (givenMinutes + minutesToAdd) % 60;
        int finalHours = (givenHours + hoursToAdd) % 24;

        if (finalHours < 10) {
            if (finalMinutes < 10) {
                System.out.println("0" + finalHours + ":0" + finalMinutes);
            } else {
                System.out.println("0" + finalHours + ":" + finalMinutes);
            }
        } else {
            if (finalMinutes < 10) {
                System.out.println(finalHours + ":0" + finalMinutes);
            } else {
                System.out.println(finalHours + ":" + finalMinutes);
            }
        }

    }
}
