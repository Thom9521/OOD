package thom9521;

public class Book {

    // private instance variable, not accessible from outside this class
    private String name;
    private Author[] authors;
    private double price;
    private int qty = 0;

    // Default constructor, with arguements.
    // Constructor to construct a new instance of Author with the given name, email and gender.
    public Book(String name, thom9521.Author[] authors, double price) {

        this.name = name;
        this.authors= authors;
        this.price = price;
    }

    public Book(String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    public String getName(){
        return this.name;
    }

    public thom9521.Author[] getAuthors() {
        return this.authors;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty(){
        return this.qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String toString() {
        return "Book[name= " +name + ", "+  authors + "  price="+ price +
                ", qty = " + qty;
    }

    public thom9521.Author[] getAuthorNames(){
        return this.authors;
    }
}