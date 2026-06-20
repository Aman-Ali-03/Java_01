package Java_01;
class Acc {
    public String name;
    public String Date;
    public long Account;
    public long phono;
    public String Address;
    public Double Balance;

    Acc(String name, String date, long account, long phono, String address, Double balance) {
        this.name = name;
        Date = date;
        Account = account;
        phono = phono;
        Address = address;
        Balance = balance;
    }
    Acc(String Date, String name){
        this.Date = Date;
        name=name;
    }

    public String getName(){return name;}
    public String getDate(){return Date;}
    public String getAddress(){return Address;}
    public Double getBalance(){return Balance;}
    public void setName(String name){this.name = name;}
    public void setDate(String date){this.Date = date;}
    
    public void DisplayAccount(){
        System.out.println("Name: " + name);
        System.out.println("Date: " + Date);
        System.out.println("Address: " + Address);
    }

}
public class Account {

    public static void main(String[] args){
        Acc a1 = new Acc("Amaan","29-07-2006",908978675,737481898,"Behind Chungi no 3",156320.77);
        Acc a2 = new Acc("29-07-2006","Amaan Ali");

        System.out.println("First Account details:");
        a1.DisplayAccount();
        System.out.println("Second Account details:");
        a2.DisplayAccount();
    }

}
