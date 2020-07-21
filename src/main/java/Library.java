import java.util.ArrayList;

public class Library {
    private ArrayList<Book> stock;
    private int capacity;

    public Library(int capacity){
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
    }

    public int checkStock(){
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (this.checkStock() < this.capacity)
        this.stock.add(book);
    }

}
