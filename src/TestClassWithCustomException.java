import java.util.concurrent.Callable;

public class TestClassWithCustomException {

    public static void main(String[] args) {
       /* try {
            new ClassWithCustomException(5);
            new ClassWithCustomException(-5);
            new ClassWithCustomException(0);
        }
        catch (InvalidRadiusException e) {
            System.out.println(e);
        }
        System.out.println("Number Of Objects Created:  "  +  ClassWithCustomException.getNumberOfObjects());*/
         try {
             method3();
             System.out.println("After the method call");

         }
         catch (RuntimeException ex) {
             System.out.println("RuntimeException in main");
         }
         catch (Exception ex) {
             System.out.println("Exception in main");
         }

    }
    public static void method3() throws Exception{
        try {
            ClassWithCustomException c1= new ClassWithCustomException(1);
            c1.setRadius(-1);
            System.out.println(c1.getRadius());
        }
        catch (RuntimeException ex) {
            System.out.println("RuntimeException in method()");
        }
        catch (Exception ex) {
            System.out.println("Exception in method()");
            throw ex;
        }
    }
}
