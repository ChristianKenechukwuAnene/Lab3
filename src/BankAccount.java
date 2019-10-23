public abstract class BankAccount implements Transactable, Taxable{
    private String name;
    private int accum;

    public BankAccount()
    {
        this.name="unknown";
        this.accum=0;
    }
    public BankAccount(String name, int accum){
        this.name=name;
        this.accum=accum;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setAccum(int accum){
        this.accum=accum;
    }
    public String getName(){
        return name;
    }
    public int getAccum(){
        return accum;
    }
    public String toString(){
        return ("Name" + getName()+
                "\nAccount Number:" + getAccum());
    }
    public abstract double calcTax();
    public abstract void lodge(double amount);
    public abstract void withdraw(double amount);
}
