package javacore.chapter05.object.exercice;

public class BasicStopwatch {
     String nom;
     int seconds;
     int minutes;
     int hours;

     public BasicStopwatch(String nom, int seconds,  int minutes,  int hours ) {

          this.nom = nom;
          this.seconds = seconds;
          this.minutes = minutes;
          this.hours = hours;
     }
     public void launch() {
          while (true) {
               displayTime();
               seconds++;
               if (seconds == 60) {
                    seconds = 0;
                    minutes++;
                    if (minutes == 60) {
                         minutes = 0;
                         hours++;
                    }
               }

          }

     }
     public void displayTime() {
          String displayHours = hours < 10 ? "0" + hours : "" + hours;
          String displayMinutes = minutes < 10 ? "0" + minutes : "" + minutes;
          String displaySeconds = seconds < 10 ? "0" + seconds : "" + seconds;

          System.out.println(nom + " : " + displayHours + ":" + displayMinutes + ":" + displaySeconds);
     }




}
