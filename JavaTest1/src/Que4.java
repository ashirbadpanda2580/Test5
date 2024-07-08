import java.util.Scanner;

class Product{
    String prodId;
    String prodName;
    double prodPrice;

    Product(String prodId, String prodName, double prodPrice){
        this.prodId = prodId;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    void details(){
        System.out.println("ProdId: "+prodId);
        System.out.println("ProdName: "+prodName);
        System.out.println("ProdPrice: "+prodPrice);
    }
}
public class Que4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product Id: ");
        String prodId = sc.next();
        System.out.println("Enter Product Name: ");
        String prodName = sc.next();
        System.out.println("Enter Product Price: ");
        double prodPrice = sc.nextDouble();
        Product p1 = new Product(prodId, prodName, prodPrice);
        p1.details();
        sc.close();
    }
}
