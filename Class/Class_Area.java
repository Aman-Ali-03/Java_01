package Java_01;
import java.util.Scanner;

interface Area {
    void area();
}

class Rectange implements Area {
    private int length;
    private int breadth;

    Rectange(int l, int b) {
        length = l;
        breadth = b;
    }

    public void area() {
        System.out.println("Area of rectangle : " + (length * breadth));
    }
}

class Square implements Area {
    private int length;

    Square(int l) {
        length = l;
    }

    public void area() {
        System.out.println("Area of square : " + (length * length));
    }
}

public class Class_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of the box : ");
        int length = input.nextInt();

        System.out.print("Enter the breadth of the box : ");
        int breadth = input.nextInt();

        if (length != breadth) {
            Rectange rec = new Rectange(length, breadth);
            rec.area();
        } else {
            Square sq = new Square(length);
            sq.area();
        }
        input.close();
    }
}
