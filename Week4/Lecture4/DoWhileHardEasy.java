public class DoWhileHardEasy {
    public static void main(String[] args) {
        int i = 1;
        do { // the first time IT SHOULD RUNNNNNNNNN
            if(i % 2 == 0){
                System.out.println("even");
            }else{
                System.out.println("odd");
            }
        }while (i < 1);
    }
}
