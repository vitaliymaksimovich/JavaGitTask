public class Main {
    public static void main(String[] args) {
        System.out.println("Start project");
        methodUser1();
    }
    public static void methodUser1() {
        System.out.println("Method from User1");
    }
    
    public static void methodUser2() {
    int number = 29;
    boolean isPrime = true;

    for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
            isPrime = false;
            break;
        }
    }

    System.out.println("Число " + number + (isPrime ? " простое" : " не простое"));
}
}