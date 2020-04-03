package Buoi6;

public class TestBook2 {
    public static void main(String[] args) {
        Author1[] author1s = new Author1[2];
        author1s[0] = new Author1("Tan Ah Teck", "AhTeck@somewhere.com", 'm');
        author1s[1] = new Author1("Paul Tan", "Paul@nowhere.com", 'm');

        Book2 javaDummy = new Book2("Java for Dummy", author1s, 19.99, 99);
        System.out.println(javaDummy);
    }
}
