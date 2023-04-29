public class Book {
    private int isbn;
    private String title;
    private String author;
    private String status;
    private User bookBorrower;
    private int bookCopies;
    public int getBookCopies() {
        return bookCopies;
    }
    public void setBookCopies(int bookCopies) {
        this.bookCopies = bookCopies;
    }
    public void reduceCopies(){
        this.bookCopies-= 1;
    }
    public void increaseCopies(){
        this.bookCopies+= 1;
    }
    public User getBookBorrower() {
        return bookBorrower;
    }
    public void setBookBorrower(User bookBorrower) {
        this.bookBorrower = bookBorrower;
    }
    public Book(){
        this.isbn = 0;
        this.title = "Nill";
        this.author = "Nill";
        this.status = "Nill";
        this.bookCopies = 0;
    }
    public Book(int isbn,String title,String author,String status,int copies){
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.status = status;
        this.bookCopies = copies;
    }
    public void showBook(){
        System.out.println("ISBN : "+this.isbn);
        System.out.println("Title : "+this.title);
        System.out.println("Author : "+this.author);
        System.out.println("Status : "+this.status);
        System.out.println("Copies : "+this.bookCopies);
    }
    public int getIsbn() {
        return isbn;
    }
    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
}
