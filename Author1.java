package Buoi6;

public class Author1 {
    private String name;
    private String email;
    private char gender;    // 'm' or 'f'

    public Author1(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return "Author1[name = "+name+", "+"email = "+email+", "+"gender = "+gender+"]";
    }
}
