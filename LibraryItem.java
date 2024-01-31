import java.util.Date;

public class LibraryItem {
    private int borrowCount;

    public LibraryItem() {
        borrowCount = 0;
    }

    public void checkout() {
        borrowCount++;
        System.out.println("Borrowed an item from the library.");
    }

    public int getBorrowCount() {
        return borrowCount;
    }

    public static void main(String[] args) {
        // Date today = new Date();
        // System.out.println("Date: " + today);
        // DVD cd1=new DVD();
        // cd1.checkout();
        LibraryItem l1=new LibraryItem();
        l1.checkout();

    }
}

class Book extends LibraryItem {
    int daysToReturn = 14;

    @Override
    public void checkout() {
        super.checkout();
        System.out.println("Borrowed a book for " + daysToReturn + " days.");
    }
}

class DVD extends LibraryItem {
    int daysToReturn = 7;

    @Override
    public void checkout() {
        super.checkout();
        System.out.println("Borrowed a DVD for " + daysToReturn + " days.");
    }
}
