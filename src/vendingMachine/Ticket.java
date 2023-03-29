package vendingMachine;

public class Ticket
{
    private int price;
    private int id;


    public Ticket()
    {
        price = 0;
        id = 0;
    }

    public Ticket (int price, int id)
    {
        this.price = price;
        this.id = id;
    }

    //getters & setters


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}


