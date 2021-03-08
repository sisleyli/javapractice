package testexcept;

public class OverdraftException extends Exception{
    //private double deficit;
    public OverdraftException(String message,double deficit) {
        super(message);
        System.out.printf("已透支%.2f元\n",deficit);
    }
}
