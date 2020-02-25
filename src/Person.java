import java.util.ArrayList;

public class Person {
    String fname;
    String lname;
    ArrayList<String> number;
    String email;

    public Person(String fname, String lname, ArrayList number, String email) {
        this.fname = fname;
        this.lname = lname;
        this.number = number;
        this.email = email;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public ArrayList<String> getNumber() {
        return number;
    }

    public String getEmail() {
        return email;
    }
}
