package HW_HBorisow_050123;

import java.util.Scanner;

public class Edeka {
    static void canBuy (double oClock1, int dayOfTheWeek1) {
        boolean isEdekaOpen=false;
        boolean isReweopen=false;
        if (dayOfTheWeek1 == 7)
        {System.out.println("All the supermarkets are closed"); }
        else {
            if (7. <= oClock1 && oClock1 <= 22.)
            { isEdekaOpen = true;
                System.out.println ("Edeka is open");}
            if (8. <= oClock1 && oClock1 <= 20.)
            {isReweopen = true;
                System.out.println ("Rewe is open too");}
            boolean canBuy;
            canBuy = isReweopen || isEdekaOpen;
            //System.out.println(canBuy);6
            if (canBuy) {
                System.out.println("You kan buy food ");
            } else {
                System.out.println("all the shops are closed");
            }

        }//else*/
    }
    public static void main(String[] args)
    {
        Scanner myScan=new Scanner (System.in) ;
        System.out.println("what time is it now? ");
        double oClock=myScan.nextDouble();
        System.out.println("what day of the week is it today? ");
        System.out.println("Print a number 1--7, 1 - Monday, 2 -Tuesday...7 is Sunday");
        int dayOfTheWeek =myScan.nextInt();
        canBuy(oClock, dayOfTheWeek);


       /*boolean isEdekaOpen=false;
       boolean isReweopen=false;
       if (dayOfTheWeek == 7)
       {System.out.println("All the supermarkets are closed"); }
        else {
           if (7. <= oClock && oClock <= 22.)
               isEdekaOpen = true;
           //System.out.println ("Edeka +"+ isEdekaOpen);
           if (8. <= oClock && oClock <= 20.)
               isReweopen = true;
           //System.out.println ("Rewe+"+isReweopen);
           boolean canBuy;
           canBuy = isReweopen || isEdekaOpen;
           //System.out.println(canBuy);6
           if (canBuy) {
               System.out.println("I kan buy food ");
           } else {
               System.out.println("all the shops are closed");
           }

       }//else*/

    }//public static void main(String[] args)
}//public class Edeka