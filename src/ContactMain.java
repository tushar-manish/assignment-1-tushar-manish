import java.util.ArrayList;
import java.util.Scanner;

public class ContactMain {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Contact cn = new Contact();
        while (true) {
            ArrayList<String> mob = new ArrayList<>();
            System.out.println("Contact Menu");
            System.out.println("Press 1 : Add Contact");
            System.out.println("Press 2 : View All Contact");
            System.out.println("Press 3 : Search For A Contact");
            System.out.println("Press 4 : Delete A Contact");
            System.out.println("Press 5 : Exit");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("----Enter Contact Detail----");
                    System.out.print("First Name : ");
                    String fn = scan.next();
                    System.out.print("Second Name : ");
                    String ln = scan.next();
                    System.out.print("Contact Number : ");
                    mob.add(scan.next());
                    while (true) {
                        System.out.println("Want To Add Another Number (Press 1/0)");
                        String y = scan.next();
                        System.out.println(y);
                        if (y.equals("1")) {
                            System.out.print("Contact Number : ");
                            mob.add(scan.next());
                        } else {
                            break;
                        }
                    }
                    System.out.println("Want To Add Email Address (Press 1/0)");
                    String q = scan.next();
                    String em = "";
                    if (q.equals("1")) {
                        System.out.print("Email Address : ");
                        em = scan.next();
                    }
                    Person p = new Person(fn, ln, mob, em);
                    Node ns = new Node(p);
                    cn.insert(ns);
                    System.out.println("New Entry Inserted");
                    break;
                case 2:
                    System.out.println("----ALL Contact----");
                    cn.viewcontact();
                    break;
                case 3:
                    System.out.println("----Search Contact----");
                    System.out.print("Enter Name : ");
                    String s = scan.next();
                    cn.search(s);
                    break;
                case 4:
                    System.out.println("----Delete Contact----");
                    System.out.print("Enter fname : ");
                    String ss = scan.next();
                    cn.delete(ss);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Not A Valid Entry");
            }
            System.out.println();
            System.out.println("Do you want to continue... Press(1/0)");
            int o = scan.nextInt();
            if (o == 0) break;
        }
    }
}