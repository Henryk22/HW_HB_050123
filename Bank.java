package HW_HBorisow_050123;

public class Bank {
            static void myMethod(double x) {

            for (int i=1; i < x; i++){
                if ((x/(x-i))%1 ==0)
                {double summe = x-i;
                    int sm = (int)summe;
                    int male = (int)x/sm;
                    System.out.println("Sie können "+male+" Male fur "+sm+" Dollars abheben");
                    break;
                }
            }
        }
        public static void main(String[] args) {
            myMethod(21); //Hier sollst du deine summe schreiben
        }
    }



