import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    private static int nextId = 1;
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();

        int choice = 0;

        while (choice != 6){
            menu();
            choice = readInt(scanner, "Choose an option: ");

            switch (choice) {
                case 1:
                    addBook(scanner, library);
                    break;
                case 2:
                    addMagazine(scanner,library);

                case 3:
                    library.listItems();
                    break;
                case 4:
                    borrowItem(scanner,library);
                    break;
                case 5:
                    returnItem(scanner,library);
                    break;
                case 6:
                    System.out.println("Exiting from the program...");
                    break;
                default:
                    System.out.println("Invalid option.Please choose between 1 and 6");
                    
            }
            System.out.println();
        }
        scanner.close();

    }

    public static void addBook(Scanner scanner, Library library) {
        scanner.nextLine();

        System.out.print("Book title: ");
        String title = scanner.nextLine();

        System.out.print("Author: ");
        String author = scanner.nextLine();

        int pageCount = readInt(scanner, "Page count: ");

        Book book = new Book(nextId, title, author, pageCount);
        nextId++;

        library.addItem(book);
    }

    public static void addMagazine(Scanner scanner, Library library) {
        scanner.nextLine();

        System.out.print("Magazine title: ");
        String title = scanner.nextLine();

        int issueNumber = readInt(scanner, "Issue number: ");

        Magazine magazine = new Magazine(nextId, title, issueNumber);
        nextId++;

        library.addItem(magazine);
    }

    public static void borrowItem(Scanner scanner, Library library) {
        int id = readInt(scanner, "Enter item ID to borrow: ");
        library.borrowById(id);
    }

    public static void returnItem(Scanner scanner, Library library) {
        int id = readInt(scanner, "Enter item ID to return: ");
        library.returnItemById(id);
    }

    private static int readInt(Scanner scanner,String massage) {
        while (true){
            try{
                System.out.print(massage);
                return scanner.nextInt();
            }catch(InputMismatchException e) {
                System.out.println("Invalid input.Please enter an integer.");
                scanner.nextLine();
            }
        }

    }

    private static void menu() {

        System.out.println("----- LIBRARY MANAGEMENT SYSTEM -----");
        System.out.println("1- Add book");
        System.out.println("2- Add magazine");
        System.out.println("3- List items");
        System.out.println("4- Borrow item");
        System.out.println("5- Return item");
        System.out.println("6- Exit");

    }


}
