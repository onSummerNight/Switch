public class SwitchChallage {
    public static void main(String[] args) {
        String stringInput = "A";
            switch(stringInput){
                case "A":
                    System.out.println("Able");
                    break;
                case "B":
                    System.out.println("Baker");
                    break;
                case "C":
                    System.out.println("Charlie");
                    break;
                case "D":
                    System.out.println("Dog");
                    break;
                case "E":
                    System.out.println("Easy");
                    break;
                default:
                    System.out.println("Not Found");
                    break;
            }

        printDayOfWeek(3);
            printWeekDay(3);

        }

    public static void printDayOfWeek(int day) {
        String dayOfTheWeek;
        switch (day){
            case 0 -> dayOfTheWeek = "Sunday";
            case 1 -> dayOfTheWeek = "Monday";
            case 2 -> dayOfTheWeek = "Tuesday";
            case 3 -> dayOfTheWeek = "Wednesday";
            case 4 -> dayOfTheWeek = "Thursday";
            case 5 -> dayOfTheWeek = "Friday";
            case 6 -> dayOfTheWeek = "Saturday";
            default -> dayOfTheWeek = "Invalid Day";
        }

        System.out.println("Day " + day + " is " + dayOfTheWeek);

    }

    public static void printWeekDay(int day){
        String dayOfTheWeek;
        if (day == 0){
            dayOfTheWeek = "Sunday";
        } else if (day == 1){
            dayOfTheWeek = "Monday";
        } else if (day == 2){
            dayOfTheWeek = "Tuesday";
        } else if (day == 3) {
            dayOfTheWeek = "Wednesday";
        } else if (day == 4) {
            dayOfTheWeek = "Thursday";
        } else if (day == 5) {
            dayOfTheWeek = "Friday";
        } else if (day == 6) {
            dayOfTheWeek = "Saturday";
        } else {
            dayOfTheWeek = "Invalid Day";
        }

        System.out.println("Day " + day + " is " + dayOfTheWeek);
    }
}
