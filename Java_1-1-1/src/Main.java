public class Main {
    public static void main(String[] args) {

        int bonus;
        int startMoney = 500;
        int replenishment = 1500;

        if (replenishment >= 1000) {
            bonus = (replenishment / 100);
        } else {
            bonus = 0;
        }
        int exitMoney = startMoney + replenishment + bonus;
        System.out.println("На счету клиента: " + exitMoney);


    }
}