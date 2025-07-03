package bookshelf_datastructure;

import java.util.ArrayList;

public class BookShelf<String> {
    private ArrayList<String> lists;

    public BookShelf() {
        lists = new ArrayList<>();
    }

    public void addBook(String item) {
        lists.add(item);
    }

    public void removeBook() {
        lists.remove(size()-1);
    }
    public int size() {
        return lists.size();
    }
}
