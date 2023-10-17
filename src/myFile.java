import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class myFile {
    public static void main(String[] args) {//throws IOException {
        //java.io.File file = new File("scores.txt");


       // Scanner sc = new Scanner("13 14");
        //int intValue = sc.nextInt();

        /*if (file.exists()) {
            System.out.println("File already exist");
            System.exit(1);
        }
        try (
                java.io.PrintWriter output = new java.io.PrintWriter(file);
        ){
            output.print("John T Smith");
            output.println(90);
            output.print("Eric K Jones");\
            output.print(85);


            output.close();
        }*/
        //Number[] numberArray = new Integer[2];
       // numberArray[0] = new Double(1.5);
        Number x = new Integer(3);
        System.out.println(x.intValue());
       // System.out.println( x.compareTo(new Integer(4)));


        ArrayList<Number> list = new ArrayList<>();
        list.add(45);
        list.add(3445.53);
        list.add(new BigInteger("3456278944563334885567"));
        list.add(new BigDecimal("2.0909090989091343433344343"));


    }

    private static Number getLargestnumber(ArrayList<Number> list) {
        Number number = list.get(0);
        for (int i = 0; i < list.size(); i++)
            if (number.doubleValue()< list.get(i).doubleValue())
                number = list.get(i);
            else if (list == null || list.size() == 0)
                return null;

        return number;
    }


}