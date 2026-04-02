///c. Determine whether a character is a capital letter.

public class Question1 {
    public static void main(String[] args) {
        char c = 'T';
        if (c >= 'A' && c <= 'Z'){
            System.out.println("Capital letter");
        }else {
            System.out.println("Not capital letter");
        }
    }
}
