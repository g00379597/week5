package ie.atu.week5;

public class Calculator {
    private int dig1;
    private int dig2;
    private int result;

    public Calculator() {
        result = 0;
    }

    public int add(int dig1, int dig2)
    {
        result = dig1 + dig2;
        return result;
    }

}
