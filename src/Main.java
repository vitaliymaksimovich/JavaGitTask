public class Main {
    public static void main(String[] args) {
        System.out.println("Start the project");
        methodUser1();
        methodUser11();
    }
    public static void methodUser1() {
        System.out.println("Method from User1(Vitaliy)");
    }
    public static void methodUser11() {
        int randomNumber = (int)(Math.random() * 100);

        System.out.println("Another one method from User1 (Vitaliy)");
        System.out.println("Случайное число: " + randomNumber);
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