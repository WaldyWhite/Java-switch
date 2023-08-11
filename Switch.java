public class Switch {
    public static void main (String[] args) {
        int day  = 9;

        String weekDay = switch (day){
            case 1 -> weekDay = "Monday";
            case 2 -> weekDay = "Tuesday";
            case 3 -> weekDay = "Wenesday";
            case 4 -> weekDay = "Thursday";
            case 5 -> weekDay = "Friday";
            case 6 -> weekDay = "Saturday";
            case 7 -> weekDay = "Sunday";
            default -> weekDay = "Invalid";
        };
        System.out.println(weekDay);
    }

}