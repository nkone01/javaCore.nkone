package javacore.chapter03.loup.exercice;

public class BasicStopwatch {

    public static void main(String[] args) throws InterruptedException {
        int seconds = 0;
        int minutes = 0;
        int hours = 0;

        while (true) {
            seconds++;
            if (seconds == 60) {
                seconds = 0;
                minutes++;
                if (minutes == 60) {
                    minutes = 0;
                    hours++;
                }
            }
            String displayHours = hours < 10 ? "0" + hours : "" + hours;
            String displayMinutes = minutes < 10 ? "0" + minutes : "" + minutes;
            String displaySeconds = seconds < 10 ? "0" + seconds : "" + seconds;

            System.out.println(displayHours + ":" + displayMinutes + ":" + displaySeconds);
            Thread.sleep(1000);
        }
    }
}
