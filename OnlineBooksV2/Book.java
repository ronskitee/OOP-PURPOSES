public class Book extends Product {

    private String bookIsbn;
    private int totalPages;

    public Book(int id, String name, String writer, double cost,
                String publisher, int quantity, String bookIsbn, int totalPages) {

        super(id, name, writer, cost, publisher, quantity);

        this.bookIsbn = bookIsbn;
        this.totalPages = totalPages;
    }

    public String getBookIsbn() {
        return bookIsbn;
    }

    public void setBookIsbn(String bookIsbn) {
        this.bookIsbn = bookIsbn;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public void shipBook() {
        System.out.println("Your book is ready for shipping.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();

        System.out.println("ISBN: " + bookIsbn);
        System.out.println("Pages: " + totalPages);
    }
}