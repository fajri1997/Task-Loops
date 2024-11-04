public class WeekdaysPrinter {

    public static void main(String[] args) {

        String[] weeksArray = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};


        for (int allweek = 0; allweek < 7; allweek++) {
            System.out.println(weeksArray[allweek]);
        }


        System.out.println("######################");




        for (int week = 0; week < 7; week++) {
            if (week > 0 && week < 6) {
                System.out.println(weeksArray[week]);
            }
            if (week == 5) {
                break;
            }
        }


    }
}


