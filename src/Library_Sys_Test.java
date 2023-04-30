public class Library_Sys_Test {
    public static void main(String[] args) {
        User ali = new User(1,"Muhammad Ali");
        Book dedSea = new Book(1234,"Ded Sea","John Abraham","Available",12);
        Book blackSmith = new Book(1222,"Black Smith","John Carlous","Available",16);
        Book itGoes = new Book(1333,"It Goes","Wick Shells","Available",6);
        Library_System s1 = new Library_System();
        s1.adduser(ali);
        s1.addBook(dedSea);
        s1.addBook(blackSmith);
        s1.addBook(itGoes);
//        s1.getAvailableBooks();
        System.out.println(blackSmith.getBookCopies());
        System.out.println(blackSmith.getStatus());
        System.out.println(blackSmith.getBookBorrower());
        s1.borrowBook(ali,blackSmith);
        System.out.println(blackSmith.getBookCopies());
        System.out.println(blackSmith.getStatus());
        System.out.println(blackSmith.getBookBorrower().getName());

    }
}
