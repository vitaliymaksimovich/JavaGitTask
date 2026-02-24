public class Main {
    public static void main(String[] args) {
        System.out.println("Start project");
        methodUser1();
        methodUser11();
    }
    public static void methodUser1() {
        System.out.println("Method from User1(Vitaliy)");
    }
    public static void methodUser11() {
        int randomNumber = (int)(Math.random() * 100); // число от 0 до 99

        System.out.println("Another one method from User1 (Vitaliy)");
        System.out.println("Случайное число: " + randomNumber);
    }
}