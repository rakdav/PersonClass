package Model;

public class Book
{
    private String name;
    private int pages;
    private double price;

    public Book() {
        this.name = "Untitled";
        this.pages=0;
        this.price=0;
    }

    public Book(String name, int pages, double price) {
        this.name = name;
        this.pages = pages;
        this.price = price;
    }
    public double SrPrice()
    {
        return price/pages;
    }
    public void Two()
    {
        if(name.startsWith("Программирование"))
            this.price*=2;
    }
    public void Print()
    {
        System.out.println("Название:"+this.name+" Цена:"+this.price+" Страниц:"+this.pages);
    }
}
