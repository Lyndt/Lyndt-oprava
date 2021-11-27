public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;

        // Write a program that prints the remaining seconds (as an integer) from a
        // day if the current time is represented by the variables above

        //3600 sec's has an hour
        //60 sec's has an minute

        //int secInHour = 3600;
        //int secInMinute = 60;

        //int secInWholeDay = 24 * secInHour;
        //int secInCurentDay = (currentHours * secInHour) + (currentMinutes * secInMinute) + currentSeconds;
        //System.out.println("Remaining seconds from a current day: " + secInWholeDay - secInCurentDay);

        long wholeDay = 24 * 3600;
        long remainingSec = (currentHours * 3600) + (currentMinutes * 60) + 42;
        System.out.println(wholeDay - remainingSec);
    }
}