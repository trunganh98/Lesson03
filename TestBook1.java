package Buoi6;

public class TestBook1 {
    public static void main(String[] args) {
        Author1 codeLean = new Author1("Code Lean", "codelean@gmail.com", 'f');
        System.out.println(codeLean);

        Book1 dummyBook = new Book1("Java for dummy", codeLean, 19.95, 99);
        System.out.println(dummyBook);

        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is: " + dummyBook.getName());
        System.out.println("price is: " + dummyBook.getPrice());
        System.out.println("qty is: " + dummyBook.getQty());
        System.out.println("author is: " + dummyBook.getAuthor());
        System.out.println("Author's name is: " + dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());

        Book1 anotherBook = new Book1("more Java", new Author1("Dang Kim Thi", "dangkimthi@gmail.com", 'f'), 29.95);
        System.out.println(anotherBook);
    }
}
