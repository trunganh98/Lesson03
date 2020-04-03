package Buoi5;

public class CodeLeanD extends CodeLeanB {
    public static void main(String[] args) {
        new CodeLeanB().methodPublic();
        new CodeLeanB().methodProtected();

        new CodeLeanD().methodProtected();
    }

}
