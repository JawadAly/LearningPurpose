import java.util.ArrayList;
public class Library_System {
    public static String libName = "BUKC Library";
    private ArrayList<User> users = new ArrayList();
    private ArrayList<Book> books = new ArrayList();
    public void  adduser(User user){
        this.users.add(user);
        System.out.println(user.getName()+"successfully added to Library.");
    }
    public void addBook(Book book){
        this.books.add(book);
        System.out.println(book.getTitle()+"successfully added to Library collection.");
    }
    public Boolean borrowBook(User user,Book book){
        book.setBookBorrower(user);
        book.reduceCopies();
        book.setStatus("Borrowed");
        return true;
    }
    public void returnBook(Book book){
        book.increaseCopies();
        book.setStatus("Returned");
    }
    public void getAvailableBooks(){
        if(books.size() == 0){
            System.out.println("No book availavle in collection please add some of them");
        }
        else{
            for(int i = 0;i < books.size();i++){
                System.out.println(books.get(i).getTitle());
            }
        }
    }
}
