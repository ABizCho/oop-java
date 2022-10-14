package lab.lab_5.q2;

public class ThisTest {
    public static void main(String[] args)
    {
        SimpleTime time = new SimpleTime(15, 30 ,19);
        System.out.println(time.buildString());
    }
}

class SimpleTime
{
    private int hour;
    private int minute;
    private int second;

    public SimpleTime(int Hour, int Minute, int Second)
    {
        hour = Hour;
        minute = Minute;
        second = Second;
    }

    public String buildString()
    {
        return String.format("%24s: %s%n%24s: %s",
        "this.toUniversalString()", this.toUniversalString(),
        "toUniversalString()", toUniversalString());
    }

    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d",
        this.hour, this.minute, this.second);
    }
}
