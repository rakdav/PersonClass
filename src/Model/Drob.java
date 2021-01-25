package Model;

public class Drob
{
    private int a;
    private int b;
    public static int count=0;

    public Drob()
    {
        this.a=0;
        this.b=0;
    }
    public Drob(int a, int b) {
        this.a = a;
        this.b = b;
        count++;
    }

    public Drob(int a) {
        this(a,1);
        count++;
    }
    public Drob Plus(Drob drob)
    {
        int m=this.a*drob.b+drob.a*this.b;
        int n=this.b* drob.b;
        return new Drob(m/egcd(m,n),n/egcd(m,n));
    }
    public void Print()
    {
        System.out.println(this.a+"/"+this.b);
    }

    public int egcd(int a, int b) {
        if (a == 0)
            return b;

        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }

        return a;
    }
}
