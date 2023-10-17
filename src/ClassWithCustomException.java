public class ClassWithCustomException {
    private double radius;

    private static int numberOfObjects = 0;

    public ClassWithCustomException() throws InvalidRadiusException{
        this(1.0);
    }

    public ClassWithCustomException(double newRadius)throws InvalidRadiusException {
           setRadius(newRadius);
           numberOfObjects++;

    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) throws InvalidRadiusException{
        if (newRadius >= 0)
            radius = newRadius;
        else
            throw new InvalidRadiusException(newRadius);

    }

    public static int getNumberOfObjects() {
        return numberOfObjects;
    }

    public double findArea() {
        return radius * radius * 3.14159;
    }
}
