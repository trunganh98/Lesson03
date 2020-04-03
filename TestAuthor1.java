package Buoi6;

public class TestAuthor1 {
    public static void main(String[] args) {
        Author1 codeLean = new Author1("Code Lean", "codelean@gmail.com", 'm');
        System.out.println(codeLean);
        codeLean.setEmail("codelean@gmail.com");
        System.out.println("name is: " + codeLean.getName());
        System.out.println("email is: " + codeLean.getEmail());
        System.out.println("gender is: " + codeLean.getGender());
    }
}
