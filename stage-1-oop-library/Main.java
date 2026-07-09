public class Main {
    static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book(1,"1984","George Orwell",328);
        Book book2 = new Book(2, "Crime and Punishment", "Dostoevsky", 671);
        Magazine magazine1 = new Magazine(3,"Science Monthly",45);

        library.addItem(book1);
        library.addItem(book2);
        library.addItem(magazine1);


        System.out.println();
        library.listItems();

        System.out.println();
        library.borrowById(1);

        System.out.println();
        library.listItems();

        System.out.println();
        library.returnItemById(1);

        System.out.println();
        library.listItems();






    }




}
