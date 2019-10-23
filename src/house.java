public class house {      //Attributes
    private String address;
    private String type;
    private double price;
    private  Person owner;

    public house(){         //No Argument Constructors
        this.address = "No Address Specified";
        this.type = "No Type Specified";
        this.price = 0.0;
        setOwner("unknow name",0);
    }

    public house(String address, String type, double price, String name,int age){
        this.address = address;
        this.type = type;
        this.price = price;
        setOwner(name,age);
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setType(String type){
        this.type=type;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void setOwner( String name,int age){
        this.owner=new Person(name,age);
    }
    public String getAddress(){
        return address;
    }
    public String getType(){
        return type;
    }
    public double getPrice(){
        return price;
    }
    public Person getOwner(){
        return owner;
    }
    public String toString(){
        return "Address"+getAddress()+
                "\nType"+getType()+
                "\nPrice"+getPrice()+
                "\nOwner"+getOwner();
    }
}
