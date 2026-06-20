package Java_01;
class Produc {
    private String itemNo;
    private String name;
    private double price;
    private short qty;
    public Produc(String itemno) {
        itemNo = itemno;
    }
    public Produc(String itemno, String name) {
        itemNo = itemno;
        this.name = name;
    }
    public Produc(String itemno, String name, double price, short qty) {
        itemNo = itemno;
        this.name = name;
        setPrice(price);
        setQuantity(qty);
    }
    public String getItemNo() {
        return itemNo;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public short getQuantity() {
        return qty;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(short qty) {
        this.qty = qty;
    }
    public void displayProduct() {
        System.out.println("Item No: " + itemNo);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + qty);
    }
}
public class product {
    public static void main(String[] args) {
        Produc p1 = new Produc("101");
        Produc p2 = new Produc("102", "Laptop");
        Produc p3 = new Produc("103", "Mobile", 15000.50, (short) 10);
        System.out.println("Product 1:");
        p1.displayProduct();
        System.out.println("");
        System.out.println("Product 2:");
        p2.displayProduct();
        System.out.println("");
        System.out.println("Product 3:");
        p3.displayProduct();
    }
}
