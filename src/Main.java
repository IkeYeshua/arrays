public class Main {
    public static void main(String[] args) {
        try {
            throw new MyException();
        }
        catch (MyException ex) {
            System.out.println("Caught");
            System.out.println(ex.getMessage());
        }

    }
}
