import java.util.Scanner;

class Book {
    String name;
    String author;
    double price;
    int noPages;

    Book(String name, String author, double price, int noPages) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.noPages = noPages;
    }

    String getName() {
        return name;
    }

    String getAuthor() {
        return author;
    }

    double getPrice() {
        return price;
    }

    int getNoPages() {
        return noPages;
    }

    void setName(String name) {
        this.name = name;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setPrice(double price) {
        this.price = price;
    }

    void setNoPages(int noPages) {
        this.noPages = noPages;
    }

    public String toString() {
        return "Name: " + name + ", Author: " + author + ", Price: " + price + ", No of Pages: " + noPages;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of books:");
        int n = sc.nextInt();
        Book[] books = new Book[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details for book " + (i + 1) + ":");
            System.out.println("Enter name:");
            String name = sc.next();
            System.out.println("Enter author:");
            String author = sc.next();
            System.out.println("Enter price:");
            double price = sc.nextDouble();
            System.out.println("Enter no of pages:");
            int noPages = sc.nextInt();
            books[i] = new Book(name, author, price, noPages);
        }
        for (int i = 0; i < n; i++) {
            System.out.println("Details of book " + (i + 1) + ":");
            System.out.println(books[i].toString());
        }
    }
}
