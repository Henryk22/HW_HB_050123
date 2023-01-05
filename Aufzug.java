package HW_HBorisow_050123;
public class Aufzug {

    static void numberOfLifts (int floor, int stepUp, int stepDown){

        int oneLift = stepUp-stepDown;
        int i = 1;
        while ( oneLift < floor ) {
            System.out.println(oneLift+ "-"+ i);
            oneLift= oneLift+stepUp-stepDown;
            i++;
        }//while
        System.out.println("number of lifts is "+ i);
    }//static void numberOfLifts
    public static void main (String[]args){
        int numberOfFloors = 200;
        int up = 50;
        int down = 1;
        numberOfLifts (numberOfFloors, up, down );}

}//public class Aufzug

