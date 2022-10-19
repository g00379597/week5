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

    public int sub(int dig3, int dig4)
    {
        result = dig3 - dig4;
        return result;
    }
}
