public class Main {
    public static void main(String[] args) {
        int currentBalance = 100; // начальный банс
        int payment = 1001; // платёж
        int bonus;
        int total;
        if (payment > 1000) {
            bonus = payment / 100;
        } else {
            bonus = 0;
        }
       total = currentBalance + payment + bonus;

        System.out.println("Начальный баланс: "+currentBalance+"\n"+"Платёж: "+payment+"\n"+"Бонус: "+bonus+"\n"+"Итог: "+total);
    }
}