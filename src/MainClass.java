import Model.Book;
import Model.Drob;
import Model.MyMath;
import Model.Person;
import static java.lang.Math.*;

public class MainClass
{
    static  int id;
    static {
        id=100;
        System.out.println("Hello");
    }
    public static void main(String[] args) {
        Person p1=new Person();
        p1.DisplayInfo();
        Person p2=new Person("Vasia");
        p2.DisplayInfo();
        Person p3=new Person("Super",40);
        p3.DisplayInfo();
        Drob d1=new Drob(3,4);
        Drob d2=new Drob(5,6);
        Drob drob=d1.Plus(d2);
        drob.Print();
        System.out.println(Drob.count);
        System.out.println(MyMath.Area(6));
        System.out.println(MyMath.Perimetr(12));
        System.out.println(MyMath.sum(4,9));
        Book b1=new Book("Война и мир",1200,1100);
        b1.Print();
        System.out.println(b1.SrPrice());
        b1.Two();
        b1.Print();
        Book b2=new Book("Программирование Java",500,1900);
        b2.Print();
        System.out.println(b2.SrPrice());
        b2.Two();
        b2.Print();
    }
}
