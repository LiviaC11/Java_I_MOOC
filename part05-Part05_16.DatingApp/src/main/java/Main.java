
public class Main {

    public static void main(String[] args) {
        SimpleDate lastday = new SimpleDate(30, 12, 1900);
        System.out.println(lastday);
        lastday.advance();
        System.out.println(lastday);
        lastday.advance();
        System.out.println(lastday);
        SimpleDate newTry = new SimpleDate(1, 1, 1000);
        System.out.println(newTry);
        newTry.advance(60);
        System.out.println(newTry);

        SimpleDate date = new SimpleDate(13, 2, 2015);
        System.out.println("Friday of the examined week is ");

        SimpleDate newDate = date.afterNumberOfDays(7);
        int week = 1;
        while (week <= 7) {
            System.out.println("Friday after " + week + " weeks is " + newDate);
            newDate = newDate.afterNumberOfDays(7);

            week = week + 1;
        }

        System.out.println("The date after 790 days from the examined Friday is ... try it out yourself!");
        // System.out.println("Try " + date.afterNumberOfDays(790));
    }
}
