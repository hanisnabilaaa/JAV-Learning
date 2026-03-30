public class doWhile {
    public static void main(String[] args) {
        // executes the body of the loop at least once and perform condition check
        // good for error management
        int number = 1, sum = 0;
        do {
            sum += number;
            System.out.println(number);
            number ++;
        } while (number <= 5);

        boolean status = true;
        do {
            System.out.println(status); // it will print out this unless the while is wrong
        } while (status == false);
    }
}
