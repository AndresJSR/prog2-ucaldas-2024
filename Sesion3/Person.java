import java.util.Scanner;

public class Person {
    Scanner sc = new Scanner(System.in);
    public String name_person = "";
    public String address_person = "";
    public String email = "";

    public void inPutDataUser() {
        System.out.println("Enter your name : ");
        name_person = sc.nextLine();

        System.out.println("Enter your addres: ");
        address_person = sc.nextLine();
    }

}