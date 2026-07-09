import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<LibraryItem> items;

    public Library(){
        this.items = new ArrayList<>();
    }

    public void addItem(LibraryItem item){
        items.add(item);
        System.out.println(item.getTitle() + " has been added to the library.");
    }

    public void listItems() {
        if (items.isEmpty()){
            System.out.println("There are no items in the library.");
        }else{
            for (LibraryItem item : items){
                item.printInfo();
            }
        }
    }

    public LibraryItem findById(int id){
        for (LibraryItem item : items){
            if (item.getId() == id){
                return item;
            }
        }
        return null;
    }

    public void borrowById(int id){
        LibraryItem item = findById(id);

        if (item == null){
            System.out.println("No item found with the ID: " + id);
        }else{
            item.borrow();
        }
    }

    public void returnItemById(int id){
        LibraryItem item = findById(id);

        if (item == null){
            System.out.println("No item found with the ID: " + id);
        }else{
            item.returnBorrowed();
        }

    }
}
