public class moreExercise {
    public static void main(String[] args){

       try {
            addition(-2,7);
            System.out.println(" go ahead");

        }
        catch (IllegalArgumentException ex){
            System.out.println("IllegalArgumentException: No negative number");
        }

     finally {
            System.out.println("Continue execution");

        }


    }
    public static int addition(int num1, int num2)throws IllegalArgumentException{
        int result = 0;
        result = num1 + num2;
        if (num1 >=0 && num2 >=0)
            System.out.println(result);
        else
            throw new IllegalArgumentException(" negative number");
              //System.out.println("No result");

        return result;
    }

}

