package HW_HBorisow_050123;

public class Walk {
    public static void main(String[] args) {

        boolean isWeekend = true;
        boolean isRain = false;
        String canWalk = "You can go for a walk";

        if (isWeekend && !isRain)
        {System.out.println(canWalk); }
        else {System.out.println("Stay at home");}
    }
}
