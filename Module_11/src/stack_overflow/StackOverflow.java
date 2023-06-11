package stack_overflow;

public class StackOverflow {

    private int a;
    public void overflow(){
        a++;
        overflow();
      //  System.out.println();
    }

    public static void main(String[] args) {

        StackOverflow stackOverflow = new StackOverflow();
        stackOverflow.overflow();

    }

}
