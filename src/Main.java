public class Main {
    public static void main(String[] args) {
        System.out.println("Changed in main");
        methodUser1();
        methodUser11();
    }
    public static void methodUser1() {
        System.out.println("Method from User1(Vitaliy)");
    }
    public static void methodUser11() {
        int randomNumber = (int)(Math.random() * 100);

        System.out.println("Another one method from User1 (Vitaliy)");
        System.out.println("–°–ª—É—á–∞–π–Ω–æ–µ —á–∏—Å–ª–æ: " + randomNumber);
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

    System.out.println("–ß–∏—Å–ª–æ " + number + (isPrime ? " –ø—Ä–æ—Å—Ç–æ–µ" : " –Ω–µ –ø—Ä–æ—Å—Ç–æ–µ"));
}
    public static void methodUser3() {  
    System.out.println("Method from User3 (Julia)");
    int randomValue = (int) (Math.random() * 50) + 1;  
    System.out.println("—ÎÛ˜‡ÈÌÓÂ ˜ËÒÎÓ: " + randomValue + "ÃˇÛ ÏˇÛ - ˇ ÒÚÛ‰ÂÌÚ Õ»ﬂﬂﬂ”");
}

}