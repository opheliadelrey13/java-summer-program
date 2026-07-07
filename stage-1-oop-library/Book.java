public class Book extends LibraryItem {
    private String author;
    private int pageCount;

    public Book(int id,String title,String author,int pageCount){
        super(id, title);
        this.author = author;
        this.pageCount = pageCount;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthor() {
        return author;
    }

    public void printInfo(){
        String status = isBorrowed() ? "Borrowed" : "Available";
        System.out.println("BOOK ID: " + getId()
                + " | TITLE: " + getTitle()
                + " | AUTHOR: " + getAuthor()
                + " | PAGES: " + getPageCount()
                + " | STATUS: " + status);
    }
}
