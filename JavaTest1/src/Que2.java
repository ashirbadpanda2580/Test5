import java.util.Scanner;
class Laptop{
    static int number = 10001;
    final int mNumber;
    String brand;
    final String stay = "LAP";
    
Laptop(String brand){
    this.mNumber = number++;
    this.brand = brand;
    }
    
    void details() {
        System.out.println("====================================");
        System.out.println("Brand: "+brand);
        System.out.println(brand+mNumber+stay);
    }
}


public class Que2{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Brand: ");
        String brand = sc.next();
        
        Laptop l1 = new Laptop(brand);
        l1.details();

        System.out.println("Enter Brand: ");
        String brand1 = sc.next();
        
        Laptop l2 = new Laptop(brand1);
        l2.details();
        sc.close();
        
    }
}