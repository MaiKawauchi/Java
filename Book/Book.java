public class Book{
    private String ISBN;
    public Book(String ISBN){
        this.ISBN = ISBN;
    }
    public String getISBN(){return ISBN;}
    public static void main(String[] args){
        Book firstBook = new Book("0201914670");
        Book secondBook = firstBook;
        Book otherBook = new Book("0201914670");

        if(firstBook.equals(secondBook)){
            System.out.println("first and second Books are equal");
        }
        if(otherBook.equals(firstBook)){
            System.out.println("first and other  Books are equal");
        }
    }
}
