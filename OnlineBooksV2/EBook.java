public class EBook extends Product implements Downloadable {

    private String file;
    private double size;
    private String link;

    public EBook(int id, String name, String writer, double cost,
                 String publisher, int quantity, String file,
                 double size, String link) {

        super(id, name, writer, cost, publisher, quantity);

        this.file = file;
        this.size = size;
        this.link = link;
    }

    @Override
    public void download() {
        System.out.println("Downloading " + file + "...");
    }

    @Override
    public void displayDetails() {
        super.displayDetails();

        System.out.println("File: " + file);
        System.out.println("Size: " + size + " MB");
        System.out.println("Link: " + link);
    }
}