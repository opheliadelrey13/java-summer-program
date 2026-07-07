public abstract class LibraryItem implements Borrowable {
    private int id;
    private String title;
    private boolean borrowed;

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public LibraryItem(int id, String title){
        this.id = id;
        this.title = title;
        this.borrowed = false;
    }

    @Override
    public void borrow() {
        if (!borrowed){
            borrowed = true;
            System.out.println(title + " has been borrowed.");
        }else{
            System.out.println(title + " is already borrowed.");
        }
    }

    @Override
    public void returnBorrowed() {
        if (borrowed){
            borrowed = false;
            System.out.println(title + " has been returned.");
        }else{
            System.out.println(title + " was not borrowed.");
        }
    }

    public abstract void printInfo();
}
