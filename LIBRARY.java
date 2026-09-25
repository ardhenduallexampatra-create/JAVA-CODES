

import java.util.Scanner;

class BOOK {

    int id;
    String Name;
    String Authername;
    boolean available;

    // Constructor
    BOOK(int id, String Name, String Authername) {
        this.id = id;
        this.Name = Name;
        this.Authername = Authername;
        this.available = true;
    }

    // Display book details
    void displayBOOKdetails() {
        System.out.println("Book ID     : " + id);
        System.out.println("Book Name   : " + Name);
        System.out.println("Author      : " + Authername);

        if (available) {
            System.out.println("Status      : Available");
        } else {
            System.out.println("Status      : Issued");
        }

        System.out.println("-------------------------");
    }

    // Issue book
    void issuebook() {
        if (available) {
            available = false;
            System.out.println("Book issued successfully!");
        } else {
            System.out.println("Book is already issued.");
        }
    }

    // Return book
    void returnbook() {
        if (!available) {
            available = true;
            System.out.println("Book returned successfully!");
        } else {
            System.out.println("Book is already available.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        BOOK book1 = new BOOK(101, "Java Programming", "James Gosling");
        BOOK book2 = new BOOK(102, "Data Structures", "Mark Allen");
        BOOK book3 = new BOOK(103, "DBMS", "Korth");

        do {

            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("1. Display All Books");
            System.out.println("2. Issue Book");
            System.out.println("3. Return Book");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.println("\n--- Book 1 ---");
                    book1.displayBOOKdetails();

                    System.out.println("--- Book 2 ---");
                    book2.displayBOOKdetails();

                    System.out.println("--- Book 3 ---");
                    book3.displayBOOKdetails();

                    break;

                case 2:

                    System.out.print("Enter Book ID to issue: ");
                    int iid = sc.nextInt();

                    if (iid == book1.id) {
                        book1.issuebook();
                    }
                    else if (iid == book2.id) {
                        book2.issuebook();
                    }
                    else if (iid == book3.id) {
                        book3.issuebook();
                    }
                    else {
                        System.out.println("Book not found.");
                    }

                    break;

                case 3:

                    System.out.print("Enter Book ID to return: ");
                    int rid = sc.nextInt();

                    if (rid == book1.id) {
                        book1.returnbook();
                    }
                    else if (rid == book2.id) {
                        book2.returnbook();
                    }
                    else if (rid == book3.id) {
                        book3.returnbook();
                    }
                    else {
                        System.out.println("Book not found.");
                    }

                    break;

                case 4:

                    System.out.println("Bye bye student!");
                    break;

                default:

                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);

        sc.close();
    }
}
