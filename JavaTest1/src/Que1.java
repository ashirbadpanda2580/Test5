import java.util.Scanner;

class Student{
    String name;
    long phno;
    String email;
    String courseType;

    Student(String name, long phno, String email, String courseType){
        this.name = name;
        this.phno = phno;
        this.email = email;
        this.courseType = courseType;
    }

    void details(){
        System.out.println("name: "+name);
        System.out.println("phno: "+phno);
        System.out.println("email: "+email);
        System.out.println("couresType: "+courseType);
        System.out.println("Registration Successful!!!");
    }
}
public class Que1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("----------------Welcome to Jspider ------------------");
        System.out.println("How u want to Register");
        System.out.println("Press 1: PhoneNumber Registration");
        System.out.println("Press 2: Email Register ");
        System.out.println("Press 3: For both");
        int chose = sc.nextInt();
        switch (chose) {
            case 1:
                System.out.println("Enter your PhoneNumber: ");
                long phno = sc.nextLong();
                System.out.println("Enter Name: ");
                String name = sc.next();
                System.out.println("Course Type: ");
                String courseType = sc.next();
                Student s1 = new Student(name, phno, null, courseType);
                s1.details();
                break;
            
            case 2:
                System.out.println("Enter your Email: ");
                String email1 = sc.next();
                System.out.println("Enter your Name: ");
                String name1 = sc.next();
                System.out.println("CourseType: ");
                String course = sc.next();
                Student s2 = new Student(name1, 0, email1, course);
                s2.details();
                break;
            
            case 3:
                System.out.println("Enter Your Name: ");
                String name2 = sc.next();
                System.out.println("Enter Phno: ");
                long phno2 = sc.nextLong();
                System.out.println("Enter email: ");
                String email2 = sc.next();
                System.out.println("Course Type : ");
                String course2 = sc.next();
                Student s3 = new Student(name2, phno2, email2, course2);
                s3.details();
                break;
        
            default:
            System.out.println("invalid");
                break;
        }
        sc.close();
    }
}
