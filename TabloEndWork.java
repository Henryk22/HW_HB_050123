package HW_HBorisow_050123;

import java.util.Random;

public class TabloEndWork {

  static void hoursToWorkEnd (int x) {
    int hoursToEnd = x / 3600;
      System.out.println(x+ " seconds");
      System.out.println(hoursToEnd+ " hours");
      if (hoursToEnd >= 1){
          System.out.println(hoursToEnd + " hours left until the end of the working day");
      }
      else {
          System.out.println("good news. less than an hour left until the end of the work");
      }
  }
    public static void main(String[] args) {
      Random rm =new Random();
       int secondsToEnd = rm.nextInt(1, 28800);
       hoursToWorkEnd(secondsToEnd);

    }
}
