public class Main {
    public static void main(String[] args) {
        int dengi = 100;
        int popoln = 1100;
        int bonus;

        if (popoln > 1000) {
            bonus = popoln / 100;
        } else {
            bonus = 0;
        }

        int balanc = dengi + popoln + bonus;
        System.out.println("Ваш баланс: " + balanc + " руб. Ваш бонус: " + bonus + " руб.");
    }
}
