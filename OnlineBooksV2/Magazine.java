public class Magazine extends Product {

    private int issueNumber;
    private String publishDate;

    public Magazine(int id, String name, String writer, double cost,
                    String publisher, int quantity, int issueNumber, String publishDate) {

        super(id, name, writer, cost, publisher, quantity);

        this.issueNumber = issueNumber;
        this.publishDate = publishDate;
    }

    public void shipMagazine() {
        System.out.println("Your magazine is ready for shipping.");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();

        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Release Date: " + publishDate);
    }
}