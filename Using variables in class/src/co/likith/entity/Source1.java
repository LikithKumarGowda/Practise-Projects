package co.likith.entity;
import java.util.Scanner;
public class Source1 {

	public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        int bookId=sc.nextInt();
        sc.nextLine();
        String title=sc.nextLine();
        String description=sc.nextLine();
        String author=sc.nextLine();
        int availableQuantity=sc.nextInt();
        int totalQuantity=sc.nextInt();
        double price=sc.nextDouble();
        double rentPerDay=sc.nextDouble();
        
        int adminId=sc.nextInt();
        sc.nextLine();
        String emailId=sc.nextLine();
        String firstName=sc.nextLine();
        String password=sc.nextLine();
        
        Book b=new Book(bookId,title,description,author,availableQuantity,totalQuantity,price,rentPerDay);
        Admin a=new Admin(adminId,emailId,firstName,password);
        System.out.println(a);
        System.out.println(b);
    }

}



interface CustomerService{}

class CustomerServiceImpl implements CustomerService{}

