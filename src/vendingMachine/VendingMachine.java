package vendingMachine;

public class VendingMachine
{
    private int actualPrice;
    private boolean offOn;
    private int id;
    private double income;
    private int insertedMoney;


    public VendingMachine()
    {
        actualPrice = 0;
        offOn = false;
        id = 0;
        income = 0;
        insertedMoney = 0 ;
    }

    public VendingMachine(int actualPrice, boolean offOn , int id, double income, int insertedMoney)
    {
        this.actualPrice = actualPrice;
        this.offOn = offOn;
        this.id = id;
        this.income = income;
        this.insertedMoney = insertedMoney;
    }

    //getters


    public int getActualPrice() {
        return actualPrice;
    }

    public boolean isOffOn() {
        return offOn;
    }

    public int getId() {
        return id;
    }


    public int getInsertedMoney() {
        return insertedMoney;
    }

    public void setActualPrice(int actualPrice) {
        this.actualPrice = actualPrice;
    }

    public void setOffOn(boolean offOn) {
        this.offOn = offOn;
    }

    private void setIncome(double income) {
        this.income = income;
    }

    private void setInsertedMoney(int insertedMoney) {
        this.insertedMoney = insertedMoney;
    }

    public void setId(int id) {
        this.id = id;
    }

 /// methods

    public boolean changeState(int settedPrice)  //setted from the user
    {

        setId(0);
        setIncome(0);
        setInsertedMoney(0);
        setActualPrice(settedPrice);


        if(this.offOn)
        {
            return this.offOn = false;
        }
        else
        {
            return this.offOn = true;
        }


    }


    public void insertMoney(int insertedMoney)
    {
        this.income += insertedMoney;
        this.insertedMoney += insertedMoney;

    }

    public Ticket printTicket()
    {
        Ticket newTicket = new Ticket();

        newTicket.setId(this.id);
        newTicket.setPrice(this.actualPrice);
        this.id ++;
        this.insertedMoney -= this.actualPrice;

        System.out.println("PSHHHHHH, TICKET PRINTED. You have ticket number ["+id+"] Have a nice ride!");
        System.out.println("You've $" +insertedMoney+" remaining in your balance.");
        return newTicket;
    }

    public double getIncome() {
        return income;
    }

    public void emptyIncome ()
    {
       setIncome(0);
       setInsertedMoney(0);
    }

    public void checkInsertedMoney ()
    {
            if (insertedMoney >= actualPrice) {
                while (insertedMoney >= actualPrice) {
                    printTicket();
                }
            } else {
                System.out.println("Please insert $ " + (actualPrice - insertedMoney) + " more to have a ticket.");

            }

    }
}