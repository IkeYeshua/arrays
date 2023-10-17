import java.util.Scanner;

public class exercises {
    public static void main(String[] args) {

        //long value = Long.MAX_VALUE;
       // System.out.println(value);
        division();
        System.out.println();
        divide();
        System.out.println();
        System.out.println();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value: ");
        int theValue = input.nextInt();

        try {
            maxValue(theValue);

        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println("Continue after the catch block ");


    }

    public static void maxValue(int theValue) throws Exception {

        if (theValue < 40)
            throw new Exception("The value is too small ");
        else
            System.out.println("The value is greater ");



    }

    public static void division() {
        for (int i = 0; i < 2; i++) {
            System.out.print(i + " ");
            try {
                System.out.println(1 / 0);
            }
            catch (Exception ex) {
            }
        }
    }
    public static void divide(){
        try {
            for (int i = 0; i < 2; i++) {
                System.out.print(i + " ");
                System.out.println(1 / 0);
            }
        }
        catch (Exception ex) {

        }
    }
}