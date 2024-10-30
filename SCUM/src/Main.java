public class Main {
    public static void main(String[] args) {

        Machine machine = new Machine();
        int result = machine.execute((n)-> n * 2, 5);


        System.out.println("Result of the MonoOperator is: " + result);
        System.out.println("Result of the MonoOperator is: ");
        System.out.println("Result of the BiOperator is: ");
    }
}
