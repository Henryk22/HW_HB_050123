package HW_HBorisow_050123;

public class Flask {
    static void Pribor(int temperatur1, int temperatur2) {
        if (temperatur1 > 100 && temperatur2 < 100) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }
    }

    public static void main (String[]args)
    {
        Pribor(110, 80);
    }

}
